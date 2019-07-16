lazy val root = (project in file("."))
  .settings(
    name := "ignite-failed-unmarshal-discovery-data",
    scalaVersion := "2.11.12"
  )

//assemblyShadeRules in assembly := Seq(
//  ShadeRule.rename("javax.cache.**" -> "repackaged.com.google.common.@1").inAll
//)
//
