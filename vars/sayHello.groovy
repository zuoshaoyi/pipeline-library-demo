#!/usr/bin/groovy
import com.cleverbuilder.*

def call(String name = 'human') {

    timeout(activity: false, time: 1, unit: 'HOURS') {

        echo "Hello, ${name}."

        def cc = new SampleClass()
//
        cc.myPrint(this)

//        def ja = new JavaClass()
//        ja.javaPrint()

        JavaClass instance = Class.forName("com.cleverbuilder.JavaClass").newInstance()
        instance.javaPrint()
//        def test = new JavaTest()
//        test.javaPrint()


        echo "end ..."
    }
}

