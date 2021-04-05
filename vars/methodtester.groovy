def call() {
    echo "Starting session..."
    sh 'echo "gathering info "'
    echo "${params.myparam_one}"
    echo "generated message..."
    echo 'Param one inside the job like: ${myparam_one}'
    echo "Param one inside the job like: ${myparam_one}"

    
}
