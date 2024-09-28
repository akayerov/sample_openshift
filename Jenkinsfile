pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
                bat clean compile
            }
        }
        stage('Test') {
            steps {
                bat mvn test
            }
        }

    }
}
