# Changelog

このプロジェクトに対するすべての重要な変更は、このファイルに文書化されます。

## [1.3] - 2024-09-30
### 更新内容
#### 変更
- Nablarch6系でJSP静的解析ツールがJakarta Server Pages静的解析ツールに名称変更となったため、記載を修正しました。
- Nablarch6系で業務画面JSP検証ツールが削除されたことに伴い、記載を削除しました。

## [1.2] - 2023-03-24
### 更新内容
#### 変更
- Shell Script自動生成ツールが生成するシェルスクリプトやscripts.zipに含まれるシェルスクリプトについて、[ShellCheck](https://www.shellcheck.net/)による警告が出ないように修正しました。
- Shell Script自動生成ツールのファイル受信バッチについて、授受先ディレクトリが存在しなかった場合の戻り値がDescriptionやログでは113を返却すると記載されているのに実際は112を返していた不具合を修正しました。

## [1.1] - 2021-10-31
### 更新内容
#### 変更
- 設計ドキュメントとして提供しているJSON, XML用の外部インターフェース設計書フォーマットとサンプルに対する以下の変更に追従させるため、フォーマット定義ファイル自動生成ツールを修正しました。
  - 旧形式ではオブジェクトの階層構造を表すための項目は、項目IDを [　 ]で囲むという記述ルールとなっており、一つの表でフラットに表現されるため視認性にかけていました。 新形式では階層別に表を分けることにより、一目でわかる形式としました。
  - レコード定義に桁数の記載場所がなかったため桁数カラムを追加しました。

## [1.0-en] - 2020-08-14
### 更新内容
#### 追加
- 英語版を新規公開
  - 日本語版バージョン1.0の内容をもとに作成。公開対象は一部のコンテンツのみ。


## [1.0] - 2018-10-09
### 更新内容
- 初版公開

