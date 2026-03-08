package com.sachetto.sdk.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PRODUTO")
public interface ProdutoClient {

	@GetMapping("/api/v1/produto")
	String getProduto();
}
