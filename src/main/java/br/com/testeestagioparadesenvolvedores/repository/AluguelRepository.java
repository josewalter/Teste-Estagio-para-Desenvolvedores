package br.com.testeestagioparadesenvolvedores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.testeestagioparadesenvolvedores.model.Aluguel;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer>{

}
