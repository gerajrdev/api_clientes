package br.com.cotiinformatica.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.application.dtos.LoginDTO;
import jakarta.validation.Valid;

@RestController
public class LoginController {
	
	@PostMapping("/api/clientes/login")
	public String post(@Valid @RequestBody LoginDTO dto) {
		return null;
	}

}
