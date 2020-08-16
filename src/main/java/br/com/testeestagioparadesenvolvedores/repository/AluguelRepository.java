package br.com.testeestagioparadesenvolvedores.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.testeestagioparadesenvolvedores.model.Aluguel;


/*
 * Descrição: Entidade aluguel repository
 * Data: 16/08/2020  16:21
 * Autor: José Walter
 */
@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {

	// List<Aluguel> findByLastname();

}
