####################################################################################
#  File name    : func_java_common.sh
#  Description  : Java実行用シェルで共通的に使用する変数・関数を定義する。
#  Date         : 2011/12/1
####################################################################################


###################################################
# 関数定義
###################################################

###################################################
# Function      : SET_RUNTIME_CLASSPATH
# Description   : クラスパスを環境変数RUNTIME_CLASSPATHに設定する。
#                 呼び出し元シェルでRUN_LIB_PATH変数とLIB_PATH変数を定義した
#                 設定ファイルを読み込んでおくこと。
# Usage         : SET_RUNTIME_CLASSPATH RUN_LIB_OUT_DIR
#                    RUN_LIB_OUT_DIR
#                      プロセス毎にコピーしたJARのコピー先ディレクトリ
###################################################
SET_RUNTIME_CLASSPATH () {

    RUN_LIB_OUT_DIR=${1}

    ### ジョブ単位でコピーされるJAR対応
    for JAR_RUN_LIB in `ls ${RUN_LIB_OUT_DIR}`; do
        RUNTIME_CLASSPATH="${RUN_LIB_OUT_DIR}/${JAR_RUN_LIB}:${RUNTIME_CLASSPATH}"
    done

    for JAR_LIB in `echo ${LIB_PATH} | sed -e "s/:/\n/g"`; do
        if [ `echo ${JAR_LIB} | grep -e "\*$"` ]
        then
            JAR_LIB=`sed -e "s/\*$//g"`
            for FILE in `ls ${JAR_LIB}`; do
                RUNTIME_CLASSPATH="${RUN_LIB_OUT_DIR}/${FILE}:${RUNTIME_CLASSPATH}"
            done
        elif [ `echo ${JAR_LIB} | grep -e "\/$"` ]
        then
            RUNTIME_CLASSPATH="${JAR_LIB}:${RUNTIME_CLASSPATH}"
        elif [ `echo ${JAR_LIB} | grep -e "\.jar$"` ]
        then
            RUNTIME_CLASSPATH="${JAR_LIB}:${RUNTIME_CLASSPATH}"
        fi
    done
}

###################################################
# Function      : DIE
# Description   : 最後に実行したコマンドの終了ステータスをもってシェルスクリプトを終了させる。
# Usage         : DIE
###################################################
DIE () {
    EXIT_CODE=$?
    LOG_MSG "EXIT_CODE = [${EXIT_CODE}]"
    exit ${EXIT_CODE}
}

###################################################
# Function      : COPY_RUN_JARS
# Description   : 変数RUN_LIB_PATHにて指定されたコピー対象JARをRUN_LIB_OUT_DIRにコピーする。
# Usage         : SET_RUNTIME_CLASSPATH RUN_LIB_OUT_DIR
#                    RUN_LIB_OUT_DIR
#                      プロセス毎にコピーしたJARのコピー先ディレクトリ
###################################################
COPY_RUN_JARS () {

    RUN_LIB_OUT_DIR=${1}

    mkdir ${RUN_LIB_OUT_DIR} || DIE
    for RUN_LIB in `echo ${RUN_LIB_PATH} | sed -e "s/:/\n/g"`; do
        if [ `echo ${LIB} | grep -e "\*$"`]
        then
            LIB=`sed -e "s/\*$//g"`
            for RUN_DIR in `ls ${LIB}`; do

                # 通常は失敗しえないが、ディスク障害などが発生した場合を考慮する。
                cp -fp ${RUN_DIR}/*.jar ${RUN_LIB_OUT_DIR} || DIE

            done
        elif [ `echo ${RUN_LIB} | grep -e "\.jar$"` ]
        then
            # 通常は失敗しえないが、ディスク障害などが発生した場合を考慮する。
            cp -fp ${RUN_LIB} ${RUN_LIB_OUT_DIR} || DIE
        fi
    done
}

###################################################
# Function      : DELETE_DIR
# Description   : 指定されたディレクトリを削除する。(配下も含めて)
# Usage         : DELETE_DIR 削除対象のディレクトリ名
###################################################
DELETE_DIR () {

    DELETE_DIR=${1}

    if [ -d ${DELETE_DIR} ]
    then
        rm -rf ${DELETE_DIR} || DIE
    fi
}


###################################################
# Function      : DUPLICATE_PROCESS_CHECK
# Description   : 指定されたジョブIDが既に実行中であるかチェックする。
#                 実行中の場合は、終了コード「1」で処理を終了する。
# Usage         : DUPLICATE_PROCESS_CHECK ジョブID
###################################################
DUPLICATE_PROCESS_CHECK() {
    JOB_ID=${1}
    # 自身の親プロセスのIDを取得
    PARENT_PID=`ps -F --pid=$$ | grep $$ | awk '{print $3}'`
    # JOBIDのプロセス数を取得する。(この時に自身と親のプロセスIDは除外する。)
    PROCESS_COUNT=`ps -ef | grep ${JOB_ID} | grep -v ${PARENT_PID} | grep -v $$ | grep -v grep | wc -l || DIE`


    if [ "${PROCESS_COUNT}" -ne 0 ]
    then
        # 既にJOBIDが起動済みの場合は、異常終了する。
        LOG_MSG "specified JOB_ID is already used by another process."
        exit 1
    fi
}

