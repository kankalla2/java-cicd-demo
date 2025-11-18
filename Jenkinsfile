pipeline {
    agent any

    tools {
        jdk 'jdk17'
        maven 'maven-3.9.6'
    }

    stages {

        stage('Checkout') {
            steps {
                git credentialsId: 'github-creds', url: 'https://github.com/kankalla2/java-cicd-demo.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                sh 'mvn -B clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
