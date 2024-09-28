pipeline {
    agent any
    stages {
        stage('Build') {
           steps {
              sh 'mvn -B -DskipTests clean package' //this command will be executed inside maven container
           }
        }
        stage('Test') {
            steps {
                echo 'Hello'
            }
        }

    }
}
