package com.algafood.entidades.cozinha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class CozinhaServiceImpl implements CozinhaService {

    @Autowired CozinhaRepository cozinhaRepository;


    @Override
    public List<Cozinha> listar() {
        return cozinhaRepository.listar();
    }

    @Override
    public Cozinha buscarPorId(Long id) {
        return cozinhaRepository.buscarPorId(id);
    }

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    public Cozinha salvar(Cozinha cozinha) {
        return cozinhaRepository.salvar(cozinha);
    }

    @Override
    public void remover(Long cozinhaId) {
        Cozinha cozinha = cozinhaRepository.buscarPorId(cozinhaId);
         cozinhaRepository.remover(cozinha);
    }
}
