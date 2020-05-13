multibranchPipelineJob('HelloMultibranch') {
branchSources {
github {
apiUri('https://github.com/bvcelari/es-shared-library')
checkoutCredentialsId('bvcelari_id')
id('bvcelari_id')
repository('https://github.com/bvcelari/es-shared-library')
scanCredentialsId('bvcelari_id')
}
}
orphanedItemStrategy {
discardOldItems {
numToKeep(5)
}
}
description("demo multibranch pipeline")
}

