def call(Map ESDataSet) {
    sh 'echo "Sending information to ES... "'

    sh """
    cat > message.json <<EOF
    {
    "enviroment": "${ESDataSet.env}",
    "build_number": "${ESDataSet.build_number}",
    "build_tag": "${ESDataSet.build_tag}",
    "job_base_name": "${ESDataSet.job_base_name}",
    "job_name": "${ESDataSet.job_name}",
    "node_name": "${ESDataSet.node_name}",
    "node_labels": "${ESDataSet.node_labels}",
    "status": "${ESDataSet.status}",
    "date": "${ESDataSet.date}"
    }
    EOF
    """
    sh """
    echo "   generated message..."
    cat message.json
    
    curl -u USERNAME:PASSWORD -XPUT 'localhost:9200/custom_builds/external/1?pretty' -d '@message.json'
    """

}
