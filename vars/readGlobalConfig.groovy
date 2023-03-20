#!/usr/bin/env groovy

def call(String filePath="configJenkins.ini") {
    def fileContents = libraryResource 'globalConfig.ini'
    def props = readProperties(text:fileContents)
    if (!filePath.isEmpty()) {
        def file_exist = findFiles (glob: filePath)
        if (filePath.length == 1) {
            def  map = readYaml file: filePath
            props.putAll(map)
        }
    }
    return props
}