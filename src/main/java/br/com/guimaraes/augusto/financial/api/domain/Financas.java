package br.com.guimaraes.augusto.financial.api.domain;

import java.io.Serializable;
import java.sql.Date;

public class Financas implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String descricao;
	private TipoFinanca tipo;
	private String fonte; //saiu da carteira ou de algum banco
	private Date data;
	
	public Financas() {
		
	}

	public Financas(Integer id, String descricao, TipoFinanca tipo, String fonte, Date data) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
		this.fonte = fonte;
		this.data = data;
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

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
