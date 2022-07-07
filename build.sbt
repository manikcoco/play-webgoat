lazy val `play-webgoat` = (project in file(".")).enablePlugins(PlayScala)

name := "play-webgoat"
version := "1.0"

crossScalaVersions := Seq("2.13.8", "2.12.16")
scalaVersion := crossScalaVersions.value.head // tc-skip

libraryDependencies ++= Seq(guice, ws)
scalacOptions ++= Seq(
  "-feature", "-unchecked", "-deprecation", "-Xfatal-warnings",
  // "unused" is too fragile w/ Twirl, routes file
  "-Xlint:-unused"
)
