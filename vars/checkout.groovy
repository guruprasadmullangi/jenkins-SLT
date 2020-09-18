#! /bin/groovy
def git_scm(urls,branch) {
	node("master") {
		git branch: "${branch}", url: "${urls}"
	}
}
def build() {
        node("master") {
                sh "mvn clean package"
        }
}
