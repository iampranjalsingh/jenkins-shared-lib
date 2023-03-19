#!/usr/bin/env groovy
import com.localhost.swb.IniParser

def call(Map config = [:]) {
    if (!config.isEmpty() && config.containsKey("configFile")) {
        configFile = "${config.configFile}"
    }
    // def configContents = libraryResource "globalConfig.ini"
    // println "${configContents}"
    // writeFile file: "GLOBAL_CONFIG.ini", text: "${configContents}"

    def ini = new IniParser("${env.WORKSPACE}/globalConfig.ini")
    ini.dumpConfig()
    def secs = ini.getAllSections()
    secs.each() { it ->
        println it
    }
}
