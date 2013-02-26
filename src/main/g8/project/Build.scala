import sbt._
import Keys._

object $scalaBuildName$Build extends Build {
  lazy val root = Project("$name$", file("."))
    .configs( AcceptanceTest )
    .settings( inConfig(AcceptanceTest)(Defaults.testSettings) : _*)

  lazy val AcceptanceTest = config("spec") extend(Test)
}
