angular
		.module('app', [])
		.controller(
				'peopleController',
				function($scope, $http) {
					
					// Carga inicial de datos de todas las personas
					$http
							.get('/people/')
							.then(
									function(response) {
										console
												.log('Recibidos datos desde el controller de personas: '
														+ JSON
																.stringify(response.data));
										$scope.peopleList = response.data;
									});

					// Buscar por dni
					$scope.searchByDni = function() {
						$http
								.get('/people?dni=' + $scope.dniToSearch)
								.then(
										function(response) {
											console
													.log('Recibidos datos desde el controller de personas: '
															+ JSON
																	.stringify(response.data));
											$scope.peopleList = response.data;
										});
					}

				});