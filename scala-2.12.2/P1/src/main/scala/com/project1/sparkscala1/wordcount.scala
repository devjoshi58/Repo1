package com.project1.sparkscala1

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object wordcount {
  
  def main(args:Array[String]):Unit=
  {
    val conf= new SparkConf().setAppName("First").setMaster("local")
    val sc = new SparkContext(conf)
  }
  
}