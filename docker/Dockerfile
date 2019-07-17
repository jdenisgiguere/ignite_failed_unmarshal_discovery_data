FROM apacheignite/ignite:2.7.5

RUN apk add curl

RUN mkdir -p /opt/hadoop && \
  cd /opt/hadoop && \
  curl -sL https://archive.apache.org/dist/hadoop/common/hadoop-3.1.2/hadoop-3.1.2.tar.gz -o hadoop-3.1.2.tar.gz && \
  tar zxf hadoop-3.1.2.tar.gz

ENV HADOOP_HOME /opt/hadoop/hadoop-3.1.2
ENV PATH "${HADOOP_HOME}/bin:${PATH}"
ENV LD_LIBRARY_PATH "${HADOOP_HOME}/lib/native"
RUN echo "export SPARK_DIST_CLASSPATH=$(hadoop classpath)" >> /root/.bashrc


RUN mkdir -p /opt/spark && \
  cd /opt/spark && \
  curl -sL http://httpd-mirror.sergal.org/apache/spark/spark-2.4.3/spark-2.4.3-bin-without-hadoop.tgz -o spark-2.4.3-bin-without-hadoop.tgz && \
  tar zxf spark-2.4.3-bin-without-hadoop.tgz

ENV SPARK_HOME /opt/spark/spark-2.4.3-bin-without-hadoop
ENV PATH "${SPARK_HOME}/bin:${PATH}"


RUN mkdir -p /opt/sbt && \
  cd /opt/sbt && \
  curl -sL https://piccolo.link/sbt-1.2.8.tgz -o sbt-1.2.8.tgz && \
  tar zxf sbt-1.2.8.tgz && \
  mv sbt sbt-1.2.8

ENV SBT_HOME /opt/sbt/sbt-1.2.8
ENV PATH "${SBT_HOME}/bin:${PATH}"
