def call(Map stageParams){
    checkout([
         $class: 'GitSCM',
         branches: [[name: stageParams.branch]],
         userRemoteConfigs: [[credentialsId: 'git_cred', url: stageParams.url]]
      ])
}
