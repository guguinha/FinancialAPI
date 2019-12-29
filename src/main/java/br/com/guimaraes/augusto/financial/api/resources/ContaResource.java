package br.com.guimaraes.augusto.financial.api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guimaraes.augusto.financial.api.domain.Conta;
import br.com.guimaraes.augusto.financial.api.services.ContaService;

@RestController
@RequestMapping(value="/contas")
public class ContaResource {
	
	@Autowired
	private ContaService service;
	
	//busca conta por id
	@GetMapping(value="/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Conta obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	//cadastrar conta
	//deletar conta
	
   //listar contas
}
