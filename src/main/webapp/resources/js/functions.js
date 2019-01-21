var app = angular.module("UserManagement", []);

//Controller Part
app.controller("UserManagementController", function ($scope, $http) {

    //Initialize page with default data which is blank in this example

    $scope.quantity = "";
    $scope.measure = "";
    $scope.unit = "";
    $scope.measures = [];
    $scope.unitsOfMeasure = [];
    $scope.calculatedUnitsOfMeasure = [];

    //Now load the data from server
    _refreshPageData();

    function _refreshPageData() {
        $http({
            method: 'GET',
            url: '/units/unit-model'
        }).then(function successCallback(response) {

            $scope.quantity = response.data.quantity;
            $scope.measure = response.data.measure;
            $scope.unit = response.data.unit;
            $scope.measures = response.data.measures;
            $scope.unitsOfMeasure = response.data.unitsOfMeasure;
            $scope.calculatedUnitsOfMeasure = response.data.calculatedUnitsOfMeasure;

        }, function errorCallback(response) {
            console.log(response.statusText);
        });
    }


    $scope.submitMeasure = function (option) {
        $http({
            method: "POST",
            url: '/units/measure',
            data: option,
            headers: {
                'Content-Type': 'text/plain'
            }
        }).then(_refreshPageData, _error, $scope.measure = option);
    };

    $scope.submitUnit = function (option) {
        $http({
            method: "POST",
            url: '/units/unit',
            data: option,
            headers: {
                'Content-Type': 'text/plain'
            }
        }).then(_refreshPageData, _error, $scope.unit = option);
    };

    $scope.submitQuantity = function () {
        $http({
            method: "POST",
            url: '/units/quantity',
            data: $scope.quantity,
            headers: {
                'Content-Type': 'text/plain'
            }
        }).then(_refreshPageData, _error, console.log("cokolwiek"));
    };

    /* function _getOtherUnits() {
         $http({
             method: 'GET',
             url: '/units/other-units'
         }).then(function successCallback(response) {
             $scope.otherUnits = response.data;
         }, function errorCallback(response) {
             console.log(response.statusText);
             _refreshPageData();

         });
     }

     function _getAllMeasures() {
         $http({
             method: 'GET',
             url: '/units/measures'
         }).then(function successCallback(response) {
             $scope.measures = response.data;
         }, function errorCallback(response) {
             console.log(response.statusText);
             _getDefaultUnit();
             _getAllUnits();
         });
     }

     function _getAllUnits() {
         $http({
             method: 'GET',
             url: '/units/units-list'
         }).then(function successCallback(response) {
             $scope.units = response.data;
         }, function errorCallback(response) {
             console.log(response.statusText);
         });
     }

     function _getDefaultUnit() {
         $http({
             method: 'GET',
             url: '/units/default-unit'
         }).then(function successCallback(response) {
             $scope.selectedUnit = response.data;
         }, function errorCallback(response) {
             console.log(response.statusText);
         });
     }



     $scope.submitUnit = function (selectedUnit) {
         $http({
             method: "POST",
             url: '/units/unit',
             data: selectedUnit,
             headers: {
                 'Content-Type': 'text/plain'
             }
         }).then(_getOtherUnits(), _error);
     };

     function _refreshPageData() {
         _getAllMeasures();
         _getDefaultUnit();
         _getAllUnits();
         _getOtherUnits();
     }*/

    function _error(response) {
        console.log(response.statusText);
    }


});