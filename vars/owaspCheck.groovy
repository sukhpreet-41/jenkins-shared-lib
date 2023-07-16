def call(){
    sh "sudo /home/sukh/Downloads/dependency-check/bin/./dependency-check.sh --project jenkins --scan var/lib/jenkins/workspace/pipeline-B/GthubActions --out jenkins.html"
}