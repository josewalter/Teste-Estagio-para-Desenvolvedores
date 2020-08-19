//Criação do filmeController
appLocadora.controller ("filmeController", function ($scope, $http){
	
	$scope.filmes = [];
	$scope.filme = {};
	
	//Método carregar filmes
	carregarFilmes = function (){
		$http({method:'GET', url:'http://localhost:8080/filmes'})
		.then(function (response){
		    $scope.filmes = response.data;
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método salvar filme
	$scope.salvarFilme = function (filme){
		$http({method:'POST', url:'http://localhost:8080/filmes', data:$scope.filme})
		.then(function (response){
			$scope.filmes.push(response.data);
			$scope.cancelarAlteracaoFilme(); //Esse comando limpa os campos na tela
			confirm("O filme foi salvo com sucesso!!");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao salvar o filme!!");
			
		});
	};
	
	//Método excluir da parte filme
	$scope.excluirFilme = function (filme){
		$http({method:'DELETE', url:'http://localhost:8080/filmes/'+ filme.idfilme})
		.then(function (response){
			posicaoFilme = $scope.filmes.indexOf(filme);
			$scope.filmes.splice(posicaoFilme , 1);
			confirm("Deseja realmente excluir esse filme?");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao excluir o filme!!");
			
		});
	};
	
	//Método alterar filme
	$scope.alterarFilme = function (filme){
		$scope.filme = angular.copy(filme);
						
	};
	
	//Método cancelar filme
	$scope.cancelarAlteracaoFilme = function (filme){
		$scope.filme={};
		
	};
	carregarFilmes();

});