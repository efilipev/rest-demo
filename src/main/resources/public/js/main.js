var app = angular.module("rest-demo", ['ngRoute']);

app.config([
  '$locationProvider', '$routeProvider',
  function config($locationProvider, $routeProvider) {
    $locationProvider.hashPrefix('!');

    $routeProvider.when('/', {
      controller:  "AppCtrl",
      templateUrl: "teams.html"
    }).when('/roster/:teamNAme', {
      controller:  "rosterCtrl",
      templateUrl: "roster.html"
    }).otherwise('/');
  }
]);

app.controller("AppCtrl", function($scope) {

  $scope.imageSource = [
    "Avalanche", "Blackhawks", "Blue Jackets", "Blues", "Bruins", "Canadiens", "Canucks", "Capitals", "Sharks", "Coyotes", "Devils", "Ducks", "Flames",
    "Flyers", "Golden Knights", "Hurricanes", "Islanders", "Jets", "Lightning", "Kings", "Maple Leafs", "Oilers", "Panthers", "Penguins", "Predators", "Rangers", "Red Wings", "Sabres",
    "Senators", "Stars", "Wild"
  ];

  $scope.websites = getWebsites();

  $scope.getImgSource = function() {
    for (var i = 0; imageSource.length; i++) {
      console.log(imageSource[i]);
    }
  };

  $scope.getImagePath = function(imgName) {
    return "src/" + imgName + ".gif";
  };

});

app.controller("rosterCtrl", function($scope, $http, $routeParams) {

  $scope.roster = getRoster($routeParams.teamNAme);
  $scope.teamInfo = getWebsites();
  $scope.imageSource = [
      "Avalanche", "Blackhawks", "Blue Jackets", "Blues", "Bruins", "Canadiens", "Canucks", "Capitals", "Sharks", "Coyotes", "Devils", "Ducks", "Flames",
      "Flyers", "Golden Knights", "Hurricanes", "Islanders", "Jets", "Lightning", "Kings", "Maple Leafs", "Oilers", "Panthers", "Penguins", "Predators", "Rangers", "Red Wings", "Sabres",
      "Senators", "Stars", "Wild"
    ];
  $scope.getImgSource = function() {
      for (var i = 0; imageSource.length; i++) {
            console.log(imageSource[i]);
        }
    };
  $scope.getImagePath = function(imgName) {
        return "src/" + imgName + ".gif";
    };

  $http.get(`http://localhost:8080/roster/${$routeParams.teamNAme}`).then(function(response) {
    $scope.teamInfo = response.data;
    console.log(response.data);
  });

});

function getRoster(teamNAme) {

  let websites = getWebsites();
  let roster = {};

  websites.every((team) => {
    if (team.teamNAme === teamNAme) {
      roster = team;
      return false;
    }
    return true;
  });

  return roster;
}

function getWebsites() {
 return [];

}