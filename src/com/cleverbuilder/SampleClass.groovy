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
        echo "myPrint 开始"
        echo jdata
        echo "myPrint 结束"
    }
}
