def call(Map parameters) {
    sh 'Sending informatino to ES:'

    sh """
    cat > message.json <<EOF
    {
    "enviroment": "${Map.env}",
    "build_number": "${Map.build_number}",
    "build_tag": "${Map.build_tag}",
    "job_base_name": "${Map.job_base_name}",
    "job_name": "${Map.job_name}",
    "node_name": "${Map.node_name}",
    "node_labels": "${Map.node_labels}",
    "status": "${Map.status}",
    "date": "${Map.date}"
    }
    EOF
    
    cat message.json
    curl -u USERNAME:PASSWORD -XPUT 'localhost:9200/custom_builds/external/1?pretty' -d '@message.json'
    """

}
