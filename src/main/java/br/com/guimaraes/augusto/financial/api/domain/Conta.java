package br.com.guimaraes.augusto.financial.api.domain;

import java.io.Serializable;

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
	private String banco_carteira; //contas ou carteira 
	
	public Conta() {
		
	}
	
	public Conta(Integer id, String banco_carteira) {
		super();
		this.id = id;
		this.banco_carteira = banco_carteira;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBanco_carteira() {
		return banco_carteira;
	}

	public void setBanco_carteira(String banco_carteira) {
		this.banco_carteira = banco_carteira;
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
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
