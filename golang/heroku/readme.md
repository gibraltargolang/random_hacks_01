Golang heroku

The basic app consists of a basic REST endpoint {message:"Hello, World!"} and respond to the /hello endpoint.

go run server.go

http://localhost:3002/hello

export GOPATH=THIS_DIRECTORY

cp demoapp src/demoapp

deploy with git push heroku master