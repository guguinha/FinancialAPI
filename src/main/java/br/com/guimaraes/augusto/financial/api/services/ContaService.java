package br.com.guimaraes.augusto.financial.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guimaraes.augusto.financial.api.domain.Conta;
import br.com.guimaraes.augusto.financial.api.domain.Financas;
import br.com.guimaraes.augusto.financial.api.repositories.ContaRepository;
import br.com.guimaraes.augusto.financial.api.services.exceptions.ObjectNotFoundException;

@Service
public class ContaService {

	@Autowired
	private ContaRepository repository;
	
	public Conta find(Integer id) {
		Optional<Conta> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + 
		Financas.class.getName()));
	}
}
