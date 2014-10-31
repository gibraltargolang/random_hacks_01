package com.chickendev;

import java.util.HashMap;
import java.util.Map;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.core.json.JsonObject;
import org.vertx.java.platform.Verticle;

public class JSONTestVerticle extends Verticle {
	private static final String JSON_KEY = "message";
	private static final String JSON_ERROR_KEY = "error";	
	private static final String JSON_VALUE = "Hello, World!";
	private static final String JSON_ERROR_VALUE = "404";
	private static final String PATH = "/hello";
	private static final String CONTENT = "Content-Type";
	private static final String TEXT = "application/json";
	private static final Map<String,Object> JSON = new HashMap<String,Object>();
	private static final Map<String,Object> JSON_ERROR = new HashMap<String,Object>();
	
	@Override
	public void start() {
		JSON.put(JSON_KEY, JSON_VALUE);
		JSON_ERROR.put(JSON_ERROR_KEY, JSON_ERROR_VALUE);
		
		HttpServer server = vertx.createHttpServer();
		server.requestHandler(new Handler<HttpServerRequest>() {
			public void handle(HttpServerRequest request) {
				if (request.uri().startsWith(PATH)) {
					request.response().putHeader(CONTENT, TEXT);									
					request.response().end(new JsonObject(JSON).encode());
				}else {
					request.response().putHeader(CONTENT, TEXT);
					request.response().end(new JsonObject(JSON_ERROR).encode());
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
