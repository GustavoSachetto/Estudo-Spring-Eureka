package com.sachetto.produto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachetto.sdk.client.UsuarioClient;
import com.sachetto.sdk.client.VendaClient;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/produto")
@RequiredArgsConstructor
public class ProdutoController {
	
	private final UsuarioClient usuarioClient;
	private final VendaClient vendaClient;
	
	@GetMapping
	public String getProduto() {
		return "Produto";
	}
	
	@GetMapping("/usuario") 
	public String getUsuario() {
		return "Produto + ".concat(usuarioClient.getUsuario());
	}
	
	@GetMapping("/venda") 
	public String getVenda() {
		return "Produto + ".concat(vendaClient.getVenda());
	}
}
