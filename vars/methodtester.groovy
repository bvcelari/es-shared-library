def call() {
    echo "Starting session..."
    sh 'echo "gathering info "'
    echo "${params.myparam_one}"
    echo "generated message..."
    
}
