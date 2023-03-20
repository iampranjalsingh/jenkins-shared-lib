#!/usr/bin/env groovy

def call(Map config = [:] as Map) {
    def fileContents = libraryResource 'configJenkins.ini'
    def props = readProperties(text:fileContents)
    println(fileContents)
    println("**************** ${config['template']}")
    println(props)
}