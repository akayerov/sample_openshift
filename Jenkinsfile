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
                cmd clean compile
            }
        }
        stage('Test') {
            steps {
                cmd mvn test
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }

    }
}
