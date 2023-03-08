ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.9.0"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaBook2.13",
  )

// для тестов
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.14"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % "test"



libraryDependencies += "dev.zio" %% "zio" % "1.0.18"
libraryDependencies += "dev.zio" %% "zio-config" % "1.0.10"
