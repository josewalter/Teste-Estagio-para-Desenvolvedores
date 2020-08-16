package br.com.testeestagioparadesenvolvedores.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.testeestagioparadesenvolvedores.model.Cliente;

/*
 * Descrição: Entidade cliente repository
 * Data: 14/08/2020  10:02
 * Autor: José Walter
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	// List<Cliente> findByLastname();

}
