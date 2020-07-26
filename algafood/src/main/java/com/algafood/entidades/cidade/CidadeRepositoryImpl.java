package com.algafood.entidades.cidade;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Cidade> listarTodas() {
        return entityManager.createNativeQuery("from Cidade", Cidade.class).getResultList();
    }

    @Override
    public Cidade buscarPorId(Long id) {
        return entityManager.find(Cidade.class, id);
    }

    @Transactional
    @Override
    public Cidade salvar(Cidade cidade) {
        return entityManager.merge(cidade);
    }

    @Transactional
    @Override
    public void remover(Cidade cidade) {
       entityManager.remove(buscarPorId(cidade.getId()));
    }
}
