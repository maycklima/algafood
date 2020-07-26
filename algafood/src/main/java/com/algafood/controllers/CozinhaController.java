package com.algafood.controllers;

import com.algafood.entidades.cozinha.Cozinha;
import com.algafood.entidades.cozinha.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    CozinhaRepository cozinhaRepository;

    @GetMapping
    public List<Cozinha> listar(){
        return cozinhaRepository.listar();
    }

    @GetMapping("/{cozinhaId}")
    public Cozinha buscar(@PathVariable Long cozinhaId){
       return cozinhaRepository.buscarPorId(cozinhaId);
    }
}
