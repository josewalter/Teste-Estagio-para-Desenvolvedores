package br.com.testeestagioparadesenvolvedores.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.testeestagioparadesenvolvedores.model.Cliente;
import br.com.testeestagioparadesenvolvedores.repository.ClienteRepository;


/*
 * Descrição: Classe Cliente service
 * Data: 14/08/2020  09:10
 * Autor: José Walter
 */

@Service
public class ClienteService {
	
		@Autowired
	    ClienteRepository clienteRepository;
		
		public Cliente cadastrar(Cliente cliente){
			
			if(cliente != null){
	    		 clienteRepository.save(cliente);
		    	 System.out.println("O cliente " + cliente+ ", foi salvo com sucesso!!");
		    	 	     
    		}else{
			    System.out.println("O cliente já existe!!!");
			
		}
			return cliente;
		}
		
		
//=======================================================================================
		// Busca todos os dados do banco
		public List<Cliente> buscarTodos(){
			
			return clienteRepository.findAll();
			
		}
		
//=======================================================================================
		//Excclui um cliente do banco
		public void excluir(Cliente cliente){
			
			if(cliente.getIdCliente() != 0){
				clienteRepository.delete(cliente);
				System.out.println(" O cliente " + cliente + " foi excluido com sucesso!!");
			}else{
				System.out.println(" O cliente não foi encontrado!!");
			}
			
		}
		
//=======================================================================================
		// Faz a busca de um cliente pelo ID
		public Cliente buscarPorId(Integer id) {
			
			return clienteRepository.getOne(id);
		}
		
//=======================================================================================
		//Faz a alteração do cliente cadastrado no banco 
		public Cliente alterar(Cliente cliente){
			
			if(cliente.getIdCliente() != 0){
				clienteRepository.save(cliente);
				System.out.println(" O cliente " + cliente + " foi alterado com sucesso!!");
			}else{
				System.out.println("Não conseguimos fazer a alteração do cliente!!");
			}
			
			return cliente;
		}
	}


