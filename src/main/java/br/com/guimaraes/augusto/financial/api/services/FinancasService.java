package br.com.guimaraes.augusto.financial.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guimaraes.augusto.financial.api.domain.Financas;
import br.com.guimaraes.augusto.financial.api.repositories.ContaRepository;
import br.com.guimaraes.augusto.financial.api.repositories.FinancasRepository;
import br.com.guimaraes.augusto.financial.api.repositories.TipoFinancaRepository;
import br.com.guimaraes.augusto.financial.api.services.exceptions.ObjectNotFoundException;

@Service
public class FinancasService {

	@Autowired
	private FinancasRepository repository;
	@Autowired
	private TipoFinancaRepository tfRepo;
	@Autowired
	private ContaRepository cRepo;
	
	public Financas find(Integer id) {
		Optional<Financas> obj = repository.findById(id);
		// Criar msg de erro própia
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + 
		Financas.class.getName()));
	}
	
	public Financas insert(Financas obj) {
		obj.setId(null);
		obj = repository.save(obj);
		cRepo.save(obj.getConta());
		return obj;
	}
}
