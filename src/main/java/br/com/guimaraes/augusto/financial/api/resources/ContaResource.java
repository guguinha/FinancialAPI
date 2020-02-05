package br.com.guimaraes.augusto.financial.api.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.guimaraes.augusto.financial.api.domain.Conta;
import br.com.guimaraes.augusto.financial.api.services.ContaService;

@RestController
@RequestMapping(value="/contas")
public class ContaResource {
	
	@Autowired
	private ContaService service;
	
	//busca conta por id
	@GetMapping(value="/{id}")
	public ResponseEntity<Conta> find(@PathVariable Integer id){
		
		Conta obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Void> inserir(@Valid @RequestBody Conta obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/id").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
	@DeleteMapping
	public ResponseEntity<Void> remove(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
			
	}
		
	//findAll
	@GetMapping
	public ResponseEntity<List<Conta>> findAll() {
		List<Conta> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	//update
	/*
	 * @RequestMapping(value="/{id}",method=RequestMethod.PUT) public
	 * ResponseEntity<Void> update(@Valid @RequestBody Conta obj, @PathVariable
	 * Integer id){ Conta obj = service.fromDTO(obj); obj.setId(id); obj =
	 * service.update(obj); return ResponseEntity.noContent().build(); }
	 */
}
