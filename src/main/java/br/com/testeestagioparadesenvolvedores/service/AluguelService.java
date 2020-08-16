package br.com.testeestagioparadesenvolvedores.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.testeestagioparadesenvolvedores.model.Aluguel;
import br.com.testeestagioparadesenvolvedores.repository.AluguelRepository;


/*
 * Descrição: Classe Aluguel service
 * Data: 14/08/2020  16:10
 * Autor: José Walter
 */

@Service
public class AluguelService {
	
		@Autowired
	    AluguelRepository aluguelRepository;
		
		public Aluguel cadastrar(Aluguel aluguel){
			
			if(aluguel != null){
				aluguelRepository.save(aluguel);
		    	 System.out.println("O aluguel " + aluguel + ", foi salvo com sucesso!!");
		    	 	     
    		}else{
			    System.out.println("O aluguel já existe!!!");
			
		}
			return aluguel;
		}
		
		
//=======================================================================================
		// Busca todos os dados do banco
		public List<Aluguel> buscarTodos(){
			
			return aluguelRepository.findAll();
			
		}
		
//=======================================================================================
		//Excclui um aluguel do banco
		public void excluir(Aluguel aluguel){
			
			if(aluguel.getIdAluguel() != 0){
				aluguelRepository.delete(aluguel);
				System.out.println(" O aluguel " + aluguel + " foi excluido com sucesso!!");
			}else{
				System.out.println(" O aluguel não foi encontrado!!");
			}
			
		}
		
//=======================================================================================
		// Faz a busca de um aluguel pelo ID
		public Aluguel buscarPorId(Integer id) {
			
			return aluguelRepository.getOne(id);
		}
		
//=======================================================================================
		//Faz a alteração do aluguel cadastrado no banco 
		public Aluguel alterar(Aluguel aluguel){
			
			if(aluguel.getIdAluguel() != 0){
				aluguelRepository.save(aluguel);
				System.out.println(" O aluguel " + aluguel + " foi alterado com sucesso!!");
			}else{
				System.out.println("Não conseguimos fazer a alteração do aluguel!!");
			}
			
			return aluguel;
		}
	}


