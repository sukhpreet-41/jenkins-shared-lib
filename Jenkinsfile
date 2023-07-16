@Library("shared-lib") _
pipeline {
    agent any
    environment {
        DOCKERHUB_USERNAME = "sukhpreet2002"
        APP_NAME = "spring-app"
        IMAGE_TAG = "${BUILD_NUMBER}"
        IMAGE_NAME = "${DOCKERHUB_USERNAME}" + "/" + "${APP_NAME}"
        REGISTRY_CREDS = 'dockerhub'
    }
        
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
                withDockerRegistry(credentialsId: 'dockerhub', url: 'https://registry.hub.docker.com/') {

                    sh "sh docker push sukhpreet2002/spring-app"
    // some block
                }
            }
        }





    }
}
