package br.com.guimaraes.augusto.financial.api.services;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guimaraes.augusto.financial.api.domain.Conta;
import br.com.guimaraes.augusto.financial.api.domain.Financas;
import br.com.guimaraes.augusto.financial.api.domain.TipoDespesa;
import br.com.guimaraes.augusto.financial.api.domain.TipoFinanca;
import br.com.guimaraes.augusto.financial.api.domain.TipoReceita;
import br.com.guimaraes.augusto.financial.api.domain.enums.TiposDespesa;
import br.com.guimaraes.augusto.financial.api.repositories.ContaRepository;
import br.com.guimaraes.augusto.financial.api.repositories.FinancasRepository;
import br.com.guimaraes.augusto.financial.api.repositories.TipoFinancaRepository;

@Service
public class DBService {
	
	@Autowired 
	private FinancasRepository financaRepository;
	@Autowired 
	private ContaRepository contaRepository;
	@Autowired
	private TipoFinancaRepository tipoFinancaRepository;
	private final Double ZERO = 0.0;
	
	public void instantiateTestDatabase() throws ParseException{
		
		Conta c1 = new Conta(null, ZERO, "BB");
		Conta c2 = new Conta(null, 2000.00, "NuBank");
		Conta c3 = new Conta(null, ZERO, "Carteira");
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Financas f1 = new Financas(null, "lanche", c1, sdf.parse("29/12/2019 21:39"), sdf.parse("29/12/2019 21:39"));
		Financas f2 = new Financas(null, "Venda",  c2, sdf.parse("29/12/2019 21:39"), sdf.parse("29/12/2019 21:39"));
		
		TipoFinanca despesa = new TipoDespesa(null, TiposDespesa.DEBITO ,f1);
		f1.setTipo(despesa);
		
		TipoFinanca receita = new TipoReceita(null,f2);
		f2.setTipo(receita);
		
		contaRepository.saveAll(Arrays.asList(c1,c2,c3));
		financaRepository.saveAll(Arrays.asList(f1,f2));
		tipoFinancaRepository.saveAll(Arrays.asList(despesa,receita));
		
	}
	
}
