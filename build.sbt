name := "diffpatch"
organization := "org.vikraman"
version := "1.1.13"
homepage := Some(url(s"https://github.com/vikraman/${name.value}"))
licenses += "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")

crossPaths := false

bintraySettings
useGpg := true
