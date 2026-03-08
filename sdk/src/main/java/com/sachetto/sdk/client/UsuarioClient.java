package com.sachetto.sdk.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "USUARIO")
public interface UsuarioClient {

	@GetMapping("/api/v1/usuario")
	String getUsuario();
}
