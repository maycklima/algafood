package com.algafood.entidades.restaurante;

import java.util.List;

public interface RestauranteRepository {
    List<Restaurante> listarTodos();
    Restaurante buscarPorId(Long id);
    Restaurante salvar(Restaurante restaurante);
    void remover(Restaurante restaurante);
}
