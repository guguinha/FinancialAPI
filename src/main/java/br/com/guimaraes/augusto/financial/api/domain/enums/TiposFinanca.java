package br.com.guimaraes.augusto.financial.api.domain.enums;

public enum TiposFinanca {
	
	RECEITA(1, "Receita"),
	DESPESA(2, "Despesa");
	
	private int cod;
	private String descricao;
	
	private TiposFinanca(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TiposFinanca toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for (TiposFinanca x : TiposFinanca.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: "+ cod);
	}
	
}
