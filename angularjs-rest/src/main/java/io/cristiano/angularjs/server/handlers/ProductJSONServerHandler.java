package io.cristiano.angularjs.server.handlers;

import io.cristiano.angularjs.domain.Product;
import io.cristiano.angularjs.service.ProductService;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

public class ProductJSONServerHandler implements HttpHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        final Product product = ProductService.getProduct();
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "application/json");
        exchange.getResponseSender().send(product.toJSONString());
    }
}
