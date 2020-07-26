package com.algafood.entidades.estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> listarTodos();
    Estado buscarPorId(Long id);
    Estado salvar(Estado estado);
    void remover(Estado estado);

}
