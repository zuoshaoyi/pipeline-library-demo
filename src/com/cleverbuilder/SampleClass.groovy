#!/usr/bin/groovy
package com.cleverbuilder

import com.google.gson.Gson
import groovy.json.*
import org.jenkinsci.plugins.workflow.cps.EnvActionImpl

class SampleClass {
    String name
    Integer age

    def increaseAge(Integer years) {
        this.age += years
    }

    def myPrint(mt) {
        def res = "echo jenkins myPrint !!!".execute()
        println res.text

        println "groovy print !!! "

        mt.print "jenkins envs print 。。。"

        def envs = mt.env

//        def json = JsonOutput.toJson(envs)

        mt.print envs.getClass()

        def envImpl = (EnvActionImpl)envs
        def environment = envImpl.getOverriddenEnvironment()

        println(environment)

        println(new Gson().toJson(environment))

        mt.print JsonOutput.toJson(environment)

//        def jdata = JsonOutput.toJson(mt)
//        return jdata
    }
}
