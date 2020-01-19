package br.com.guimaraes.augusto.financial.api.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Financas implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "financa")
	private TipoFinanca tipo;
	
	@OneToOne
	private Conta conta;
	
	private Date dataFinanca; // Data da finança
	private Date dataSave; 	// Data que os dados foram salvos/atualizados
	

	
	public Financas() {
		
	}
	
	public Financas(Integer id, String descricao, Conta conta, Date dataFinanca) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.conta = conta;
		this.dataFinanca = dataFinanca;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoFinanca getTipo() {
		return tipo;
	}

	public void setTipo(TipoFinanca tipo) {
		this.tipo = tipo;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Date getDataFinanca() {
		return dataFinanca;
	}

	public void setDataFinanca(Date dataFinanca) {
		this.dataFinanca = dataFinanca;
	}

	public Date getDataSave() {
		return dataSave;
	}

	public void setDataSave(Date dataSave) {
		this.dataSave = dataSave;
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
		Financas other = (Financas) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
