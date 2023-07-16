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

        stage('Building Artifact') {
            steps {

                artifactBuild()
            }
        }
        stage('Building Dcoker image') {
            steps {
                sh "sleep 10"
                dockerImageBuild()
            }
        }







    }
}
