#!/usr/bin/groovy
import com.cleverbuilder.SampleClass
import groovy.json.*

def call(String name = 'human') {

    timeout(activity: false, time: 1, unit: 'HOURS') {

        echo "Hello, ${name}."

        def cc = new SampleClass()
//
        cc.myPrint(this)

        def ja = new com.cleverbuilder.JavaClass()
        ja.javaPrint()

        echo "end ..."
    }
}

