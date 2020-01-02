package br.com.guimaraes.augusto.financial.api.domain.enums;

public enum TiposDespesa {
	
	DINHEIRO(1, "Dinheiro"),
	DEBITO(2, "Débito"),
	CREDITO(3, "Crédito");
	//VOUCHER
	
	private int cod;
	private String descricao;
	
	private TiposDespesa(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TiposDespesa toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for (TiposDespesa x : TiposDespesa.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: "+ cod);
	}
	
}
