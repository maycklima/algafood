package com.algafood.entidades.restaurante;

import com.algafood.entidades.cozinha.Cozinha;
import com.algafood.entidades.cozinha.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class RestauranteServiceImpl implements RestauranteService {

    @Autowired
    RestauranteRepository restauranteRepository;


    @Override
    public List<Restaurante> listar() {
        return restauranteRepository.listar();
    }

    @Override
    public Restaurante buscarPorId(Long id) {
        return restauranteRepository.buscarPorId(id);
    }

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    public Restaurante salvar(Restaurante restaurante) {
        return restauranteRepository.salvar(restaurante);
    }

    @Override
    public void remover(Long restauranteId) {
        Restaurante restaurante = restauranteRepository.buscarPorId(restauranteId);
        restauranteRepository.remover(restaurante);
    }
}
