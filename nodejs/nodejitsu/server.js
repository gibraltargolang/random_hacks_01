var http = require('http')
    , url = require('url');

var hello = {message: "Hello, World!"};
var port = 4002;
http.createServer(function (req, res) {
    // JSON response object
    var path = url.parse(req.url).pathname;
    switch (path) {
        case '/hello':
            // JSON Response Test
            res.writeHead(200, {'Content-Type': 'application/json; charset=UTF-8'});
            // Write JSON object to response
            res.end(JSON.stringify(hello));
            break;
        default :
            res.writeHead(404, {'Content-Type': 'application/json; charset=UTF-8'});
            res.end(JSON.stringify({'error':404}));
            break;

    }
}).listen(port);

console.log('server started on port:'+port)