name := "caskgen"
organization:="org.openapitools"
version := "0.0.1-SNAPSHOT"
scalaVersion := "3.3.1"
scalafmtOnCompile := true
libraryDependencies ++= Seq(
  "com.lihaoyi" %% "cask" % "0.9.2" ,
  "com.lihaoyi" %% "upickle" % "3.2.0",
  "org.scalatest" %% "scalatest" % "3.2.18" % Test
)

publishMavenStyle := true

val githubUser = "aaron"
val githubRepo = "caskgen"
publishTo := Some("GitHub Package Registry" at s"https://maven.pkg.github.com/$githubUser/$githubRepo")

credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  githubUser,
  sys.env("GITHUB_TOKEN")
)