package nablarch.tool.openapi.codegen.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;

/**
 * Generatorのテストで使うアサーションのヘルパークラス。
 */
public class GeneratorAssertions {
    /**
     * Generatorにより生成されたファイルのうち、Javaソースコードの構文が正しいことを確認する。
     *
     * @param files Generatorにより生成されたファイル
     */
    public static void assertValidJavaSourceSyntax(List<File> files) {
        files.forEach(f -> {
                    if (f.getName().endsWith(".java")) {
                        String fileContents = "";
                        try {
                            fileContents = Files.readString(f.toPath());
                        } catch (IOException ignored) {

                        }
                        assertValidJavaSourceCode(fileContents);
                    }
                }
        );
    }

    /**
     * 指定されたJavaソースコード（文字列）が正しい構文であることを確認する。
     *
     * @param javaSourceCode Javaソースコード（文字列）
     */
    private static void assertValidJavaSourceCode(String javaSourceCode) {
        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_17);
        JavaParser parser = new JavaParser(config);
        ParseResult<CompilationUnit> parseResult = parser.parse(javaSourceCode);
        assertTrue(String.valueOf(parseResult.getProblems()), parseResult.isSuccessful());
    }

    /**
     * 生成されたファイルと、期待するファイルパスのリストを比較して、生成されたファイルと期待値が一致することを確認する。
     * <p>
     * Generatorにより生成されるファイルの過不足を確認する。
     *
     * @param output         ファイルの出力先ディレクトリ
     * @param generatedFiles 生成されたファイル
     * @param expectedFiles  期待するファイルパスのリスト
     */
    public static void assertExistsFiles(File output, List<File> generatedFiles, String... expectedFiles) {
        List<String> generatedFilePaths =
                generatedFiles
                        .stream()
                        .map(f -> output.toPath().toAbsolutePath().relativize(f.toPath()).toString())
                        .sorted()
                        .toList();

        List<String> expectedFilePaths = Arrays.stream(expectedFiles).map(Path::of).map(Path::toString).sorted().toList();

        assertEquals(expectedFilePaths, generatedFilePaths);
    }

    /**
     * Generatorにより生成されたファイルと期待値のファイルの内容を比較して、内容が一致することを確認する。
     * <p>
     * タイムスタンプのように生成する度に異なる内容もあるので、比較の際に無視するパターンを指定可能とする。
     *
     * @param generatedFile  Generatorにより生成されたファイル
     * @param expectedFile   期待値のファイル
     * @param ignorePatterns 期待値と生成されたファイルの内容を比較する際に無視するパターン
     */
    public static void assertEqualsFileContents(File generatedFile, File expectedFile, String... ignorePatterns) {
        try {
            List<String> generatedContents = Files.readAllLines(generatedFile.toPath(), StandardCharsets.UTF_8);
            List<String> expectedContents = Files.readAllLines(expectedFile.toPath(), StandardCharsets.UTF_8);

            for (int i = 0; i < expectedContents.size(); i++) {
                String expectedLine = expectedContents.get(i);
                String generatedLine = generatedContents.get(i);

                boolean ignoreLine = false;

                for (String ignorePattern : ignorePatterns) {
                    Pattern pattern = Pattern.compile(ignorePattern);

                    if (pattern.matcher(expectedLine).find() && pattern.matcher(generatedLine).find()) {
                        ignoreLine = true;
                        break;
                    }
                }

                if (!ignoreLine) {
                    assertEquals(expectedLine, generatedLine);
                }
            }

            assertEquals(String.format("generated: %s, expected: %s", generatedFile, expectedFile), expectedContents.size(), generatedContents.size());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * 指定されたファイルに、指定された正規表現パターンが含まれていることを確認する。特定の文字列が生成されたファイルに含まれているか
     * 確認したい時に使用する。
     *
     * @param actualFile 確認対象のファイル
     * @param patterns   正規表現パターン
     */
    public static void assertContainsPatterns(File actualFile, String... patterns) {
        try {
            List<String> actualContents = Files.readAllLines(actualFile.toPath(), StandardCharsets.UTF_8);

            List<Pattern> compiledPattens = new ArrayList<>(Arrays.stream(patterns).map(Pattern::compile).toList());

            for (String line : actualContents) {
                List<Pattern> foundPatterns = new ArrayList<>();

                for (Pattern p : compiledPattens) {
                    if (p.matcher(line).find()) {
                        foundPatterns.add(p);
                    }
                }

                compiledPattens.removeAll(foundPatterns);
            }

            assertTrue(String.format("%s does not contain %s", actualFile, compiledPattens), compiledPattens.isEmpty());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * 指定されたファイルに、指定された正規表現パターンが含まれていないことを確認する。特定の文字列が生成されたファイルに含まれていないことを
     * 確認したい時に使用する。
     *
     * @param actualFile 確認対象のファイル
     * @param patterns   正規表現パターン
     */
    public static void assertNotContainsPatterns(File actualFile, String... patterns) {
        try {
            List<String> actualContents = Files.readAllLines(actualFile.toPath(), StandardCharsets.UTF_8);

            List<Pattern> compiledPattens = Arrays.stream(patterns).map(Pattern::compile).toList();

            for (String line : actualContents) {
                for (Pattern p : compiledPattens) {
                    assertFalse(String.format("%s contains %s", actualFile, p), p.matcher(line).find());
                }
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
