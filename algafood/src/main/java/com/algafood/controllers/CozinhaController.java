package com.algafood.controllers;

import com.algafood.entidades.cozinha.Cozinha;
import com.algafood.entidades.cozinha.CozinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    CozinhaService cozinhaService;

    @GetMapping
    public List<Cozinha> listar(){
        return cozinhaService.listar();
    }
    
    @GetMapping("/{cozinhaId}")
    public Cozinha buscar(@PathVariable Long cozinhaId){
       return cozinhaService.buscarPorId(cozinhaId);
    }

    @PostMapping
    public Cozinha salvar(@RequestBody Cozinha cozinha){
        return cozinhaService.salvar(cozinha);
    }

    @DeleteMapping("/{cozinhaId}")
    public void delete(@PathVariable Long cozinhaId){
        cozinhaService.remover(cozinhaId);
    }
}
