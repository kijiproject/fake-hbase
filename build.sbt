name := "fake-hbase"

organization := "org.kiji.testing"

version := "0.0.5"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.apache.hadoop" % "hadoop-common" % "2.0.0-cdh4.0.1",
  "org.apache.hbase" % "hbase" % "0.94.3",
  "junit" % "junit" % "4.7",
  "cglib" % "cglib-nodep" % "2.2.2",
  "org.easymock" % "easymock" % "3.1",
  "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test"
)