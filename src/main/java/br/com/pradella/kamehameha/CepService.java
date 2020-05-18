package br.com.pradella.kamehameha;

import br.com.pradella.kamehameha.fallback.CepServiceFallback;
import br.com.pradella.kamehameha.response.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(url="https://viacep.com.br/ws/", name = "viacep", fallback = CepServiceFallback.class)
public interface CepService {

    @GetMapping("{cep}/json")
    Endereco buscaEnderecoPor(@PathVariable("cep") String cep);
}