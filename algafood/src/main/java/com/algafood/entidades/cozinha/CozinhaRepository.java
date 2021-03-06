package com.algafood.entidades.cozinha;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CozinhaRepository {
    List<Cozinha> listar();
    Cozinha buscarPorId(Long id);
    Cozinha salvar(Cozinha cozinha);
    Cozinha remover(Cozinha cozinha);
}
