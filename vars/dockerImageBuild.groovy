def call(){
    sh "docker build -t sukhpreet2002/spring-app" + ":" +"${BUILD_NUMBER}" + " ./spring_helloworld_app/"
    sh "docker build -t sukhpreet2002/spring-app ./spring_helloworld_app/"
}