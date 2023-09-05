var app = angular.module("estore-app", []);

app.controller("cart-ctrl", function($scope, $http){
	$scope.cart = {
		items: {},
		add(id){},
		update(id, quantity){},
		remove(id){},
		clear(){},
		get amount(){},
		get count(){},
		amountOf(id){}
	};
});