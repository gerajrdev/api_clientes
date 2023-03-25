package br.com.cotiinformatica.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.application.dtos.CadastroDTO;
import jakarta.validation.Valid;

@RestController
public class CadastroController {
	
	@PostMapping("/api/clientes/cadastro")
	public String post(@Valid @RequestBody CadastroDTO dto) {
		return null;
	}

}
