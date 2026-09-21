def call () {
  stage('Build Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
}
