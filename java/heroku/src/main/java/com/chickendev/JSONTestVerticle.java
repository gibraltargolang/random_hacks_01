package com.chickendev;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.core.json.JsonObject;
import org.vertx.java.platform.Verticle;

public class JSONTestVerticle extends Verticle {
	private static final String JSON_BODY = "Hello, World!";
	private static final String PATH = "/hello";
	private static final String CONTENT = "content-type";
	private static final String TEXT = "text/plain";
	
	@Override
	public void start() {

		HttpServer server = vertx.createHttpServer();
		server.requestHandler(new Handler<HttpServerRequest>() {
			public void handle(HttpServerRequest request) {
				if (request.uri().startsWith(PATH)) {
					request.response().putHeader(CONTENT, TEXT);					
					request.response().end(new JsonObject(JSON_BODY).encode());
				}
			}
		});

		int port = 8080;
		if ( System.getenv("PORT") != null ){
			port = Integer.valueOf(System.getenv("PORT"));
		}		
		server.listen(port, "0.0.0.0");
	}
}
