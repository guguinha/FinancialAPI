package br.com.guimaraes.augusto.financial.api.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Financa")
public class FinancaResource {
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Void> find(@PathVariable Integer id){
		return ResponseEntity.noContent().build();
	}
}
