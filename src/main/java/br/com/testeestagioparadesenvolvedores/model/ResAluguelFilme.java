package br.com.testeestagioparadesenvolvedores.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * Descrição: Entidade Referência do aluguel do Filme
 * Data: 14/08/2020  02:50
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_res_aluguel_filme")
public class ResAluguelFilme {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name = "id_res_aluguel_filme")
	private Integer idResAlugelFilme;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_filme_id_filme", referencedColumnName = "id_filme", nullable = false)
	private Filme filme;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_aluguel_id_aluguel", referencedColumnName = "id_aluguel", nullable = false)
	private Aluguel aluguel;

//======================================================================================================================	
	//Construtor builder	
	public ResAluguelFilme() {
		
		
	}
	
//======================================================================================================================	
	//Construtor and fields
	public ResAluguelFilme(Integer idResAlugelFilme, Filme filme, Aluguel aluguel)  {
		super();
		this.idResAlugelFilme = idResAlugelFilme;
		this.filme = filme;
		this.aluguel = aluguel;
	}

//======================================================================================================================	
  	//Getters and Setters    
	public Integer getIdResAlugelFilme() {
		return idResAlugelFilme;
	}

	public void setIdResAlugelFilme(Integer idResAlugelFilme) {
		this.idResAlugelFilme = idResAlugelFilme;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Aluguel getAluguel() {
		return aluguel;
	}

	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}

	//======================================================================================================================	
	//ToString
	@Override
	public String toString() {
		return "ResAluguelFilme [idResAlugelFilme=" + idResAlugelFilme + ",filme=" + filme
				+ ", aluguel=" + aluguel + "]";
	}

//======================================================================================================================
	//HashCode and Equals	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluguel == null) ? 0 : aluguel.hashCode());
		result = prime * result + ((filme == null) ? 0 : filme.hashCode());
		result = prime * result + ((idResAlugelFilme == null) ? 0 : idResAlugelFilme.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResAluguelFilme other = (ResAluguelFilme) obj;
		if (aluguel == null) {
			if (other.aluguel != null)
				return false;
		} else if (!aluguel.equals(other.aluguel))
			return false;
		if (filme == null) {
			if (other.filme != null)
				return false;
		} else if (!filme.equals(other.filme))
			return false;
		if (idResAlugelFilme == null) {
			if (other.idResAlugelFilme != null)
				return false;
		} else if (!idResAlugelFilme.equals(other.idResAlugelFilme))
			return false;
		return true;
	}
}
