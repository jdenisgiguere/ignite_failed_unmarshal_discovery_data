## How to reproduce

### Environment setup

#### Clone ignite and compile

#### Download `spark 2.4.3` without `Hadoop`

#### Download `hadoop 3.1.2`

#### Install `sbt 1.2.8`

#### Compile and create a fat jar

`sbt assembly`

### Lauch ignite

```bash
$IGNITE_HOME/bin/ignite.sh
```

## This will run successfully

```bash
java -cp target/scala-2.11/ignite-failed-unmarshal-discovery-data-assembly-0.1.0-SNAPSHOT.jar Cacher
```

## This will fail unexpectedly

```bash
$SPARK_HOME/bin/spark-submit target/scala-2.11/ignite-failed-unmarshal-discovery-data-assembly-0.1.0-SNAPSHOT.jar
```

### See also

`lauch.sh` to get few more details on setup
