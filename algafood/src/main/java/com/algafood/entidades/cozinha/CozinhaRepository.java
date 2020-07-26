package com.algafood.entidades.cozinha;

import java.util.List;

public interface CozinhaRepository {
    List<Cozinha> buscarTodas();
    Cozinha buscarPorId(Long id);
    Cozinha salvar(Cozinha cozinha);
    void remover(Cozinha cozinha);
}
