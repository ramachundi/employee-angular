angular.module('employee.services', []).factory('UserService',
		[ "$http", function($http) {
            var service = {};
            //getuser by id

            service.getUserById = function(userId) {
				//var url = "/getUser/{userId}".getUserByIdUrl + userId;
				return $http.get("/user/getUser/1");
			}

            // //get all users
			 service.getAllUsers = function() {
                 return $http.get("/user/getAllUsers");
                 //defining 
			}
			return service;
		} ]);