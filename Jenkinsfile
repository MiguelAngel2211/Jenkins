pipeline {
    agent any
    tools {
        maven '3.9.0'
    }
    stages{
        stage ('build maven'){
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '4bf11780-14ee-461a-9a25-c6d89c7c5063', url: 'https://github.com/MiguelAngel2211/Jenkins.git']])
                sh 'mvn clean install'
            }

        }
    }
}