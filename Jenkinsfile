
pipeline {
 agent { 
     node { 
      label 'jp-agent'
     } 
 }
 
 
 options {
  timeout(time: 2, unit: 'HOURS')  
 }

 parameters {
  string(name: 'credentialId', defaultValue: 'SPFCDND')
  string(name: 'DeployUrl', defaultValue: 'https://supportforce--spfcdnd.cs63.my.salesforce.com')
  booleanParam(name: 'runA', defaultValue: true)
  booleanParam(name: 'runB', defaultValue: true)
  booleanParam(name: 'Deploy', defaultValue: false)
  booleanParam(name: 'Stash', defaultValue: false)
  booleanParam(name: 'Deestroy', defaultValue: false) //paramenter to run aXe testing with in kumonium
 }

 stages {
  stage('Build') {
   steps {
    echo "You Build Here"
    
   }//steps
  }//stage
  stage("build & SonarQube analysis") { 

    steps { 
                //withSonarQubeEnv('BMS SonarQube') { 
                    sh ' echo "hello World"'
                    sh 'echo $CHANGE_ID'
                    sh "echo \$CHANGE_ID"
                    sh "echo ${env.CHANGE_ID}"
    }//steps
    }//stage
 } //stages




}//pipeline
