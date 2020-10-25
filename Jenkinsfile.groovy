pipeline {
    agent any
    stages {
        stage('Build_Multi_Line') {
            steps {
                sh 'echo "Hello Tech World"'
                sh '''
                    echo "Hello Tech World Again"
                    ls -la
                '''
            }
        }
    }
}