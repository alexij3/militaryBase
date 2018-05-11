var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){


    $scope.armies = [];
     $http.get('/api/army').then(function (response){
        $scope.armies=response.data;
        console.log(response);
    });

    $scope.soldiers = [];
    $http.get('/api/soldier').then(function (response){
        $scope.soldiers=response.data;
        console.log(response);
    });

    $scope.militaryBases = [];
    $http.get('/api/militarybase').then(function (response){
        $scope.militaryBases=response.data;
        console.log(response);
    });

    $scope.brigades = [];
    $http.get('/api/brigade').then(function (response){
        $scope.brigades=response.data;
        console.log(response);
    });

    $scope.corps = [];
    $http.get('/api/corps').then(function (response){
        $scope.corps=response.data;
        console.log(response);
    });

    $scope.departments = [];
    $http.get('/api/department').then(function (response){
        $scope.departments=response.data;
        console.log(response);
    });

    $scope.divisions = [];
    $http.get('/api/division').then(function (response){
        $scope.divisions=response.data;
        console.log(response);
    });

    $scope.officers = [];
    $http.get('/api/officers').then(function (response){
        $scope.officers=response.data;
        console.log(response);
    });

    $scope.ordinaries = [];
    $http.get('/api/ordinary').then(function (response){
        $scope.ordinaries=response.data;
        console.log(response);
    });

    $scope.platoons = [];
    $http.get('/api/platoon').then(function (response){
        $scope.platoons=response.data;
        console.log(response);
    });


    $scope.specialties = [];
    $http.get('/api/specialty').then(function (response){
        $scope.specialties=response.data;
        console.log(response);
    });

    $scope.ordinaries = [];
    $http.get('/api/ordinary').then(function (response){
        $scope.ordinaries=response.data;
        console.log(response);
    });

    $scope.squadrons = [];
    $http.get('/api/squadron').then(function (response){
        $scope.squadrons=response.data;
        console.log(response);
    });

    $scope.transports = [];
    $http.get('/api/transport').then(function (response){
        $scope.transports=response.data;
        console.log(response);
    });

    $scope.transportInMbase = [];
    $http.get('/api/transportinmbase').then(function (response){
        $scope.transportInMbase=response.data;
        console.log(response);
    });

    $scope.weaponry = [];
    $http.get('/api/weaponry').then(function (response){
        $scope.weaponry=response.data;
        console.log(response);
    });

    $scope.weaponryInMbase = [];
    $http.get('/api/weaponryinmbase').then(function (response){
        $scope.weaponryInMbase=response.data;
        console.log(response);
    });

    $scope.buildings = [];
    $http.get('/api/buildings').then(function (response){
        $scope.buildings=response.data;
        console.log(response);
    });

});

