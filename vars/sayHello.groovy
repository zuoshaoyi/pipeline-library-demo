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

        def instance1 = this.class.classLoader.rootLoader.loadClass("com.cleverbuilder.JavaClass").newInstance()


//        def instance = Class.forName("com.cleverbuilder.JavaClass").newInstance()
//        instance.javaPrint()
//        def test = new JavaTest()
//        test.javaPrint()


        echo "end ..."
    }
}

