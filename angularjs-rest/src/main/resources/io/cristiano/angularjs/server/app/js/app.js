'use strict';

/* App Module */

var productApp = angular.module('productApp', [
    'ngRoute',
    'productControllers',
    'productServices'

]);

productApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/product/:productId', {
                templateUrl: 'app/partials/product-detail.html',
                controller: 'ProductController'
            }).otherwise({
                redirectTo: '/'
            });
}]);