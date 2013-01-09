
resolvers ++= Seq(
  Resolver.url("sbt-plugin-releases2", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns),
  "coda" at "http://repo.codahale.com",
  "IESL Public Releases" at "http://dev-iesl.cs.umass.edu/nexus/content/groups/public"
)

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.0.0")

//addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.2")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.0")

addSbtPlugin("edu.umass.cs.iesl" %% "iesl-sbt-base" % "latest.release")
