import com.algafood.AlgafoodApplication;
import com.algafood.entidades.cidade.Cidade;
import com.algafood.entidades.cidade.CidadeRepository;
import com.algafood.entidades.cidade.CidadeRepositoryImpl;
import com.algafood.entidades.cozinha.Cozinha;
import com.algafood.entidades.cozinha.CozinhaRepository;
import com.algafood.entidades.estado.Estado;
import com.algafood.entidades.estado.EstadoRepository;
import com.algafood.entidades.estado.EstadoRepositoryImpl;
import com.algafood.entidades.formaPagamento.FormaPagamento;
import com.algafood.entidades.formaPagamento.FormaPagamentoRepository;
import com.algafood.entidades.permissao.Permissao;
import com.algafood.entidades.permissao.PermissaoRepository;
import com.algafood.entidades.restaurante.Restaurante;
import com.algafood.entidades.restaurante.RestauranteRepository;
import com.algafood.entidades.restaurante.RestauranteRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

//        EstadoRepository estadoRepository = applicationContext.getBean(EstadoRepository.class);
//        Estado estado = new Estado();
//        estado.setId(2L);
//        estado.setNome("Tocantins");
//
//        Estado estado2 = new Estado();
//        estado2.setId(3L);
//        estado2.setNome("Minas Gerais");
//
//        estadoRepository.salvar(estado);
//        estadoRepository.salvar(estado2);
//
//        CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
//        Cidade cidade = new Cidade();
//
//        cidade.setId(2L);
//        cidade.setNome("Arraias");
//        cidade.setEstado(estado);
//
//        cidadeRepository.salvar(cidade);
//
//        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
//        Cozinha cozinha = new Cozinha();
//        cozinha.setId(2L);
//        cozinha.setNome("Brasieira");
//
//        cozinhaRepository.salvar(cozinha);
//
//        FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
//        FormaPagamento formaPagamento = new FormaPagamento();
//        formaPagamento.setId(2L);
//        formaPagamento.setDescricao("Débito");
//
//        formaPagamentoRepository.salvar(formaPagamento);
//
//        PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);
//        Permissao permissao = new Permissao();
//        permissao.setId(2L);
//        permissao.setNome("Cadastrar usuarios");
//        permissao.setDescricao("Usuario é permitido a cadastrar outros usuários");
//
//        permissaoRepository.salvar(permissao);
//
       RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
//        Restaurante restaurante = new Restaurante();
//        restaurante.setId(2L);
//        restaurante.setNome("Restaurante do Brasil");
//        restaurante.setTaxaFrete(BigDecimal.valueOf(20));
//        restaurante.setCozinha(cozinha);
//
//        restauranteRepository.salvar(restaurante);

        List<Restaurante> restauranteList = restauranteRepository.listar();

        List<Restaurante> restaurantesEmOrdem = restauranteList.stream()
                .filter(restaurante -> Double.parseDouble(String.valueOf(restaurante.getTaxaFrete())) > 70)
                .sorted(Comparator.comparing(Restaurante::getNome))
                .limit(2)
                .collect(Collectors.toList());

        List<String> stringNomes = restauranteList.stream()
                .filter(restaurante -> Double.parseDouble(String.valueOf(restaurante.getTaxaFrete())) > 70)
                .sorted(Comparator.comparing(Restaurante::getNome))
                .limit(2)
                .map(Restaurante::getNome)
                .collect(Collectors.toList());

        restaurantesEmOrdem.forEach(c -> System.out.println("Nome: " + c.getNome()  + " Taxa: " +c.getTaxaFrete()  + " CozinhaId: " + c.getCozinha().getNome()));
        stringNomes.forEach(c -> System.out.println(c));















    }
}
