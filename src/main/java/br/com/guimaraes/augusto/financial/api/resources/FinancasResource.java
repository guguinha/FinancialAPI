package br.com.guimaraes.augusto.financial.api.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.guimaraes.augusto.financial.api.domain.Financas;
import br.com.guimaraes.augusto.financial.api.services.FinancasService;

@RestController
@RequestMapping(value="/financas")
public class FinancasResource {
	
	@Autowired
	private FinancasService service;
	
	//busca finança por id
	@GetMapping(value="/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Financas obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Void> save(@Valid @RequestBody Financas obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	//cadastrar despesa
	//cadastrar receita
	
	//relatorio mes
	//relatorio ano
	//relatorio dia
	
	//transferencia entre contas própia
	
	//relatorio credito
}
