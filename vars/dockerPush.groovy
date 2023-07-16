def call(){
    withDockerRegistry(credentialsId: 'dockerhub', url: 'https://index.docker.io/v1/') {
        sh "docker push sukhpreet2002/spring-app:latest"
    }

}