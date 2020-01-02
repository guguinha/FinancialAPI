package br.com.guimaraes.augusto.financial.api.domain;

import javax.persistence.Entity;

import br.com.guimaraes.augusto.financial.api.domain.enums.TiposDespesa;

@Entity
public class TipoDespesa extends TipoFinanca{
	private static final long serialVersionUID = 1L;
	
	private Integer tipoDespesa;
	
	public TipoDespesa() {
		
	}
		
	public TipoDespesa(Integer id, TiposDespesa tipoDespesa,Financas financa) {
		super(id, "Despesa",financa);
		this.tipoDespesa = tipoDespesa.getCod();
	}

	public TiposDespesa getTipoDespesa() {
		return TiposDespesa.toEnum(tipoDespesa);
	}

	public void setTipoDespesa(TiposDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa.getCod();
	}
	
}
