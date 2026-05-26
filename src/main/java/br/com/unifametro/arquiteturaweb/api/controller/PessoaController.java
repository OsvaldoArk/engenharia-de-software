package br.com.unifametro.arquiteturaweb.api.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifametro.arquiteturaweb.application.service.PessoaService;
import br.com.unifametro.arquiteturaweb.domain.entity.Pessoa;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/pessoas")
@AllArgsConstructor
public class PessoaController {
    
    private final PessoaService pessoaService;
    
    @GetMapping
    public Page<Pessoa> findAll(@RequestParam("page") int page, @RequestParam("size") int size) {
        
        Pageable pageable = PageRequest.of(page, size);
        
        return pessoaService.findAll(pageable);
    }
}
