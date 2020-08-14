package br.com.testeestagioparadesenvolvedores.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Descrição: Entidade Referência do aluguel do Filme
 * Data: 14/08/2020  02:50
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_res_aluguel_filme")
public class ReferenciaAluguelFilme {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id_res_aluguel_filme")
	private Integer idReferenciaAlugelFilme;

	@Column(name = "id_filme")
	private Integer idFilme;
	
	@Column(name = "id_aluguel")
	private Integer idAluguel;

//======================================================================================================================	
	//Construtor builder	
	public ReferenciaAluguelFilme() {
		super();
		
	}
	
//======================================================================================================================	
	//Construtor and fields
	public ReferenciaAluguelFilme(Integer idReferenciaAlugelFilme, Integer idFilme, Integer idAluguel) {
		super();
		this.idReferenciaAlugelFilme = idReferenciaAlugelFilme;
		this.idFilme = idFilme;
		this.idAluguel = idAluguel;
	}

//======================================================================================================================	
  	//Getters and Setters    
	public Integer getIdReferenciaAlugelFilme() {
		return idReferenciaAlugelFilme;
	}

	public void setIdReferenciaAlugelFilme(Integer idReferenciaAlugelFilme) {
		this.idReferenciaAlugelFilme = idReferenciaAlugelFilme;
	}

	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}

	public Integer getIdAluguel() {
		return idAluguel;
	}

	public void setIdAluguel(Integer idAluguel) {
		this.idAluguel = idAluguel;
	}	

//======================================================================================================================	
	//ToString
	@Override
	public String toString() {
		return "ReferenciaAluguelFilme [idReferenciaAlugelFilme=" + idReferenciaAlugelFilme + ", idFilme=" + idFilme
				+ ", idAluguel=" + idAluguel + "]";
	}

//======================================================================================================================
	//HashCode and Equals	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAluguel == null) ? 0 : idAluguel.hashCode());
		result = prime * result + ((idFilme == null) ? 0 : idFilme.hashCode());
		result = prime * result + ((idReferenciaAlugelFilme == null) ? 0 : idReferenciaAlugelFilme.hashCode());
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
		ReferenciaAluguelFilme other = (ReferenciaAluguelFilme) obj;
		if (idAluguel == null) {
			if (other.idAluguel != null)
				return false;
		} else if (!idAluguel.equals(other.idAluguel))
			return false;
		if (idFilme == null) {
			if (other.idFilme != null)
				return false;
		} else if (!idFilme.equals(other.idFilme))
			return false;
		if (idReferenciaAlugelFilme == null) {
			if (other.idReferenciaAlugelFilme != null)
				return false;
		} else if (!idReferenciaAlugelFilme.equals(other.idReferenciaAlugelFilme))
			return false;
		return true;
	}
}
