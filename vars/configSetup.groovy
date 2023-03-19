#!/usr/bin/env groovy
import com.localhost.swb.IniParser

def call(Map config = [:]) {
    def configContents = libraryResource "globalConfig.ini"
    if (!config.isEmpty() && config.containsKey("configFile")) {
        configFile = "${config.configFile}"
    }
    println "${configContents}"
    writeFile file: "GlobalConfig", text: configContents
}