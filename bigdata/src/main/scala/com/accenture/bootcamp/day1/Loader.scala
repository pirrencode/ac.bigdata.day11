package com.accenture.bootcamp.day1

import java.io.File

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

object Loader {

  protected def fromResource(resource: String): String = {
    new File(new File("C:\\Users\\Student\\Downloads\\Day11\\bigdata_day1\\bigdata\\src\\test\\resources\\" + resource).getCanonicalPath)
      .toURI.toString
  }

  def loadNewYearHonours(sc: SparkContext): RDD[String] = {
    // TODO Task #1: Create RDD from file `1918NewYearHonours.txt`
    val filePath = fromResource("1918NewYearHonours.txt")
    val RDD = sc.textFile(filePath)
    RDD
  }

  def loadAustralianTreaties(sc: SparkContext): RDD[String] = {
    // TODO Task #2: Create RDD from file `ListOfAustralianTreaties.txt`
    val filePath = fromResource("ListOfAustralianTreaties.txt")
    val RDD = sc.textFile(filePath)
    RDD
  }


}
