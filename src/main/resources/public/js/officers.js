var app = angular.module("demo", []);

app.controller("OfficersCtrl", function($scope, $http){
    var id;

    $scope.officers = [];
    var time = performance.now();
    $http.get('/api/officers/showall').then(function(response){
        $scope.officers = response.data;
        time = performance.now() - time;
        window.alert("Виведення відбулося за " + time + " мс.");
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

    this.createOfficers = function createOfficers(){
        var soldierId = document.getElementById('selectSoldier').value;
        var rang = document.getElementById('selectRang').value;
        var academyGraduation = document.getElementById('academyGraduation').value;
        var becameGeneral = document.getElementById('becameGeneral').value;

        var request = {
            method: 'PUT',
            url : '/api/officers/insert?soldierId=' + soldierId,
            data : {
                rang : rang,
                academyGraduation : academyGraduation,
                becameGeneral : becameGeneral
            }
        };

        var time = performance.now();
        $http(request).then(function(response){
            time = performance.now() - time;
            window.alert("Створення відбулося за " + time + " мс.");
            console.log(response);
            window.location.reload();
        });
    };

    this.startUpdate = function startUpdate(idToUpdate, soldierId, rang, academyGraduation, becameGeneral){
        id = idToUpdate;
        document.getElementById('updSelectSoldier').value = soldierId;
        document.getElementById('updSelectRang').value = rang;
        document.getElementById('updAcademyGraduation').value = academyGraduation;
        document.getElementById('updBecameGeneral').value = becameGeneral;

    };

    this.update = function update(){
        var soldierId = document.getElementById('updSelectSoldier').value;
        var rang = document.getElementById('updSelectRang').value;
        var academyGraduation = document.getElementById('updAcademyGraduation').value;
        var becameGeneral = document.getElementById('updBecameGeneral').value;

        var request = {
            method: 'POST',
            url: '/api/officers/update?id=' + id + '&soldierId=' + soldierId,
            data: {
                rang : rang,
                academyGraduation : academyGraduation,
                becameGeneral : becameGeneral
            }
        };

        var time = performance.now();
        $http(request).then(function(response){
            time = performance.now() - time;
            window.alert("Оновлення відбулося за " + time + " мс.");
            console.log(response);
            window.location.reload();
        });
    };

    this.del = function del(officersId){
        var time = performance.now();
        $http.post('/api/officers/delete?id=' + officersId).then(function(response){
            time = performance.now() - time;
            window.alert("Видалення відбулося за " + time + " мс.");
            window.location.reload();
        });
    };

    /**
     * QUERY
     */

    this.findByRang = function findByRang(){
        var rang = $('#selectRangQuery').val();

        $http.get('/api/officers/findAllByRang?rang=' + rang).then(function(response){
            $scope.officers = response.data;
        });

    }
});



