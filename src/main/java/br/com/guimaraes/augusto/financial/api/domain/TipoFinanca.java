package br.com.guimaraes.augusto.financial.api.domain;

/**
 * Define o tipo da finança, entre Receitas e Despesas
 * @author Augusto.
 * 
 */
public abstract class TipoFinanca {
	private String tipo; //Receita ou Despesa
	
	public TipoFinanca() {
		
	}

	public TipoFinanca(String tipo) {
		this.tipo = tipo;
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
