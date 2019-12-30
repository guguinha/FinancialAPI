package br.com.guimaraes.augusto.financial.api.services;

import java.sql.Date;
import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guimaraes.augusto.financial.api.domain.Conta;
import br.com.guimaraes.augusto.financial.api.domain.Financas;
import br.com.guimaraes.augusto.financial.api.repositories.ContaRepository;
import br.com.guimaraes.augusto.financial.api.repositories.FinancasRepository;

@Service
public class DBService {
	
	@Autowired 
	private FinancasRepository financaRepository;
	@Autowired 
	private ContaRepository contaRepository;
	
	public void instantiateTestDatabase() throws ParseException{
		
		//Date date = new Date(System.currentTimeMillis());
		//System.out.println(formatter.format(date));
		
		Conta c1 = new Conta(null, "BB");
		Conta c2 = new Conta(null, "NuBank");
		Conta c3 = new Conta(null, "Carteira");
		
		@SuppressWarnings("deprecation")
		Financas f1 = new Financas(null, "lanche", "Debito", c1, new Date(2019,12,29));
		@SuppressWarnings("deprecation")
		Financas f2 = new Financas(null, "Venda", "Credito", c2, new Date(2019,12,29));
		
		contaRepository.saveAll(Arrays.asList(c1,c2,c3));
		financaRepository.saveAll(Arrays.asList(f1,f2));
		
	}
	
}
