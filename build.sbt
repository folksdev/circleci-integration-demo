import com.typesafe.sbt.packager.docker.DockerApiVersion

name := "circleci-integration-demo"


version := "0.1"

scalaVersion := "2.13.3"

lazy val `circleci-integration-demo` = project
  .in(file("."))
  .enablePlugins(
    JavaAppPackaging,
    DockerPlugin
  )
  .settings(dockerSettings)

lazy val dockerSettings = Seq(
  dockerRepository := Option("folksdev"),
  version in Docker := version.value,
  dockerBaseImage := "openjdk:11"
)
