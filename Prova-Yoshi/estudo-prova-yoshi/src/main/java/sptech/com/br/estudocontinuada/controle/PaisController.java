package sptech.com.br.estudocontinuada.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.com.br.estudocontinuada.entidade.Pais;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {

    //Atributo lista
    List<Pais> paises = new ArrayList<>();

    //Cadastrando um pais na lista
    @GetMapping("/cadastrar/{nome}/{ouro}/{prata}/{bronze}")
    public String cadastrarPais(
            @PathVariable String nome,
            @PathVariable int ouro,
            @PathVariable int prata,
            @PathVariable int bronze

    ){
        //Passando pela lista de paises e ver se o pais já foi cadastrado
        for (Pais pais : paises){
            if (pais.getNome().equalsIgnoreCase(nome)){
                return "Este Pais já foi cadastrado, tente outro!!!";
            }
        }
        //Cadastrando pais
        paises.add(new
                Pais(nome, ouro, prata, bronze));
        return "Pais cadastrado com sucesso";

    }

    //Mostrando a lista de Paises
    @GetMapping("/listar")
    public List<Pais> listar(){return paises;}

    //Buscando pais pelo indice
    @GetMapping("/buscar/{indice}")
    public Pais buscarIndice(@PathVariable Integer indice){
        if(isIndiceValido(indice)){
            return paises.get(indice);
        }
        return null;
    }

    //Atualizando pais
    @GetMapping("/atualizar/{indice}/{nome}/{ouro}/{prata}/{bronze}")
    public String atualizarPais(
            @PathVariable Integer indice,
            @PathVariable String nome,
            @PathVariable Integer ouro,
            @PathVariable Integer prata,
            @PathVariable Integer bronze
    ){
        if(isIndiceValido(indice)){
            paises.set(indice, new Pais(nome,ouro,prata,bronze));
            return "Pais atualizado com sucesso.";
    }
        return "Pais  não encontrado";

    }

    //Remover um Pais
    @GetMapping("/remover/{indice}")
    public String removerPais(@PathVariable int indice){

        if (isIndiceValido(indice)){
            paises.remove(indice);
            return "Pais removida com sucesso!!!";
        }
        return "Pais não encontrado";
    }

    //Método do isIndiceValido
    private boolean isIndiceValido(int indice) {
        return indice >= 0 && indice < paises.size();
    }
}
