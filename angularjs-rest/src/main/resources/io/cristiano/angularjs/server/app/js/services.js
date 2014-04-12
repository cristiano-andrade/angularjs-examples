var productServices = angular.module('productServices', ['ngResource']);

productServices.factory('Product', ['$resource',
    function($resource){
        return $resource('api/product/:productId', {}, {
            query: {method:'GET', params:{productId:'productId'}}
        });
}]);
