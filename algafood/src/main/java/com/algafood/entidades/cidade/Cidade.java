package com.algafood.entidades.cidade;

import com.algafood.entidades.estado.Estado;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    private Estado estado;

}
