import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class GameAPI {

    // Exemplo de dados (pode ser substituído por seus próprios dados)
    private List<Jogo> jogos = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(GameAPI.class, args);
    }

    // Endpoint para obter todos os jogos
    @GetMapping("/jogos")
    public List<Jogo> obterJogos() {
        return jogos;
    }

    // Endpoint para obter detalhes de um jogo por ID
    @GetMapping("/jogos/{jogoId}")
    public Jogo obterJogo(@PathVariable int jogoId) {
        for (Jogo jogo : jogos) {
            if (jogo.getId() == jogoId) {
                return jogo;
            }
        }
        throw new JogoNaoEncontradoException("Jogo não encontrado");
    }

    // Endpoint para adicionar um novo jogo
    @PostMapping("/jogos")
    public Jogo adicionarJogo(@RequestBody Jogo novoJogo) {
        novoJogo.setId(jogos.size() + 1);
        jogos.add(novoJogo);
        return novoJogo;
    }
}

class Jogo {
    private int id;
    private String titulo;
    private String desenvolvedora;
    private int anoLancamento;

    // getters e setters
}

@ResponseStatus(HttpStatus.NOT_FOUND)
class JogoNaoEncontradoException extends RuntimeException {
    public JogoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
