package br.com.testeestagioparadesenvolvedores.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.testeestagioparadesenvolvedores.model.Cliente;
import br.com.testeestagioparadesenvolvedores.model.Filme;
import br.com.testeestagioparadesenvolvedores.service.ClienteService;
import br.com.testeestagioparadesenvolvedores.service.FilmeService;


/*
 * Descrição: Classe Filme Controller
 * Data: 14/08/2020  21:49
 * Autor: José Walter
 */
@RestController
public class FilmeController {
	
	@Autowired
    FilmeService filmeService;	
	
	//EndPoints
		
	@RequestMapping(method=RequestMethod.POST,
			       value="/filmes", consumes =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Filme> cadastrarFilme
	              (@RequestBody Filme filme){
		
		Filme filmeSalvo = filmeService.cadastrar(filme);
		return new ResponseEntity<>(filmeSalvo, HttpStatus.CREATED);
	}
	
//================================================================================================================
	@RequestMapping(method=RequestMethod.GET,
			       value="/filmes", produces =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Filme>> buscarTodosFilmes(){
		
		List<Filme> filmeEncontrado = filmeService.buscarTodos();
		return new ResponseEntity<>(filmeEncontrado, HttpStatus.OK);
	}
	
//================================================================================================================	
	@RequestMapping(method=RequestMethod.DELETE, value="/filmes/{id}")
	public ResponseEntity<Filme> excluirFilme(@PathVariable Integer id){
		
		Filme filmeEncontrado = filmeService.buscarPorId(id);
		if (filmeEncontrado == null){
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		  	
		} else{
			filmeService.excluir(filmeEncontrado);
			return new ResponseEntity<>(HttpStatus.OK);	
		}		
	}
	
//=================================================================================================================	
	@RequestMapping(method=RequestMethod.PUT,
			       value="/filmes", consumes =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Filme> alterarFilme
	       (@RequestBody Filme filme){
		
		Filme filmeAlterado = filmeService.alterar(filme);
		return new ResponseEntity<>(filmeAlterado, HttpStatus.OK);
	}

}
