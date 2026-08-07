pipeline {

    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK8'
    }

    stages {

        stage('Checkout') {
            steps {
                
                url: 'https://github.com/Triveni-1028/devops_buildpipeline_4.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

    }

    post {
        success {
            echo 'All tests passed successfully.'
        }

        failure {
            echo 'One or more tests failed.'
        }
    }
}
