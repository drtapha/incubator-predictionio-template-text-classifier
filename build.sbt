name := "org.example.textclassification"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.11.0-incubating" % "provided",
  "org.apache.spark"        %% "spark-core"               % "1.4.1" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "1.4.1" % "provided",
)

