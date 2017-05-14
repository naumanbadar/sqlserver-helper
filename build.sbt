import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.naumanbadar",
      scalaVersion := "2.12.2",
      version      := "0.1.0-SNAPSHOT",
      licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
    )),
    name := "sqlserver-helper",
    libraryDependencies += scalaTest % Test
  )
