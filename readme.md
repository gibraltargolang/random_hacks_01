Gibraltar Golang Community (GGC) Random Hack's with Golang - The response time challange Meetup: 
http://www.meetup.com/Gibraltar-Golang-Community/events/214191422/

Random Hack's with Golang is a series of workshops where GGC members get together to hack with Golang.

On this first initial hack session, the theme is to break down the response time.

The proposed cloud providers are going to base the real world cheap cloud option:


1) Golang native deployed to --> Appengine, Openshift, Heroku. 

2) Scala JVM JIT deployed to --> Appengine, Openshift and Heroku.

3) NodeJS V8 native deployed to --> Nodejitsu, Openshift and Heroku.

4) Java Vertex deployed to --> Appengine, Openshift, Heroku


Round 1:

Java Vertex vs Go 1.2.1 vs Scala Play vs NodeJS 0.10.x





The basic app consists of a basic REST endpoint {message:"Hello, World!"} and respond to the /hello endpoint.

This app will then be deployed to Openshift, Heroku, AppEngine or Nodejitsu.

This app will then be load tested with JVM JMeter and Golang Vegeta.

Who is up to the challenge ?  


Github: https://github.com/gibraltargolang/random_hacks_01 