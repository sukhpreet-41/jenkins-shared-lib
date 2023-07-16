def call(){
    sh "docker build -t sukhpreet2002/spring-app" + ":" +"${BUILD_NUMBER}" + " ./GthubActions/"
    sh "docker build -t sukhpreet2002/spring-app ./GthubActions/"
}