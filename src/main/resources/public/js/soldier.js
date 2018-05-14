var app = angular.module("demo", []);

app.controller("SoldierCtrl", function($scope, $http){
    var idToUpdate;

    var time = performance.now();
    $scope.soldier = [];
     $http.get('/api/soldier/showall').then(function (response){
         time = performance.now() - time;
         console.log("Виведення відбулося за " + time + " мс.");
         $scope.soldier=response.data;
         console.log(response);

         $http.get('/api/militarybase/showall').then(function(response){
             var militaryBases = response.data;
             var select = document.getElementById('selectMilitaryBases');

             for (var i = 0; i < militaryBases.length; i++){
                 var option = document.createElement("option");
                 option.text = militaryBases[i].name;
                 option.value = militaryBases[i].id;

                 select.add(option);
                 console.log(select);
             }
         });
    });

    this.deleteSoldier = function deleteSoldier(id){
        var time = performance.now();
        $http.get('/api/soldier/delete?id=' + id).then(function(){
            time = performance.now() - time;
            console.log("Видалення відбулося за " + time + " мс.");
            window.location.reload();
        });
    };

    this.createSoldier = function createSoldier(){
        var name = document.getElementById('soldierName').value;
        var age = document.getElementById('soldierAge').value;
        var militaryBaseId = document.getElementById('militaryBase').value;

        var createRequest = {
            method: 'PUT',
            url: '/api/soldier/create',
            data : {
                name : name,
                age : age,
                militaryBaseId: militaryBaseId
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

    this.startUpdateSoldier = function startUpdateSoldier(id, name){
        document.getElementById('updateSoldierName').value = name;
        idToUpdate = id;
    };

    this.updateSoldier = function updateSoldier(){
        var name = document.getElementById('updateSoldierName').value;
        var request = {
            method: 'POST',
            url : '/api/soldier/update?id=' + idToUpdate,
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

    this.getSoldier = function getSoldier(id){
        $http.get('/api/soldier/get?id=' + id);
    }
});



