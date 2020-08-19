package br.com.testeestagioparadesenvolvedores.model;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

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
 * Descrição: Entidade Aluguel
 * Data: 14/08/2020  02:13
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_aluguel")
public class Aluguel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name = "id_aluguel")
	private Integer idAluguel;
	
	//@Temporal(value = TemporalType.DATE)
	//@JsonFormat(pattern = "yyyy-MM-dd")
	@Column
	private LocalDate data_aluguel;  //= new Date(System.currentTimeMillis());
	
	@Column(name = "alu_valor", precision = 7, scale = 2, nullable = false)
	private BigDecimal valor;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_cliente_id_cliente", referencedColumnName = "id_cliente", nullable = false)
	private Cliente cliente;
	
	
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	private List<Cliente> clientes;
*/
//======================================================================================================================	
	//Construtor builder
	public Aluguel() {
		super();
		
	}

//======================================================================================================================	
	//Construtor and fields
	public Aluguel(Integer idAluguel, Cliente cliente, LocalDate data_aluguel, BigDecimal valor) {
		super();
		this.idAluguel = idAluguel;
		this.cliente = cliente;
		this.data_aluguel = data_aluguel;
		this.valor = valor;
	}

//======================================================================================================================	
  	//Getters and Setters
	public Integer getIdAluguel() {
		return idAluguel;
	}

	public void setIdAluguel(Integer idAluguel) {
		this.idAluguel = idAluguel;
	}

	public String getCliente() {
		return cliente.getNome();
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getData_aluguel() {
		return data_aluguel;
	}

	public void setData_aluguel(LocalDate data_aluguel) {
		this.data_aluguel = data_aluguel;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

//======================================================================================================================	
	//ToString
	@Override
	public String toString() {
		return "Aluguel [idAluguel=" + idAluguel + ", data_aluguel=" + data_aluguel + ", valor=" + valor + ", cliente="
				+ cliente + "]";
	}

//======================================================================================================================
	//HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((data_aluguel == null) ? 0 : data_aluguel.hashCode());
		result = prime * result + ((idAluguel == null) ? 0 : idAluguel.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		Aluguel other = (Aluguel) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (data_aluguel == null) {
			if (other.data_aluguel != null)
				return false;
		} else if (!data_aluguel.equals(other.data_aluguel))
			return false;
		if (idAluguel == null) {
			if (other.idAluguel != null)
				return false;
		} else if (!idAluguel.equals(other.idAluguel))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
}
