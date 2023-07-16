def call(){
    sh '"trivy image" + "${IMAGE_NAME}" > results.txt"'
}