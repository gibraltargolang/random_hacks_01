name := """play-rest"""

version := "1.0-SNAPSHOT"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.2"

libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5" % "test"