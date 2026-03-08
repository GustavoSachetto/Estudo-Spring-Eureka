package com.sachetto.venda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachetto.sdk.client.ProdutoClient;
import com.sachetto.sdk.client.UsuarioClient;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/venda")
@RequiredArgsConstructor
public class VendaController {
	
	private final UsuarioClient usuarioClient;
	private final ProdutoClient produtoClient;
	
	@GetMapping
	public String getVenda() {
		return "Venda";
	}
	
	@GetMapping("/usuario") 
	public String getUsuario() {
		return "Venda + ".concat(usuarioClient.getUsuario());
	}
	
	@GetMapping("/produto") 
	public String getProduto() {
		return "Venda + ".concat(produtoClient.getProduto());
	}
}
