package main.scala

import org.apache.spark.sql.SparkSession

object FirstApp {
  def main(args: Array[String]): Unit = {
    SparkSession.builder().appName("test").master("local[*]").getOrCreate()
  }
}
