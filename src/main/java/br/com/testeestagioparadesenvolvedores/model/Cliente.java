package br.com.testeestagioparadesenvolvedores.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * Descrição: Entidade cliente
 * Data: 14/08/2020  01:05
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	@Column(name = "cli_nome", length = 35, nullable = false)
	private String nome;
	
//======================================================================================================================	
	  //Construtor builder	
	public Cliente() {
		
	}

//======================================================================================================================	
	  //Construtor and fields	
	public Cliente(Integer idCliente, String nome) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		
	}

//======================================================================================================================	
	  //Getters and Setters	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//======================================================================================================================	
	 //ToString
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + "]";
	}

//======================================================================================================================
	//HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Cliente other = (Cliente) obj;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
