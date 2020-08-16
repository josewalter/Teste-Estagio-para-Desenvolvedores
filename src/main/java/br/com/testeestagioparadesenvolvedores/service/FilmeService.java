package br.com.testeestagioparadesenvolvedores.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.testeestagioparadesenvolvedores.model.Filme;
import br.com.testeestagioparadesenvolvedores.repository.FilmeRepository;


/*
 * Descrição: Classe Filme service
 * Data: 14/08/2020  22:40
 * Autor: José Walter
 */

@Service
public class FilmeService {
	
		@Autowired
	    FilmeRepository filmeRepository;
		
		public Filme cadastrar(Filme filme){
			
			if(filme != null){
				filmeRepository.save(filme);
		    	 System.out.println("O filme " + filme + ", foi salvo com sucesso!!");
		    	 	     
    		}else{
			    System.out.println("O filme já existe!!!");
			
		}
			return filme;
		}
		
		
//=======================================================================================
		// Busca todos os dados do banco
		public List<Filme> buscarTodos(){
			
			return filmeRepository.findAll();
			
		}
		
//=======================================================================================
		//Excclui um filme do banco
		public void excluir(Filme filme){
			
			if(filme.getIdFilme() != 0){
				filmeRepository.delete(filme);
				System.out.println(" O filme " + filme + " foi excluido com sucesso!!");
			}else{
				System.out.println(" O filme não foi encontrado!!");
			}
			
		}
		
//=======================================================================================
		// Faz a busca de um filme pelo ID
		public Filme buscarPorId(Integer id) {
			
			return filmeRepository.getOne(id);
		}
		
//=======================================================================================
		//Faz a alteração do filme cadastrado no banco 
		public Filme alterar(Filme filme){
			
			if(filme.getIdFilme() != 0){
				filmeRepository.save(filme);
				System.out.println(" O filme " + filme + " foi alterado com sucesso!!");
			}else{
				System.out.println("Não conseguimos fazer a alteração do filme!!");
			}
			
			return filme;
		}
	}


