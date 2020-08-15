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

import br.com.testeestagioparadesenvolvedores.model.Aluguel;
import br.com.testeestagioparadesenvolvedores.service.AluguelService;

/*
 * Descrição: Classe Aluguel Controller
 * Data: 14/08/2020  16:40
 * Autor: José Walter
 */
@RestController
public class AluguelController {
	
	@Autowired
    AluguelService aluguelService;	
	
	//EndPoints
		
	@RequestMapping(method=RequestMethod.POST,
			       value="/alugueis", consumes =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Aluguel> cadastrarAluguel
	              (@RequestBody Aluguel aluguel){
		
		Aluguel aluguelSalvo = aluguelService.cadastrar(aluguel);
		return new ResponseEntity<>(aluguelSalvo, HttpStatus.CREATED);
	}
	
//================================================================================================================
	@RequestMapping(method=RequestMethod.GET,
			       value="/alugueis", produces =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Aluguel>> buscarTodosAlugueis(){
		
		List<Aluguel> aluguelEncontrado = aluguelService.buscarTodos();
		return new ResponseEntity<>(aluguelEncontrado, HttpStatus.OK);
	}
	
//================================================================================================================	
	@RequestMapping(method=RequestMethod.DELETE, value="/alugueis/{id}")
	public ResponseEntity<Aluguel> excluirAluguel(@PathVariable Integer id){
		
		Aluguel aluguelEncontrado = aluguelService.buscarPorId(id);
		if (aluguelEncontrado == null){
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		  	
		} else{
			aluguelService.excluir(aluguelEncontrado);
			return new ResponseEntity<>(HttpStatus.OK);	
		}		
	}
	
//=================================================================================================================	
	@RequestMapping(method=RequestMethod.PUT,
			       value="/alugueis", consumes =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Aluguel> alterarAlterar
	       (@RequestBody Aluguel aluguel){
		
	     Aluguel aluguelAlterado = aluguelService.alterar(aluguel);
		return new ResponseEntity<>(aluguelAlterado, HttpStatus.OK);
	}

}
