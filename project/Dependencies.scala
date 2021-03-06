import sbt._

object Dependencies {
  val akkaStream        = "com.typesafe.akka" %% "akka-stream"         % "2.4.11"
  val netty             = "io.netty"          %  "netty-codec-http2"   % "4.1.6.Final"

  val sprayJson         = "io.spray"          %% "spray-json"          % "1.3.2"
  val playJson          = "com.typesafe.play" %% "play-json"           % "2.5.9"
  val liftJson          = "net.liftweb"       %% "lift-json"           % "2.6.3"
  val circeParser       = "io.circe"          %% "circe-parser"        % "0.5.3"
  val circeGeneric      = "io.circe"          %% "circe-generic"       % "0.5.3"

  val scalaTest         = "org.scalatest"     %% "scalatest"           % "3.0.0"
  val akkaStreamTestkit = "com.typesafe.akka" %% "akka-stream-testkit" % "2.4.11"

  val connectorDeps = Seq(akkaStream, netty) ++
    Seq(sprayJson, playJson, liftJson, circeParser).map(_ % Provided) ++
    Seq(scalaTest, akkaStreamTestkit, circeGeneric).map(_ % Test)

  val examplesDeps = Seq(sprayJson)
}
