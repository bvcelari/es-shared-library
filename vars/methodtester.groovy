def call() {
    echo "Starting session..."
    sh 'echo "gathering info "'
    echo "${params.myparam_one}"
    echo "generated message..."
    echo "Hello new1  ${params.myparam_one}"
    echo "Hello new2 ${myparam_one}"

    
}
