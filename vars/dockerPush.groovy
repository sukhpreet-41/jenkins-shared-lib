def call(){
    withDockerRegistry(credentialsId: 'dockerhub', url: 'https://registry.hub.docker.com/') {
        sh "docker push sukhpreet2002/spring-app:latest"
    }

}