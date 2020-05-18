package br.com.pradella.kamehameha.fallback;

import br.com.pradella.kamehameha.CepService;
import br.com.pradella.kamehameha.response.Endereco;
import org.springframework.stereotype.Component;

@Component
public class CepServiceFallback implements CepService {

    @Override
    public Endereco buscaEnderecoPor(String cep) {
        return Endereco.builder().bairro("Deu ruim na chamada").build() ;
    }
}
