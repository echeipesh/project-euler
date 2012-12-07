name := "euler"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-deprecation")

libraryDependencies += "org.scalatest" %% "scalatest" % "1.8" % "test"

libraryDependencies += "junit" % "junit" % "4.10" % "test"

libraryDependencies  ++= Seq(
            "org.scalanlp" %% "breeze-math" % "0.1"
            //"org.scalanlp" %% "breeze-learn" % "0.1",
            //"org.scalanlp" %% "breeze-process" % "0.1",
            //"org.scalanlp" %% "breeze-viz" % "0.1"
)

resolvers ++= Seq(
            // other resolvers here
            // if you want to use snapshot builds (currently 0.2-SNAPSHOT), use this.
            "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

