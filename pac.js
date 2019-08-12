// Code goes here

var app = angular.module('sharing',[]);

app.controller('headerController', function($scope,shareDataService) {
  $scope.user = {
    name: "Guest"
  };
     $scope.getTotalCount = function(){
              return shareDataService.getTotalToDoList();
            }
      $scope.getSelectdListCount = function(){
              return shareDataService.getSelectedToDoList();
            }
});



app.controller('bodyController', function($scope, shareDataService) {


  $scope.todos =[
                {'title':'Learn Microservice','done':false},
                {'title':'Learn AngularJS ','done':false}
            ];
  
            $scope.addTodo=function(){
                $scope.todos.push({'title':$scope.newtodo,'done':false})
                $scope.newtodo=''
                shareDataService.setTotalToDoList($scope.todos.length);
            }
           
            $scope.getTotal = function(){
                shareDataService.setTotalToDoList($scope.todos.length);
             
            }
            $scope.checkedCount = function(){
                 shareDataService.setSelectedToDoList( $scope.todos.filter(function(mylist){
                return mylist.checked;
              }).length);
             
            }

   

   
});

app.service('shareDataService', function() {
var myTotalList;
var mySelectedList;
 var getTotalToDoList=function(){
      return myTotalList;
  }
 var getSelectedToDoList=function(){
      return mySelectedList;
  }
 var setTotalToDoList=function(count){
      myTotalList=count;
  }
 var setSelectedToDoList=function(count){
     mySelectedList=count
  }
 
  return {
    getTotalToDoList: getTotalToDoList,
    setTotalToDoList: setTotalToDoList,
    setSelectedToDoList: setSelectedToDoList,
    getSelectedToDoList: getSelectedToDoList
  };

 
});
