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

        stage('Scanning for vulnerabilities') {
            steps {

                owaspCheck()
            }
        }

        stage('Building Artifact') {
            steps {

                artifactBuild()
            }
        }
        stage('Building Docker image') {
            steps {
                sh "sleep 10"
                dockerImageBuild()
            }
        }







    }
}
