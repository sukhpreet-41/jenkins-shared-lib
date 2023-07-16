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
                sh "cd GthubActions"
            }
        }

        stage('Building Artifact') {
            steps {

                artifactBuild()
            }
        }
    }
}
