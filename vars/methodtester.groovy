def call() {
    echo "Starting session..."
    sh 'echo "gathering info "'
    sh 'echo "${params.myparam_one}'
    echo "generated message..."
    
}
