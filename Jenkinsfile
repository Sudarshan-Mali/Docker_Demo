pipeline {
    
    agent any 

        stages {
            stage('Pre-Checkout') { 
                steps { 
                    echo 'Pre Checkout Successfull...!!' 
                }       
            }  
        
//            stage('Git-Clone') { 
//                steps {
//                    bat "git config http.sslVerify false" 
//                    bat 'git -c http.sslVerify=false clone https://github.com/Sudarshan-Mali/Docker_Demo.git' 
//                } 
//            }
     
            stage('Pull-Code') {         	
            steps {        			
                //bat 'git stash'         		
                git branch: 'main', credentialsId: '2f862d5b-096e-4148-945e-3ea0b9276b24', url: 'https://github.com/Sudarshan-Mali/Docker_Demo.git'         	
            }  
        }     
    }
}
