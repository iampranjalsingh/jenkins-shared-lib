#!/usr/bin/env groovy

def call(Map config = [:] as Map) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
