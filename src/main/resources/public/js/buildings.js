var app = angular.module("demo", []);

app.controller("BuildingsCtrl", function($scope, $http){
    var idToUpdate;

    var time = performance.now();
    $scope.buildings = [];
     $http.get('/api/buildings/showall').then(function (response){
         time = performance.now() - time;
         console.log("Виведення відбулося за " + time + " мс.");
        $scope.buildings=response.data;
        console.log(response);
    });

    this.deleteBuildings = function deleteBuildings(id){
        var time = performance.now();
        $http.get('/api/buildings/delete?id=' + id).then(function(){
            time = performance.now() - time;
            console.log("Видалення відбулося за " + time + " мс.");
            window.location.reload();
        });
    };

    this.createBuildings = function createBuildings(){
        var name = document.getElementById('buildingsName').value;
        var createRequest = {
            method: 'PUT',
            url: '/api/buildings/create',
            data : {
                name : name
            }
        };

        var time = performance.now();
        $http(createRequest).then(function(response){
            time = performance.now() - time;
            console.log("Створення відбулося за " + time + " мс.");
            console.log(response);
            window.location.reload();
        });
    };

    this.startUpdateBuildings = function startUpdateBuildings(id, name){
        document.getElementById('updateBuildingsName').value = name;
        idToUpdate = id;
    };

    this.updateBuildings = function updateBuildings(){
        var name = document.getElementById('updateBuildingsName').value;
        var request = {
            method: 'POST',
            url : '/api/buildings/update?id=' + idToUpdate,
            data: {
                name : name
            }
        };

        var time = performance.now();
        $http(request).then(function (response){
            time = performance.now() - time;
            console.log("Оновлення відбулося за " + time + " мс.");
            console.log(response);
            window.location.reload();
        });
    };

    this.getBuildings = function getBuildings(id){
        $http.get('/api/buildings/get?id=' + id);
    }
});



