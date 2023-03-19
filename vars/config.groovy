#!/usr/bin/env groovy
import com.localhost.swb.IniParser

def call(String configFileName = 'globalConfig.ini') {
    def config = readProperties file:"$configFileName"
    println("$config")
    /*if (!filePath.isEmpty()) {
        def file_exist = findFiles (glob: filePath)
        if (filePath.length == 1) {
            def  map1 = readYaml file: filePath
            println map1
            map.putAll(map1)
        }
    }*/
    return config
}