
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
  string(name: 'param1', defaultValue: 'SPFCDND')
/*  string(name: 'DeployUrl', defaultValue: 'https://supportforce--spfcdnd.cs63.my.salesforce.com')
  booleanParam(name: 'runA', defaultValue: true)
  booleanParam(name: 'runB', defaultValue: true)
  booleanParam(name: 'Deploy', defaultValue: false)
  booleanParam(name: 'Stash', defaultValue: false)
  booleanParam(name: 'Deestroy', defaultValue: false) //paramenter to run aXe testing with in kumonium
  */
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
                    sh 'echo $param1'
                    sh "echo \$param1"
                    sh "echo ${env.param1}"
    }//steps
    }//stage
 } //stages




}//pipeline
