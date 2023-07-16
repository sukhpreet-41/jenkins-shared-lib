@Library("shared-lib") _
pipeline {
    agent any

    stages {
        stage('clean workspace') {
            steps {

                cleanWs()
            }
        }
    stages {
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
    }
}
