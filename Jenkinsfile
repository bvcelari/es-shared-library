
pipeline {
 agent any 
 
 options {
  timeout(time: 2, unit: 'HOURS')
  timestamps()
  disableConcurrentBuilds()
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
                //    sh "mvn -f ./build/api/pom.xml sonar:sonar -Dsonar.projectKey=kapua-expo-ui-gateway -Dsonar.projectName=${NAME} -Dsonar.host.url=https://engci-sonar-sjc.cisco.com/sonar -Dsonar.login=cb2e54e3bd00739c26ef88f8ef70aa7af8618ebd -Dsonar.pullrequest.base=master -Dsonar.alm.github.app.name=engit-sonar-int-gen-SJC -Dsonar.alm.github.app.id=29 -Dsonar.pullrequest.branch=${env.BRANCH_NAME} -Dsonar.pullrequest.key=164 -Dsonar.pullrequest.provider=GitHub -Dsonar.pullrequest.github.repository=pov-services/kapua-expo-ui-gateway" 
                    sh ' echo "hello World"'
                    sh "echo ${env.CHANGE_ID}"
                    
            } 
        } 

 } //stages




}//pipeline
