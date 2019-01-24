var app = angular.module("UnitManagement", []);

//Controller Part
app.controller("UnitManagementController", function ($scope, $http) {

    //Initialize page with default data which is blank in this example

    $scope.quantity = "";
    $scope.measure = "";
    $scope.unit = "";
    $scope.measures = [];
    $scope.unitsOfMeasure = [];
    $scope.calculatedUnitsOfMeasure = [];

    //load the data from server
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
        }).then(_refreshPageData, _error);
    };


    function _error(response) {
        console.log(response.statusText);
    }

});