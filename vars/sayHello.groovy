#!/usr/bin/env groovy
import com.cleverbuilder.SampleClass
import groovy.json.*
def call(String name = 'human') {
  def jdata = JsonOutput.toJson(this)
  echo jdata

  echo "Hello, ${name}."


  def cc = new SampleClass()

  cc.myPrint(this)

  echo "end ..."
}

