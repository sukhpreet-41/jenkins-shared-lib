def call(){
    sh "docker build -t spring-app -f ./GthubActions/Dockerfile"
}