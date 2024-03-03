package com.fatec.prodback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * trata as requisicoes http
 */
@RestController
public class ApiControle {
	
	@GetMapping("/api/clientes")
	public String getCliente() {
		return "Cliente 1";
	}

}
