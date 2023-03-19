#!/usr/bin/env groovy
import com.localhost.swb.IniParser
import com.cloudbees.groovy.cps.NonCPS

def call(String filePath, Closure closure) {
    def config = readProperties file:"globalConfig.ini"
    // println(config)
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

def call(Closure closure) {
    call('', closure)
}
