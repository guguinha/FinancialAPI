package br.com.guimaraes.augusto.financial.api.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidade representa a fonte da finança, se foi da carteira ou banco
 * 
 * @author Augusto
 *
 */

@Entity
public class Conta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double saldo;
	private String bancoCarteira; //contas ou carteira 
	
	public Conta() {
		
	}
	
	public Conta(Integer id, Double saldo, String banco_carteira) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.bancoCarteira = banco_carteira;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Column(name = "Banco_Carteira")
	public String getBancoCarteira() {
		return bancoCarteira;
	}

	public void setBancoCarteira(String bancoCarteira) {
		this.bancoCarteira = bancoCarteira;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Conta other = (Conta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else {
			if (!id.equals(other.id))
				return false;
		}
		return true;
	}
	
	
}
