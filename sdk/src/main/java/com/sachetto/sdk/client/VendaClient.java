package com.sachetto.sdk.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "VENDA")
public interface VendaClient {

	@GetMapping("/api/v1/venda")
	String getVenda();
}
