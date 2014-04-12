package io.cristiano.angularjs.server;

import io.undertow.Handlers;
import io.undertow.Undertow;
import io.undertow.server.handlers.resource.ClassPathResourceManager;

public class HttpServer {

    public static void main(String[] args){
        Undertow server = Undertow.builder()
                .addHttpListener(8080, "localhost")
                .setHandler(Handlers.path().addPrefixPath("/angularjs-quickstart", Handlers.resource(
                        new ClassPathResourceManager(HttpServer.class.getClassLoader(), HttpServer.class.getPackage()))
                        .addWelcomeFiles("index.html")))
                .build();
        server.start();
    }
}
