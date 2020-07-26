package com.algafood.entidades.formaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {

    List<FormaPagamento> listar();
    FormaPagamento buscarPorId(Long id);
    FormaPagamento salvar(FormaPagamento formaPagamento);
    void remover (FormaPagamento formaPagamento);

}
