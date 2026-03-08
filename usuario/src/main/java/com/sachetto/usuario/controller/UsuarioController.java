package com.sachetto.usuario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachetto.sdk.client.ProdutoClient;
import com.sachetto.sdk.client.VendaClient;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/usuario")
@RequiredArgsConstructor
public class UsuarioController {
	
	private final VendaClient vendaClient;
	private final ProdutoClient produtoClient;
	
	@GetMapping
	public String getUsuario() {
		return "Usuario";
	}
	
	@GetMapping("/venda") 
	public String getVenda() {
		return "Usuario + ".concat(vendaClient.getVenda());
	}
	
	@GetMapping("/produto") 
	public String getProduto() {
		return "Usuario + ".concat(produtoClient.getProduto());
	}
}
