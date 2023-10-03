pipeline {
    agent any
    
	 stages {
		        stage('Checkout') {
		            steps {
		                // Checkout Selenium UI testing framework code from the Git repository
				 git branch: 'main', url:'https://github.com/Rohit1498/jenkins_Training_Assignment1.git'

		                echo 'checkout'
		              }
		           }
		        
		        stage('Build') {
		            steps {
		                // Build Selenium project using Maven
				    dir('.'){
				        echo 'build'
				        bat 'mvn clean'
				    }
		             }
		          }
        
		        stage('Test') {
		            steps {
		                // Run Selenium UI tests using Maven
				        echo 'test'
				        bat 'mvn test'
		            }
		         }
        
		        stage('Publish Reports') {
		            steps {
		                // Publish test reports using HTML Publisher plugin
		               echo 'this is publish reports section'
			                publishHTML(target: [
			                    allowMissing: false,
			                    alwaysLinkToLastBuild: true,
			                    keepAll: true,
			                    reportDir: 'target',
			                    reportFiles: 'index.html',
			                    reportName: 'Test Report'
			                ])
			    }
		        }
        
          }
    
    post {
	        always {
			// Clean up temporary files
			
	            echo 'this is always command in post section'
	        }
        
	        success {
	            // Actions to perform when the pipeline succeeds
	            echo 'Pipeline succeeded!'
	        }
        
	        failure {
	            // Actions to perform when the pipeline fails
	            echo 'Pipeline failed!'
	        }
          }
	
}
