var app = angular.module("demo", []);

app.controller("SoldierSpecialtiesCtrl", function($scope, $http) {
    var soldierId;
    var soldierName;
    var soldierMilitaryBaseId;
    var soldierAge;
    var delSpecialties = [];
    var specialties = [];

    $scope.soldiers = [];
    $http.get('/api/soldier/showall').then(function (response) {
        $scope.soldiers = response.data;
    });

    this.addSpecialties = function addSpecialties(){
        specialties = $scope.selectedSpecialties;
        var request = {
            method: 'PUT',
            url: '/api/soldier/updatespecialties?id=' + soldierId,
            data: {
                name : soldierName,
                age : soldierAge,
                specialty : specialties,
                militaryBaseId: soldierMilitaryBaseId
            }
        };

        $http(request).then(function(){
            window.location.reload();
        });
    };

    this.startAddSpecialties = function startAddSpecialties(id, name, age, militaryBaseId){
        soldierId = id;
        soldierName = name;
        soldierAge = age;
        soldierMilitaryBaseId = militaryBaseId;
        document.getElementById('soldierName').innerHTML = name;
    };

    this.startDeleteSpecialties = function startDeleteSpecialties(idSoldier, name, specialtiesToDelete){
        soldierId = idSoldier;
        soldierName = name;
        document.getElementById('delArtistName').innerHTML = name;

        specialties = specialtiesToDelete;
        var select = document.getElementById('delSelectSpecialties');

        for (var i = 0; i < specialties.length; i++) {
            var option = document.createElement("option");
            option.text = specialties[i];
            option.value = specialties[i];

            select.add(option);

            console.log(select);
        }
    };

    this.deleteSpecialties = function deleteSpecialties(){
        specialties = $('#delSelectSpecialties').val();
        var request = {
            method: 'POST',
            url: '/api/soldier/deletespecialties?soldierId=' + soldierId,
            data: {
                name : soldierName,
                specialty : specialties
            }
        };

        $http(request).then(function(response){
            document.getElementById('delSelectSpecialties').options.length = 0;
            window.location.reload();
        });
    };

    function removeItems(selectBox){
        for (var i = selectBox.length-1; i >= 0; i--){
            selectBox.remove(i);
        }
    }

    this.onClose = function onClose(){
        removeItems(document.getElementById('delSelectSpecialties'));
    }
});