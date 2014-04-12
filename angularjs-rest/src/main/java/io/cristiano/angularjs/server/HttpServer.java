package io.cristiano.angularjs.server;

import io.cristiano.angularjs.server.handlers.ProductJSONServerHandler;
import io.undertow.Handlers;
import io.undertow.Undertow;
import io.undertow.server.handlers.resource.ClassPathResourceManager;

public class HttpServer {

    public static void main(String[] args){
        Undertow server = Undertow.builder()
                .addHttpListener(8080, "localhost")
                .setHandler(Handlers.path()
                        .addPrefixPath("/angularjs-rest/api", Handlers.path())
                        .addPrefixPath("/angularjs-rest/api/product/1", new ProductJSONServerHandler())
                        .addPrefixPath("/angularjs-rest", Handlers.resource(
                                new ClassPathResourceManager(HttpServer.class.getClassLoader(), HttpServer.class.getPackage()))
                                .addWelcomeFiles("app/index.html")))
                .build();
        server.start();
    }
}
