pipeline {
    agent any
    
    tools{
           maven 'apache-maven-3.8.5'
    }
    
    parameters{
        choice(name: 'BRANCH', choices: ['master', 'jenkins'], description: 'Pick Branch to Build')
    }

    stages{
        stage ('Git Checkout') {
            steps {
                   gitcheckout(
                   branch: "master",
                   url: ""
                   )
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
