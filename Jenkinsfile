@Library("shared-lib") _
pipeline {
    agent any

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
