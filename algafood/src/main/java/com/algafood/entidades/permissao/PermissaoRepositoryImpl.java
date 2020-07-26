package com.algafood.entidades.permissao;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Permissao> listaTodas() {
        return entityManager.createNativeQuery("from Permissao", Permissao.class).getResultList();
    }

    @Override
    public Permissao buscarPorId(Long id) {
        return entityManager.find(Permissao.class, id);
    }

    @Transactional
    @Override
    public Permissao salvar(Permissao permissao) {
        return entityManager.merge(permissao);
    }

    @Transactional
    @Override
    public void remover(Permissao permissao) {
        entityManager.remove(permissao.getId());
    }
}
