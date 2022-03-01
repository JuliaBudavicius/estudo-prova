package sptech.com.br.estudocontinuada.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController é para marcar que o controlador
 está fornecendo serviços REST com o tipo de resposta JSON*/
@RestController
public class VitoriaEmpateDerrotaController {

    //Atributos
    private int contVitorias;
    private int contEmpates;
    private int contDerrotas;


    //GetMapping é para fazer as chamadas
    //Registrando Vitorias
    @GetMapping("/registrar-vitoria")
    public String registrarVitoria(){
        contVitorias++;
        return String.format("Registrada %d vitorias", contVitorias);
    }

    //Registrando Empates
    @GetMapping("/registrar-empate")
    public String registrarEmpate(){
        contEmpates++;
        return String.format("Registrada %d empates", contEmpates);
    }

    //Registrando Dertrotas
    @GetMapping("/registrar-derrota")
    public String registrarDerrota(){
        contDerrotas++;
        return String.format("Registrada %d derrotaa", contDerrotas);
    }

    @GetMapping("/pontuacao")
    public String pontuacaoTotal(){
        return String.format("Com %d Vitórias, " +
                "%d Empates, " +
                "%d Derrotas, " +
                "a pontuação total é de %d pontos."
                , contVitorias, contEmpates, contDerrotas, (contVitorias * 3) + (contEmpates));
    }

}
