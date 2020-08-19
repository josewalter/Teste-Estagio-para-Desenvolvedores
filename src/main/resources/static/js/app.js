//Criação do modulo principal da aplicação
var appLocadora = angular.module("appLocadora",['ngRoute']);

appLocadora.config(function ($routeProvider, $locationProvider){
	
	$routeProvider
	.when("/clientes",      {
		templateUrl:'view/cliente.html',       
		controller:'clienteController'
	}).when("/alugueis",  {
		templateUrl:'view/alugueis.html',   
		controller:'aluguelController'
	}).when("/filmes",  {
		templateUrl:'view/filme.html',    
		controller:'filmeController'
	}).otherwise({rediretTo:'/'
	});
});



