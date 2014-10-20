var http = require('http')
    , url = require('url');

var port = 4003;
http.createServer(function (req, res) {
    // JSON response object
    var path = url.parse(req.url).pathname;
    switch (path) {
        case '/hello':
            // JSON Response Test
            res.writeHead(200, {'Content-Type': 'application/json'});
            // Write JSON object to response
            res.end(JSON.stringify({message: "Hello, World!"}));
            break;
        default :
            res.writeHead(404, {'Content-Type': 'application/json'});
            res.end(JSON.stringify({'error':404}));
            break;

    }
}).listen(port);

console.log('server started on port:'+port)
