#!/usr/bin/env groovy

def call(String filePath, Closure closure) {
    def config = libraryResource 'globalConfig.ini'
    println "$config"
    /*def map = readProperties text: config
    println "$map"*/
    println config.getClass()

    if (!filePath.isEmpty()) {
        def file_exist = findFiles (glob: filePath)
        if (filePath.length == 1) {
            def  map1 = readYaml file: filePath
            println map1
            map.putAll(map1)
        }
    }
}

def call(Closure closure) {
    call('', closure)
}