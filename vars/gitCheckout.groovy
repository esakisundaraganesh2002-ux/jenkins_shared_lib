def call(String repoUrl) {
  git (
    changelog: false,
    poll: false,
    url: repoUrl,
    branch: 'main'
  )
}
