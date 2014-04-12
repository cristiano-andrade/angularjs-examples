var productControllers = angular.module('productControllers', []);


productControllers.controller('ProductController', ['$scope', '$routeParams', 'Product',
    function ($scope, $routeParams, Product) {
        $scope.product = Product.get({productId: $routeParams.productId}, function (product) {
            //callbackfunction
        });
    }]
);