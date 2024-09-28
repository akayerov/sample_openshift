pipeline {
    agent any
    stages {
        stage('PreStage 1') {
            steps {
                echo 'PreStage 1'
            }
        }
        stage('Compile') {
            steps {
                mvn clean compile
            }
        }
        stage('Test') {
            steps {
                mvn test
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Package') {
            steps {
                mvn package
            }
        }

    }
}
