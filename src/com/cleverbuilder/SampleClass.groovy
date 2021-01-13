#!/usr/bin/env groovy
package com.cleverbuilder

import groovy.json.*

class SampleClass {
    String name
    Integer age

    def increaseAge(Integer years) {
        this.age += years
    }

    def myPrint(mt) {
        def jdata = JsonOutput.toJson(mt)
        println "myPrint 开始"
        println jdata
        println "myPrint 结束"
    }
}
