Gibraltar Golang Community (GGC) Random Hack's with Golang - The response time challange Meetup: 
http://www.meetup.com/Gibraltar-Golang-Community/events/214191422/

Random Hack's with Golang is a series of workshops where GGC members get together to hack with Golang.

On this first initial hack session, the theme is to break down the response time.

The proposed cloud providers are going to base the real world cheap cloud option:


1) Golang compiled deployed to --> Appengine, Openshift, Heroku. 
2) Scala JVM JIT deployed to --> Appengine, Openshift and Heroku.

3) NodeJS V8 JIT deployed to --> Nodejitsu, Openshift and Heroku.


Challenge 1: Golang vs Scala JVM on Openshift.

Challenge 2: Golang vs Scala JVM on Heroku.

Challenge 3: Golang vs Scala JVM on Appengine.

Challenge 4: Golang vs NodeJS on Openshift.

Challenge 5: Golang vs NodeJS on Heroku.

Challenge 6: Golang vs NodeJS on Nodejitsu vs Appengine.


The basic app consists of a basic REST endpoint that reads a 200 long string from a local static file, parse its contents to JSON {hello:"200longchar"} and respond to the /helloworld endpoint.

This app will then be deployed to Openshift, Heroku, AppEngine or Nodejitsu.

This app will then be load tested with JVM JMeter and Golang Vegeta.

Who is up to the challenge ?  


Github: https://github.com/gibraltargolang/random_hacks_01 