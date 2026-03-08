# Estudo-Spring-Eureka

Repositório de estudo do Spring Eureka, produto desenvolvido pelo netflix para gerenciamento de microsserviços com comunicação sincrona. 

**Switch de teste com 3 Microsserviços:**
1. Usuário (Server + Client)
2. Venda (Client)
3. Produto (Client)

**Microserviços possuem endpoints de comunição entre si:**
<img width="770" height="525" alt="image" src="https://github.com/user-attachments/assets/90e6b61a-5846-4455-8667-f53860f01843" />

**Lib para reduzir custo de manutenção:**

SDK:
```
@FeignClient(name = "PRODUTO")
public interface ProdutoClient {

	@GetMapping("/api/v1/produto")
	String getProduto();
}
```

Microsserviço Usuário:
```
import com.sachetto.sdk.client.ProdutoClient;
import com.sachetto.sdk.client.VendaClient;

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
```
