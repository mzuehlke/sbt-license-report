organization := "com.typesafe.sbt"

name := "sbt-license-report"

sbtPlugin := true

publishMavenStyle := false
bintrayOrganization := Some("sbt")
name in bintray := "sbt-license-report"
bintrayRepository := "sbt-plugin-releases"


scalariformSettings

versionWithGit

git.baseVersion := "1.0"

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.1"

scriptedSettings

scriptedLaunchOpts <+= version apply { v => "-Dproject.version="+v }
