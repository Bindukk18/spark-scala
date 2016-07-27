package org.test.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
/**
 *  Refer this link to download winutils.exe http://stackoverflow.com/questions/19620642/failed-to-locate-the-winutils-binary-in-the-hadoop-binary-path
 * Eclipse->Debug/Run Configurations -> Environment (tab) -> and added
		Variable: HADOOP_HOME
		Value: <>/bin/winutils.exe - just give <>
 * 
 * author : gkhare
 */
object WordCount {
  
  def main(args: Array[String])={
    
    val conf = new SparkConf().set("hadoop.home.dir", "D:\\spark-1.5.2-bin-hadoop2.6\\winutils").setAppName("WordCount").setMaster("local");
    val sc = new SparkContext(conf);
    
    val test = sc.textFile("food.txt");
    
    test.flatMap { line => line.split(" ") }.map { word => (word,1) }.reduceByKey(_ + _).saveAsTextFile("food.count.txt")
    
  }
}