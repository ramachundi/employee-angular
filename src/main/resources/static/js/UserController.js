var module = angular.module('employee.controllers', []);
module.controller("UserController", ["$scope", "UserService",
    function ($scope, UserService) {
     $scope.users = [];
       
        UserService.getAllUsers().then((users) => {
            $scope.users = users.data;
          //calling the service methid
        });

    }]);