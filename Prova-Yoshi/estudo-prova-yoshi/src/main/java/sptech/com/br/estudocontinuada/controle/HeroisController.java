package sptech.com.br.estudocontinuada.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.com.br.estudocontinuada.entidade.Herois;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroisController {

    //Atributo lista
    List<Herois> herois = new ArrayList<>();

    //Cadastrar Heroi
    @GetMapping("/cadastrar/{nome}/{forca}/{papularidade}/{aposentado}")
    public String cadastrarHeroi(
            @PathVariable String nome,
            @PathVariable int forca,
            @PathVariable double papularidade,
            @PathVariable boolean aposentado){

        //Dando os valores
        String classe;

        if (forca <= 100 ){
            classe = "C";
        }else if (forca > 100 && forca <= 500){
            classe = "B";
        }else if ( forca > 500 && papularidade > 70){
            classe = "S";
        }else{
            classe = "A";
        }

        //Passando pela lista de Herois para ver se já existe o que vai ser cadastrado
        for(Herois heroi : herois){
            if (heroi.getNome().equalsIgnoreCase(nome)){
                return "Esse heroi já existe!!!";
            }
        }
        //Cadastrando
        herois.add(new Herois(nome,forca,papularidade,classe,aposentado));
        return "Heroi cadastrada com sucesso!!!";
    }

    //Mostrar todos os herois
    @GetMapping("/descrever")
    public List<Herois> descreverHeroi(){
        return herois;
    }


    //Cadastro poderia ser feito desse geito tambem
    /*
        @GetMapping("/cadastrar/{nome}/{forca}/{popularidade}/{aposentado}")
    public String cadastrarHeroi(@PathVariable String nome,
                                 @PathVariable int forca,
                                 @PathVariable double popularidade,
                                 @PathVariable boolean aposentado){
        String classe;

        if (forca < 100) {
            classe = "C";
        } else if (forca <= 500){
            classe = "B";
        } else if (forca > 500 && popularidade > 70){
            classe = "S";
        } else {
            classe = "A";
        }

        herois.add(new Herois(nome, forca, popularidade, classe, aposentado));
        return "Heroi cadastrado com sucesso.";
    }
     */

}
