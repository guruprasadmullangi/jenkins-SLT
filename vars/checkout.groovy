#! /bin/groovy
def git_scm(urls,branch) {
	node("master") {
		git branch: "${branch}", url: "${urls}"
	}
}
def build(path) {
        node("master") {
		sh "cd ${path}"
                sh "mvn clean package -DskipTests"
        }
}
