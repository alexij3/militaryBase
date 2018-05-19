var app = angular.module("demo", []);

app.controller("WeaponryInMbaseCtrl", function($scope, $http){
    var id;

    $scope.weaponry = [];
    $http.get('/api/weaponryinmbase/showall').then(function(response){
        $scope.weaponry = response.data;
        var bases = [];
        $http.get('/api/militarybase/showall').then(function(response){
            bases = response.data;
            var select = document.getElementById('militaryBase');
            var selectMbaseUpd = document.getElementById('updMilitaryBase');

            for (var i = 0; i < bases.length; i++) {
                var option = document.createElement("option");
                option.text = bases[i].name;
                option.value = bases[i].id;

                select.add(option);

                console.log(select);
            }

            for (var j = 0; j < bases.length; j++){
                var option2 = document.createElement("option");
                option2.text = bases[j].name;
                option2.value = bases[j].id;

                selectMbaseUpd.add(option2);

                console.log(selectMbaseUpd);
            }

        });

        var weaponryToAdd = [];
        $http.get('/api/weaponry/showall').then(function(response){
            weaponryToAdd = response.data;
            var select = document.getElementById('weaponry');
            var selectweaponryUpd = document.getElementById('updWeaponry');

            for (var i = 0; i < weaponryToAdd.length; i++) {
                var option = document.createElement("option");
                option.text = weaponryToAdd[i].name;
                option.value = weaponryToAdd[i].id;

                select.add(option);

                console.log(select);
            }

            for (var j = 0; j < weaponryToAdd.length; j++) {
                var option2 = document.createElement("option");
                option2.text = weaponryToAdd[j].name;
                option2.value = weaponryToAdd[j].id;

                selectweaponryUpd.add(option2);

                console.log(selectweaponryUpd);
            }
        });

    });


    this.createWeaponryInMbase = function createweaponryInMbase(){
        var militaryBaseId = document.getElementById('militaryBase').value;
        var weaponryId = document.getElementById('weaponry').value;
        var amount = document.getElementById('amount').value;

        var request = {
            method: 'PUT',
            url : '/api/weaponryinmbase/insert?mbaseId=' + militaryBaseId + '&weaponryId=' + weaponryId + '&amount=' + amount
        };

        $http(request).then(function(response){
            console.log(response);
            window.location.reload();
        });
    };

    this.startUpdate = function startUpdate(idToUpdate, militaryBaseId, weaponryId, amount){
        id = idToUpdate;
        document.getElementById('updMilitaryBase').value = militaryBaseId;
        document.getElementById('updWeaponry').value = weaponryId;
        document.getElementById('updAmount').value = amount;
    };

    this.update = function update(){
        var militaryBaseId = document.getElementById('updMilitaryBase').value;
        var weaponryId = document.getElementById('updWeaponry').value;
        var amount = document.getElementById('updAmount').value;

        var request = {
            method: 'POST',
            url: '/api/weaponryinmbase/update?id=' + id + '&mbaseId=' + militaryBaseId + '&weaponryId=' + weaponryId
                                                    + '&amount=' + amount
        };

        $http(request).then(function(response){
            console.log(response);
            window.location.reload();
        });
    };

    this.del = function del(weaponryInMbaseId){
        $http.post('/api/weaponryinmbase/delete?id=' + weaponryInMbaseId).then(function(response){
            window.location.reload();
        });
    }
});



