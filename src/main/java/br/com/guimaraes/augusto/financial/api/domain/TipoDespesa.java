package br.com.guimaraes.augusto.financial.api.domain;

public class TipoDespesa extends TipoFinanca{
	
	private String tipoDespesa;
	
	public TipoDespesa() {
		super("Despesa");
	}
	
	public TipoDespesa(String tipoDespesa) {
		super("Despesa");
		this.tipoDespesa = tipoDespesa;
	}

	public TipoDespesa(String tipo, String tipoDespesa) {
		super(tipo);
		this.tipoDespesa = tipoDespesa;
	}

	public String getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}
	
	
}
