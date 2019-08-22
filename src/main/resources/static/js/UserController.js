var module = angular.module('employee.controllers', []);
module.controller("UserController", ["$scope", "UserService",
    function ($scope, UserService) {
     $scope.allUsers = [];
     $scope.currentUserId = 0;
     $scope.fetchUser = () => {
        UserService.getUserById($scope.currentUserId).then((user) => {
            $scope.UserById=user.data;  
            console.log(user.data); 
        });
     }
     //get all the users, using service interface
     // then(users)-> its a function called as calledback , users is the result that we get from getALLusers()
     //or can even use await fetch()


    /*
    * users = await UserService.getAllUsers();
    * $scope.users = users.data;
    */

        UserService.getAllUsers().then((users) => {
            $scope.allUsers = users.data;
          //calling the service methid
        });
    }]);