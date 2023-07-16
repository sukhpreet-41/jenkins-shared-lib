@Library("shared-lib") _
pipeline {
    agent any
        
    stages {
        stage('clean workspace') {
            steps {

                cleanWs()
            }
        }
        stage('Git Checkout') {
            steps {

                gitCheckout()
            }
        }

        // stage('Scanning for vulnerabilities') {
        //     steps {

        //         owaspCheck()
        //     }
        // }

        stage('Building Artifact') {
            steps {

                artifactBuild()
            }
        }
        stage('Building Docker image') {
            steps {
                dockerImageBuild()
            }
        }


        stage('push Docker image') {
            steps {
                withDockerRegistry(credentialsId: 'dockerhub', url: 'https://hub.docker.com/') {

                    sh "sh docker push spring-app:latest"
    // some block
                }
            }
        }





    }
}
