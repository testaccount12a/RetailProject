jenkinsfile
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    echo "build completed successful"
                }
            }
            stage('Test') {
                steps {
                    echo "Test completed successful"
                }
            }
            stage('Package') {
                steps {
                    echo "Package completed successful"
                }
            }
            stage('Deploy') {
                steps {
                    echo "Deploy completed successful"
                }
            }
        }
    }