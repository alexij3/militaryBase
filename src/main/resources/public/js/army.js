var app = angular.module("demo", []);

app.controller("ArmyCtrl", function($scope, $http){
    var idToUpdate;
    var genres = [];

    var time = performance.now();
    $scope.armies = [];
     $http.get('/api/army/showall').then(function (response){
         time = performance.now() - time;
         console.log("Виведення відбулося за " + time + " мс.");
        $scope.armies=response.data;
        console.log(response);
    });

    this.deleteArmy = function deleteArmy(id){
        var time = performance.now();
        $http.get('/api/army/delete?id=' + id).then(function(){
            time = performance.now() - time;
            console.log("Видалення відбулося за " + time + " мс.");
            window.alert("Видалено армію з ІД " + id);
            window.location.reload();
        });
    };

    this.createArmy = function createArmy(){
        var name = document.getElementById('armyName').value;
        var codeNumber = document.getElementById('armyCode').value;
        var createRequest = {
            method: 'PUT',
            url: '/api/army/create',
            data : {
                codeNumber : codeNumber,
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

    this.startUpdateArmy = function startUpdateArmy(id, name, code){
        document.getElementById('updateArmyName').value = name;
        document.getElementById('updateArmyCode').value = code;
        idToUpdate = id;
    };

    this.updateArmy = function updateArmy(){
        var name = document.getElementById('updateArmyName').value;
        var codeNumber = document.getElementById('updateArmyCode').value;
        var request = {
            method: 'POST',
            url : '/api/army/update?id=' + idToUpdate,
            data: {
                codeNumber : codeNumber,
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

    this.getArmy = function getArmy(id){
        $http.get('/api/army/get?id=' + id);
    }
});



