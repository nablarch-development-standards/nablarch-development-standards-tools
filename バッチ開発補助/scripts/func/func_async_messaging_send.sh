#!/bin/sh

####################################################################################
#  Script name  : func_async_messaging_send.sh
#  Description  : メッセージ無応答・ディレード処理（仕向け）プログラムを実行する
#  Server type  : MQ Server
#  User         : mquser
#  Usage        : func_async_messaging_send.sh JOB_ID REQUEST_PATH USER_ID MESSAGE_REQUEST_ID [PARAM_MAP_ENTRY]... [PARAM_LIST_ITEM]...
#                     JOB_ID
#                       ジョブID
#                     REQUEST_PATH
#                       リクエストパス
#                     USER_ID
#                       ユーザID
#                     MESSAGE_REQUESET_ID
#                       メッセージリクエストID
#                     PARAM_MAP_ENTRY
#                       Mainクラス引数に渡されるMap形式のバッチ引数。
#                       次の形式であること。
#                         "-" + <キー名> + " " + <バリュー値>
#                     PARAM_LIST_ITEM
#                       Mainクラス引数に渡されるバッチ引数のList要素。
#                       記述した順序はMainクラスに渡す際に保持される。
#  Date         : 2011/12/1
#  Returns      : 0   正常終了
####################################################################################

### シェルスクリプト共通設定ファイルの読込 ###
. "${COMMON_CONF_DIR}"/common.sh

### ディレクトリ情報読み込み ###
. "${COMMON_CONF_DIR}"/batch_dir.config

### JAVA実行情報読み込み ###
. "${COMMON_CONF_DIR}"/java_env.config

### JAVA実行共通関数読み込み ###
. "${COMMON_DIR}"/func/conf/func_java_common.sh

####################################################################################
# スクリプト本文
####################################################################################

### 処理開始ログの出力 ###
LOG_MSG "PARAMETER = [${INP_NAB_OPT} ${*}]"

### 引数情報を取得 ###
JOB_ID=${1}
shift
REQ_PATH=${1}
shift
USER_ID=${1}
shift
MSG_REQ_ID=${1}
shift

### 障害監視用オプション取得
MNT_REQ_ID="-Dmonitor-request-id=${JOB_ID}"

### 多重起動チェック
DUPLICATE_PROCESS_CHECK "${JOB_ID}"

### プロセス毎にコピーする必要があるJARをジョブ管理システム配下にコピーする。 ###
RUN_LIB_OUT_DIR=${RUN_LIB_OUT}/${JOB_ID}
DELETE_DIR "${RUN_LIB_OUT_DIR}"
COPY_RUN_JARS "${RUN_LIB_OUT_DIR}"

### クラスパスを設定する変数 ###
SET_RUNTIME_CLASSPATH "${RUN_LIB_OUT_DIR}"

### 実行オプションの生成 ###
NAB_OPT="-classpath ${RUNTIME_CLASSPATH} ${ASYNC_MSG_SND_OPT} ${INP_NAB_OPT} "

### 起動プロセス設定 ###
NAB_OPT="${NAB_OPT} -Dnablarch.bootProcess=${JOB_ID} "

### アプリケーションログファイル名を設定 ###
NAB_OPT=${NAB_OPT}"-Dwriter.appFile.filePath=${APP_LOG_DIR}/${JOB_ID}_app.log "
NAB_OPT=${NAB_OPT}"-Dwriter.monitorFile.filePath=${MNT_LOG_DIR}/${JOB_ID}_monitor.log "
NAB_OPT=${NAB_OPT}"-Dwriter.MESSAGING_CSV.filePath=${MSG_CSV_LOG_DIR}/${JOB_ID}_messaging_csv.log "

### Mainクラス引数を設定 ###
MAIN_ARGS="-diConfig ${ASYNC_MSG_SND_DI_CONF}"
MAIN_ARGS="${MAIN_ARGS} -requestPath ${REQ_PATH}"
MAIN_ARGS="${MAIN_ARGS} -userId ${USER_ID}"
MAIN_ARGS="${MAIN_ARGS} -messageRequestId ${MSG_REQ_ID}"

### バッチ実行 ###
eval "${JAVA_HOME_PATH}"/bin/java "${MNT_REQ_ID}" "${NAB_OPT}" "${MAIN}" "${MAIN_ARGS}" "$*" &

### 処理終了ログの出力 ###
EXIT_CODE=${?}
LOG_MSG "EXIT_CODE = [${EXIT_CODE}]"

exit ${EXIT_CODE}

