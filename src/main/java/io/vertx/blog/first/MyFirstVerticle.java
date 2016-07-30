package io.vertx.blog.first;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * Created by a13977 on 16/07/30.
 */
public class MyFirstVerticle extends AbstractVerticle {

	@Override
	public void start(Future<Void> fut) {
		vertx
			.createHttpServer()
			.requestHandler(r -> {
				r.response().end("<h1>Hello from my first " +
						"Vert.x 3 application</h><br />aaaaaaaaaaaaaaaaa");
		}).listen(8080, result -> {
			if(result.succeeded()) {
				fut.complete();
			} else {
				fut.fail(result.cause());
			}
		});
	}
}
