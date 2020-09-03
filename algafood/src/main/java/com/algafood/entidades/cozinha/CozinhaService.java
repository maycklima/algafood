package com.algafood.entidades.cozinha;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CozinhaService {
    List<Cozinha> listar();
    Cozinha buscarPorId(Long id);
    Cozinha salvar(Cozinha cozinha);
    void remover(Long id);
}
