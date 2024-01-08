import pyspark as spark
from pyspark.sql import SparkSession

spark = SparkSession.builder.getOrCreate()
