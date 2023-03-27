# 目次

- [開発プロセス支援ツールについて](#開発プロセス支援ツールについて)
- [当リポジトリで管理しているツールについて](#当リポジトリで管理しているツールについて)
- [当リポジトリ外で管理されているツールについて](#当リポジトリ外で管理されているツールについて)

# 開発プロセス支援ツールについて

Nablarch開発プロセスを支援するツール群です。
解説ドキュメントが用意されていないツールについては、ダウンロードしたExcel内に解説が記述されています。

設計ドキュメントを入出力にして動作する開発プロセス支援ツールを使用する場合、
開発プロセス支援ツールと設計ドキュメントは同一バージョンのNablarchに同梱されたものを使用してください。

# 当リポジトリで管理しているツールについて

## バッチ開発補助

* [Shell Script自動生成ツール](バッチ開発補助/シェルスクリプト自動生成ツール.xlsm)

    ジョブスケジューラから起動されるShell Scriptと環境依存項目を設定したファイルを自動生成します。

## 登録用データ作成

* [コードテーブル登録用データ出力ツール](登録用データ作成/コードテーブル登録用データ出力ツール.xlsm)

    コード設計書からコードテーブルに登録するマスタデータのテーブル投入用CSVファイルを自動生成します。


* [メッセージテーブル登録用データ作成ツール](登録用データ作成/メッセージテーブル登録用データ作成ツール.xlsm)

    メッセージ設計書からメッセージテーブルに登録するマスタデータのテーブル投入用CSVファイルを自動生成します。


* [リクエストテーブル登録用データ作成ツール](登録用データ作成/リクエストテーブル登録用データ作成ツール.xlsm)

    リクエストID一覧からリクエストテーブルに登録するマスタデータのテーブル投入用CSVファイルを自動生成します。

## 外部インタフェース設計関連

* [フォーマット定義ファイル自動生成ツール](外部インタフェース設計関連/フォーマット定義ファイル自動生成ツール.xlsm)

    外部インタフェース設計書から、FWが使用するフォーマット定義ファイルを自動生成します。

## DB設計関連

* [テーブル定義書ドメイン定義書 整合性チェックツール](DB設計関連/テーブル定義書_ドメイン定義書_整合性チェックツール.xlsm)

    テーブル定義書記載のドメインがドメイン定義書に定義されていることや、桁数、データ型の整合性をチェックします。


* [テーブル定義書出力手順](DB設計関連/テーブル定義書出力手順.xls)

    ObjectBrowserのレポート出力機能を使ってテーブル定義書を出力する手順を説明したドキュメントです。


* [排他制御主キークラス自動生成ツール](DB設計関連/排他制御主キークラス自動生成ツール.xlsm)

    テーブル定義書を基に排他制御主キークラスを自動生成します。
    
    なお、本ツールを使用するには、[物理型・Javaオブジェクトマッピング定義](DB設計関連/物理型・Javaオブジェクトマッピング定義.xls)が必要です。


* [ドメインクラス自動生成ツール](DB設計関連/ドメインクラス作成ツール.xlsm)

    ドメイン定義書を基にドメイン設定Javaクラスファイルを自動生成します。

## 当リポジトリ外で管理されているツールについて

### Mavenリポジトリで管理しているもの

* JSP静的解析ツール

    [Nablarch Testing](https://mvnrepository.com/artifact/com.nablarch.framework/nablarch-testing)に同梱
    
    [ツールのガイド](https://nablarch.github.io/docs/LATEST/doc/development_tools/toolbox/JspStaticAnalysis/index.html)
  

* gsp-dba-maven-plugin

    DBAのルーチンワークを自動化し、本来のデータモデリング作業に 集中できるようにするためのツールです。
    [coastland/gsp-dba-maven-plugin](https://github.com/coastland/gsp-dba-maven-plugin)

### GitHubで管理しているもの

* Nablarch sql-executor

    Nablarch特殊構文を含むSQLファイルを対話的に実行するツールです。
    [nablarch/sql-executor](https://github.com/nablarch/sql-executor)
    
    [ツールのガイド](https://nablarch.github.io/docs/LATEST/doc/development_tools/toolbox/SqlExecutor/SqlExecutor.html)
  
* 業務画面JSP検証ツール

    業務画面JSPの検証を行うツールです。
    [nablarch/nablarch-toolbox](https://github.com/nablarch/nablarch-toolbox)
    
    [ツールのガイド](https://nablarch.github.io/docs/LATEST/doc/development_tools/toolbox/JspVerifier/JspVerifier.html)



## ライセンス
この作品は、Apache License 2.0 で提供されます。
Apache License 2.0 の詳細については、[LICENSE.txt](./LICENSE.txt)を参照してください。
