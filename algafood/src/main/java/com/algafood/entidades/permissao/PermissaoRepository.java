package com.algafood.entidades.permissao;

import java.util.List;

public interface PermissaoRepository {
    List<Permissao> listaTodas();
    Permissao buscarPorId(Long id);
    Permissao salvar(Permissao permissao);
    void remover(Permissao permissao);
}
