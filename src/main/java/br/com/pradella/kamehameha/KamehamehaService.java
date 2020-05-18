package br.com.pradella.kamehameha;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface KamehamehaService {
    public String hittingAnUrl();
}
