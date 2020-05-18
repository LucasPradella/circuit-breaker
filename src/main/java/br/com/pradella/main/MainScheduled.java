package br.com.pradella.main;

import br.com.pradella.kamehameha.CepService;
import br.com.pradella.kamehameha.KamehamehaService;
import br.com.pradella.kamehameha.response.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MainScheduled {

    @Autowired
    private KamehamehaService kamehamehaService;

    @Autowired
    private CepService cepService;


    @Scheduled(fixedDelay = 2000, initialDelay = 1000)
    public void start() {
        System.out.println("Oi meu nome é Goku e agora são => " + new Date().toString());

        String response = kamehamehaService.hittingAnUrl();

        System.out.println("O que esta acontencendo aqui => " + response);

        Endereco response2 = cepService.buscaEnderecoPor("04140000");

        System.out.println("O que esta acontencendo aqui => " + response2);

        Endereco response3 = cepService.buscaEnderecoPor("041400s00");

        System.out.println("O que esta acontencendo aqui => " + response3);

    }
}
