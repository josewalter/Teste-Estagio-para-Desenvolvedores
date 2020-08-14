package br.com.testeestagioparadesenvolvedores.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id_aluguel")
	private Integer idAluguel;
	
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	private LocalDate data_aluguel;
	
	@Column(name = "alu_valor", scale = 7, precision = 2, nullable = false)
	private double valor;

//======================================================================================================================	
	//Construtor builder
	public Aluguel() {
		super();
		
	}

//======================================================================================================================	
	//Construtor and fields
    public Aluguel(Integer idAluguel, Integer idCliente, LocalDate data_aluguel, double valor) {
		super();
		this.idAluguel = idAluguel;
		this.idCliente = idCliente;
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

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDate getData_aluguel() {
		return data_aluguel;
	}

	public void setData_aluguel(LocalDate data_aluguel) {
		this.data_aluguel = data_aluguel;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

//======================================================================================================================	
	//ToString
	@Override
	public String toString() {
		return "Aluguel [idAluguel=" + idAluguel + ", idCliente=" + idCliente + ", data_aluguel=" + data_aluguel
				+ ", valor=" + valor + "]";
	}

//======================================================================================================================
	//HashCode and Equals	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_aluguel == null) ? 0 : data_aluguel.hashCode());
		result = prime * result + ((idAluguel == null) ? 0 : idAluguel.hashCode());
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}
