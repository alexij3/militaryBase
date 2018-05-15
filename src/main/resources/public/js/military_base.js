var app = angular.module("demo", []);

app.controller("MilitaryBaseCtrl", function($scope, $http){
    $scope.militaryBase = [];
    $http.get('/api/militarybase/showall').then(function(response){
        $scope.militaryBase = response.data;
        $http.get('/api/soldier/showall').then(function(response) {
            console.log(response);
            var captain = response.data;
            var select = document.getElementById('selectCaptain');
            var selectCaptainUpd = document.getElementById('updateSelectCaptain');

            for (var i = 0; i < captain.length; i++) {
                var option = document.createElement("option");
                option.text = captain[i].name;
                option.value = captain[i].id;

                select.append(option);

                console.log(select);
            }

            for (var j = 0; j < captain.length; j++){
                var option2 = document.createElement("option");
                option2.text = captain[j].name;
                option2.value = captain[j].id;

                selectCaptainUpd.add(option2);
                console.log(selectCaptainUpd);
            }
        });
    });

    $http.get('/api/army/showall').then(function(response) {
        console.log(response);
        var armies = response.data;
        var select = document.getElementById('selectArmy');
        var selectArmyUpd = document.getElementById('updateSelectArmy');

        for (var i = 0; i < armies.length; i++) {
            var option = document.createElement("option");
            option.text = armies[i].name;
            option.value = armies[i].id;

            select.add(option);

            console.log(select);
        }

        for (var j = 0; j < armies.length; j++){
            var option2 = document.createElement("option");
            option2.text = armies[j].name;
            option2.value = armies[j].id;

            selectArmyUpd.add(option2);
            console.log(selectArmyUpd);
        }


    });

    $http.get('/api/division/showall').then(function(response) {
        console.log(response);
        var divisions = response.data;
        var select = document.getElementById('selectDivision');
        var selectDivisionUpd = document.getElementById('updateSelectDivision');

        for (var i = 0; i < divisions.length; i++) {
            var option = document.createElement("option");
            option.text = divisions[i].name;
            option.value = divisions[i].id;

            select.append(option);

            console.log(select);
        }

        for (var j = 0; j < divisions.length; j++){
            var option2 = document.createElement("option");
            option2.text = divisions[j].name;
            option2.value = divisions[j].id;

            selectDivisionUpd.add(option2);
            console.log(selectDivisionUpd);
        }


    });

    $http.get('/api/corps/showall').then(function(response) {
        console.log(response);
        var corps = response.data;
        var select = document.getElementById('selectCorps');
        var selectCorpsUpd = document.getElementById('updateSelectCorps');

        for (var i = 0; i < corps.length; i++) {
            var option = document.createElement("option");
            option.text = corps[i].name;
            option.value = corps[i].id;

            select.append(option);

            console.log(select);
        }

        for (var j = 0; j < corps.length; j++){
            var option2 = document.createElement("option");
            option2.text = corps[j].name;
            option2.value = corps[j].id;

            selectCorpsUpd.add(option2);
            console.log(selectCorpsUpd);
        }


    });

    $http.get('/api/brigade/showall').then(function(response) {
        console.log(response);
        var brigade = response.data;
        var select = document.getElementById('selectBrigade');
        var selectBrigadeUpd = document.getElementById('updateSelectBrigade');

        for (var i = 0; i < brigade.length; i++) {
            var option = document.createElement("option");
            option.text = brigade[i].name;
            option.value = brigade[i].id;

            select.append(option);

            console.log(select);
        }

        for (var j = 0; j < brigade.length; j++){
            var option2 = document.createElement("option");
            option2.text = brigade[j].name;
            option2.value = brigade[j].id;

            selectBrigadeUpd.add(option2);
            console.log(selectBrigadeUpd);
        }
    });

    this.createMilitaryBase = function createMilitaryBase(){
        var name = document.getElementById('militaryBaseName').value;
        var armyId = document.getElementById('selectArmy').value;
        var divisionId = document.getElementById('selectDivision').value;
        var corpsId = document.getElementById('selectCorps').value;
        var brigadeId = document.getElementById('selectBrigade').value;
        var captainId = document.getElementById('selectCaptain').value;

        var request = {
            method: 'PUT',
            url: '/api/militarybase/create',
            data: {
                name : name,
                armyId: armyId,
                divisionId : divisionId,
                corpsId : corpsId,
                brigadeId : brigadeId,
                captainId : captainId
            }
        };

        var time = performance.now();
        $http(request).then(function(response){
            time = performance.now() - time;
            console.log("Створення відбулося за " + time + " мс.");
            console.log(response);
        });

        window.location.reload();
    };
});

$(function(){
    var divisionRadio = $("#divisionRadio");
    var divisionSelect = $("#selectDivision");

    divisionRadio.change(function(){
        if (this.checked) {
            divisionSelect.disabled = true;
        }else  divisionSelect.disabled = true;
    });
});



