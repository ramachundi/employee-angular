angular.module('employee.services', []).factory('UserService',
		[ "$http", function($http) {
			var service = {};
			service.getAllUsers = function() {
                return $http.get("/user/getAllUsers");
                //defining 
			}
			return service;
		} ]);