package com.algafood.controllers;

import com.algafood.entidades.cozinha.Cozinha;
import com.algafood.entidades.cozinha.CozinhaService;
import com.algafood.entidades.restaurante.Restaurante;
import com.algafood.entidades.restaurante.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    RestauranteService restauranteService;

    @GetMapping
    public List<Restaurante> listar(){
        return restauranteService.listar();
    }

    @GetMapping("/{restauranteId}")
    public Restaurante buscar(@PathVariable Long restauranteId){
        return restauranteService.buscarPorId(restauranteId);
    }

    @PostMapping
    public Restaurante salvar(@RequestBody Restaurante restaurante){
        return restauranteService.salvar(restaurante);
    }

    @DeleteMapping("/{restauranteId}")
    public void delete(@PathVariable Long restauranteId){
        restauranteService.remover(restauranteId);
    }
}
