package br.com.guimaraes.augusto.financial.api.domain;

import javax.persistence.Entity;

@Entity
public class TipoReceita extends TipoFinanca{
	private static final long serialVersionUID = 1L;

	public TipoReceita() {
		
	}
	
	public TipoReceita(Integer id, Financas financa) {
		super(id, "Receita", financa);
		
	}
			
}
