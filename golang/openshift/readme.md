Golang openshift

The basic app consists of a basic REST endpoint that reads a 200 long string from a local static file, parse its contents to JSON {hello:"200longchar"} and respond to the /helloworld endpoint.

go run server.go

http://localhost:3003/hello