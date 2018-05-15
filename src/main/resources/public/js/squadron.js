var app = angular.module("demo", []);

app.controller("SquadronCtrl", function($scope, $http){
    var idToUpdate;

    var time = performance.now();
    $scope.squadron = [];
     $http.get('/api/squadron/showall').then(function (response){
         time = performance.now() - time;
         console.log("Виведення відбулося за " + time + " мс.");
        $scope.squadron=response.data;
        console.log(response);
    });

    this.deleteSquadron = function deleteSquadron(id){
        var time = performance.now();
        $http.get('/api/squadron/delete?id=' + id).then(function(){
            time = performance.now() - time;
            console.log("Видалення відбулося за " + time + " мс.");
            window.location.reload();
        });
    };

    this.createSquadron = function createSquadron(){
        var name = document.getElementById('squadronName').value;
        var codeNumber = document.getElementById('squadronCode').value;
        var createRequest = {
            method: 'PUT',
            url: '/api/squadron/create',
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

    this.startUpdateSquadron = function startUpdateSquadron(id, name, code){
        document.getElementById('updateSquadronName').value = name;
        document.getElementById('updateSquadronCode').value = code;
        idToUpdate = id;
    };

    this.updateSquadron = function updateSquadron(){
        var name = document.getElementById('updateSquadronName').value;
        var codeNumber = document.getElementById('updateSquadronCode').value;
        var request = {
            method: 'POST',
            url : '/api/squadron/update?id=' + idToUpdate,
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

    this.getSquadron = function getSquadron(id){
        $http.get('/api/squadron/get?id=' + id);
    }
});



