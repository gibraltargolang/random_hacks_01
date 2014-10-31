##Vertx & Heroku

This app consists in a simple REST endpoint that returns {"message":"Hello, World!"}

##Create the heroku project using:
heroku create --stack cedar --buildpack https://github.com/dortizesquivel/heroku-buildpack-vertx

### Run the project locally using
foreman run

###Live Example:
https://quiet-brook-6278.herokuapp.com/hello

