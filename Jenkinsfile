pipeline {
    agent any
    
    tools{
           maven 'apache-maven-3.8.5'
    }

     stages{
        stage ('Git Checkout') {
            steps {
                checkout ([
                    $class: 'GitSCM',
                    branches: 'main',
                    userRemoteConfigs: [[credentialsId: 'git_cred', url: 'https://github.com/harith2207/sireesha.git']]
                ])

            }
        }
        stage('Hello') {


             steps {


                     sh '''

                             java -version

                         '''


              }


           }
        // Maven compile Stage
        stage ('mvn Build Stage') {
            steps {
                echo "Running the Build"
                sh 'mvn clean package'
            }
        }
        
     }

}
