package com.algafood.entidades.restaurante;

import com.algafood.entidades.cozinha.Cozinha;

import java.util.List;

public interface RestauranteService {
    List<Restaurante> listar();
    Restaurante buscarPorId(Long id);
    Restaurante salvar(Restaurante restaurante);
    void remover(Long id);
}
