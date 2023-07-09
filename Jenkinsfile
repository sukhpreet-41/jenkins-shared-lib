// // @Library("")
// pipeline {
//     agent any

//     stages {
//         stage('Hello') {
//             steps {
//                 script{

//                     sh "echo hello world"

//                 }
//                 // demo()
//             }
//         }
//     }
// }
pipeline {
    agent any
    stages {
        stage("Clone Git Repository") {
            steps {
                git(
                    url: "https://github.com/ssbostan/neptune.git",
                    branch: "main",
                    changelog: true,
                    poll: true
                )
            }
        }
    }
}