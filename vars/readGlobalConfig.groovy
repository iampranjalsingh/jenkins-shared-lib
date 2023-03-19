#!/usr/bin/env groovy
import com.localhost.swb.IniParser
import com.cloudbees.groovy.cps.NonCPS

def call(Map config = [:]) {
    def conf = readProperties file: "configJenkins.ini"
    println "${config}"
    /*def configContents = libraryResource "globalConfig.ini"
    writeFile file: "GLOBAL_CONFIG.ini", text: "${configContents}"
    readConfig("${env.WORKSPACE}/GLOBAL_CONFIG.ini")*/
}