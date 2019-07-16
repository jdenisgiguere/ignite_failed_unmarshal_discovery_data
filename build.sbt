lazy val root = (project in file("."))
  .settings(
    name := "ignite-failed-unmarshal-discovery-data",
    scalaVersion := "2.11.12",
    libraryDependencies += "org.apache.ignite" % "ignite-core" % "2.7.5",
    libraryDependencies += "org.apache.ignite" % "ignite-indexing" % "2.7.5",
    libraryDependencies += "org.apache.ignite" % "ignite-spring" % "2.7.5"
  )

