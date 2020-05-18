package br.com.pradella.kamehameha.impl;

import br.com.pradella.kamehameha.KamehamehaService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class KamehamehaServiceImpl implements KamehamehaService {

    @Override
    public String hittingAnUrl() {
        return null;
    }
}
