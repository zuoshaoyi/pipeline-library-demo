#!/usr/bin/env groovy
import com.cleverbuilder.SampleClass

def call(String name = 'human') {
  print this
  echo "Hello, ${name}."

  def cc = new SampleClass()

  cc.myPrint(this)
}

