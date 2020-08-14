package br.com.testeestagioparadesenvolvedores.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Descrição: Entidade Filme
 * Data: 14/08/2020  01:56
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_filme")
public class Filme {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id_filme")
	private Integer idFilme;
	
	private LocalDate data_lancamento;
	
	@Column(name = "fil_nome", length = 35, nullable = false)
	private String nome;
	
	@Column(name = "fil_descricao", length = 50, nullable = false)
	private String descricao;
	
//======================================================================================================================	
	  //Construtor builder
	public Filme() {
		super();
		
	}

//======================================================================================================================	
	 //Construtor and fields
	public Filme(Integer idFilme, LocalDate data_lancamento, String nome, String descricao) {
		super();
		this.idFilme = idFilme;
		this.data_lancamento = data_lancamento;
		this.nome = nome;
		this.descricao = descricao;
	}

//======================================================================================================================	
	//Getters and Setters	
	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}

	public LocalDate getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(LocalDate data_lancamento) {
		this.data_lancamento = data_lancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
//======================================================================================================================	
    //ToString
	@Override
	public String toString() {
		return "Filme [idFilme=" + idFilme + ", data_lancamento=" + data_lancamento + ", nome=" + nome + ", descricao="
				+ descricao + "]";
	}

//======================================================================================================================
	//HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_lancamento == null) ? 0 : data_lancamento.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((idFilme == null) ? 0 : idFilme.hashCode());
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
		Filme other = (Filme) obj;
		if (data_lancamento == null) {
			if (other.data_lancamento != null)
				return false;
		} else if (!data_lancamento.equals(other.data_lancamento))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idFilme == null) {
			if (other.idFilme != null)
				return false;
		} else if (!idFilme.equals(other.idFilme))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
