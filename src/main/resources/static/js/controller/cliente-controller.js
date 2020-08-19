//Criação do clienteController
appLocadora.controller ("clienteController", function ($scope, $http){
	
	$scope.clientes = [];
	$scope.cliente = {};
	
	//Método carregar clientes
	carregarClientes = function (){
		$http({method:'GET', url:'http://localhost:8080/clientes'})
		.then(function (response){
		    $scope.clientes = response.data;
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método salvar cliente
	$scope.salvarCliente = function (cliente){
		$http({method:'POST', url:'http://localhost:8080/clientes', data:$scope.cliente})
		.then(function (response){
			$scope.clientes.push(response.data);
			$scope.cancelarAlteracaoCliente(); //Esse comando limpa os campos na tela
			confirm("O cliente foi salvo com sucesso!!");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao salvar o cliente!!");
			
		});
	};
	
	//Método excluir da parte cliente
	$scope.excluirCliente = function (cliente){
		$http({method:'DELETE', url:'http://localhost:8080/clientes/'+cliente.idCliente})
		.then(function (response){
			posicaoCliente = $scope.clientes.indexOf(cliente);
			$scope.clientes.splice(posicaoCliente , 1);
			confirm("Deseja realmente excluir esse cliente?");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao excluir o cliente!!");
			
		});
	};
	
	//Método alterar cliente
	$scope.alterarCliente = function (cliente){
		$scope.cliente = angular.copy(cliente);
						
	};
	
	//Método cancelar cliente
	$scope.cancelarAlteracaoCliente = function (cliente){
		$scope.cliente={};
		
	};
	carregarClientes();

});