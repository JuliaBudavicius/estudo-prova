package sptech.com.br.estudocontinuada.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContadorControlller {

    private int contador;

    //A chamada /contar, mostra quantas vezes você acessou ela.
    @GetMapping("/contar")
    public String contar() {
        contador++;
        return String.format("Você já fez %d acessos", contador);
    }


    // Fazendo a chamada somar
    @GetMapping("/somar/{n1}/{n2}")
    public String somar(@PathVariable double n1,
                        @PathVariable double n2){
        return
                String.format("A soma entre %.2f e %.2f é igual á %.2f", n1, n2, (n1+n2));
    }


    //Chamada d calcular VR pelo salário
    @GetMapping("/calcular-vr/{nome}/{salario}")
    public String calcular(@PathVariable String nome,
                           @PathVariable double salario){
        double vr = 8 * 100 / salario;
        return
                String.format("Olá %s, seu VR é de R$ %.2f.", nome, vr);

    }
}
