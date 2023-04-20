pipeline {
	agent any
		tools {
			maven 'Maven_3.9.1'
			jdk 'JavaJDK'
		}
		stages{
			stage ('build maven'){
				steps {
					checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'bdc3da64-6f47-4f75-9726-8d3b3d13a023', url: 'https://github.com/MiguelAngel2211/Jenkins.git']])
					sh 'mvn clean install'
				}
			}
		}
	}
