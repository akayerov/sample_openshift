pipeline {
    agent any
    stages {
        stage('Build') {
           steps {
              sh 'mvn -B  clean compile'
        }
        stage('Test') {
            steps {
              sh 'mvn -B -DskipTests package'
            }
        }

    }
}
