import org.apache.spark.{SparkContext,SparkConf}

object SparkCode extends App{

val conf = new SparkConf().setAppName("Test Spark").setMaster("local[2]")


 val sc = new SparkContext(conf)

 val j =sc.parallelize(Array(1,2,3))

 println(j)
}
