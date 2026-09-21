def call(string repoUrl) {
  git (
    changelog: false,
    poll: false,
    url: repoUrl
    branch: 'main'
  )
  
