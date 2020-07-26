package com.algafood.controllers;

import com.algafood.entidades.estado.Estado;
import com.algafood.entidades.estado.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/estados", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
public class EstadoController {

    @Autowired
    EstadoRepository estadoRepository;

    @GetMapping
    public List<Estado> listar(){
        return estadoRepository.listar();
    }
}
