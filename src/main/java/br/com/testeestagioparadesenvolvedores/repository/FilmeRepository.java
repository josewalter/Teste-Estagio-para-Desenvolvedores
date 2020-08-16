package br.com.testeestagioparadesenvolvedores.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.testeestagioparadesenvolvedores.model.Filme;

/*
 * Descrição: Entidade filme repository
 * Data: 14/08/2020  23:02
 * Autor: José Walter
 */
@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {

	// List<Filme> findByLastname();

}
