import sbt._, Keys._

object Dependencies {

  object Version {
    val dog = "0.1.4"
    val httpz = "0.3.0"
    val scalazStream = "0.7.2a"
  }

  val dogCore = "com.github.pocketberserker" %% "dog-core" % Version.dog
  val dogLib = "com.github.pocketberserker" %% "dog" % Version.dog
  val httpz = "com.github.xuwei-k" %% "httpz" % Version.httpz
  val scalazStream = "org.scalaz.stream" %% "scalaz-stream" % Version.scalazStream
}
