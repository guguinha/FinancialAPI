package br.com.guimaraes.augusto.financial.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.guimaraes.augusto.financial.api.domain.Conta;
import br.com.guimaraes.augusto.financial.api.domain.Financas;
import br.com.guimaraes.augusto.financial.api.repositories.ContaRepository;
import br.com.guimaraes.augusto.financial.api.services.exceptions.DataIntegrityException;
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
	
	// TODO futura feature - verificar label impedir duplicação
	public Conta insert(Conta obj) {
		obj.setId(null);
		obj.setSaldo(0.0);
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repository.deleteById(id);
		}catch (DataIntegrityViolationException e){
			throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos");
		}
	}

	public List<Conta> findAll() {
		return repository.findAll();
	}
}
