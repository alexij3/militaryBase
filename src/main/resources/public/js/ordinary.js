var app = angular.module("demo", []);

app.controller("OrdinaryCtrl", function($scope, $http){
    var id;

    $scope.ordinary = [];
    $http.get('/api/ordinary/showall').then(function(response){
        $scope.ordinary = response.data;

    });

    var soldiers = [];
    $http.get('/api/soldier/showall').then(function(response){
        soldiers = response.data;
        var select = document.getElementById('selectSoldier');
        var selectSoldierUpd = document.getElementById('updSelectSoldier');

        for (var i = 0; i < soldiers.length; i++) {
            var option = document.createElement("option");
            option.text = soldiers[i].name;
            option.value = soldiers[i].id;

            select.add(option);

            console.log(select);
        }

        for (var j = 0; j < soldiers.length; j++){
            var option2 = document.createElement("option");
            option2.text = soldiers[j].name;
            option2.value = soldiers[j].id;

            selectSoldierUpd.add(option2);

            console.log(selectSoldierUpd);
        }
    });

    this.createOrdinary = function createOrdinary(){
        var soldierId = document.getElementById('selectSoldier').value;
        var rang = document.getElementById('selectRang').value;

        var request = {
            method: 'PUT',
            url : '/api/ordinary/insert?soldierId=' + soldierId + '&rang=' + rang
        };

        $http(request).then(function(response){
            console.log(response);
            window.location.reload();
        });
    };

    this.startUpdate = function startUpdate(idToUpdate, soldierId, rang){
        id = idToUpdate;
        document.getElementById('updSelectSoldier').value = soldierId;
        document.getElementById('updSelectRang').value = rang;

    };

    this.update = function update(){
        var soldierId = document.getElementById('updSelectSoldier').value;
        var rang = document.getElementById('updSelectRang').value;

        var request = {
            method: 'POST',
            url: '/api/ordinary/update?id=' + id + '&soldierId=' + soldierId + '&rang=' + rang
        };

        $http(request).then(function(response){
            console.log(response);
            window.location.reload();
        });
    };

    this.del = function del(ordinaryId){
        $http.post('/api/ordinary/delete?id=' + ordinaryId).then(function(response){
            window.location.reload();
        });
    }
});



