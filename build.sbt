name := "circleci-integration-demo"

version := "0.1"

scalaVersion := "2.13.3"

lazy val `circleci-integration-demo` = project
  .in(file("."))
  .enablePlugins(
    JavaAppPackaging,
    DockerPlugin
  )
  .settings(
  )

lazy val dockerSettings = Seq(
  dockerRepository := Option("folksdev"),
  version in Docker := version.value
)
