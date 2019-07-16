#!/bin/bash
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
export SPARK_HOME=/home/jdgiguere/workspace/spark/spark-2.4.3-bin-without-hadoop
export HADOOP_HOME=/home/jdgiguere/workspace/hadoop/hadoop-3.1.2
export PATH=$SPARK_HOME/bin:$HADOOP_HOME/bin:$JAVA_HOME/bin:$PATH
export LD_LIBRARY_PATH=$HADOOP_HOME/lib/native
export SPARK_DIST_CLASSPATH=$(hadoop classpath)

$SPARK_HOME/bin/spark-submit target/scala-2.11/ignite-failed-unmarshal-discovery-data-assembly-0.1.0-SNAPSHOT.jar

