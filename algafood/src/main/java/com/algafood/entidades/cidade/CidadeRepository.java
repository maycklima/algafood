package com.algafood.entidades.cidade;

import java.util.List;

public interface CidadeRepository
{
    List<Cidade> listarTodas();
    Cidade buscarPorId(Long id);
    Cidade salvar(Cidade cidade);
    void remover(Cidade cidade);
}
