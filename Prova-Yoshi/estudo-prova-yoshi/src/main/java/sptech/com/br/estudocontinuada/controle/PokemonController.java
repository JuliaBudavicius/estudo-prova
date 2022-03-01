package sptech.com.br.estudocontinuada.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.com.br.estudocontinuada.entidade.Pokemon;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    List <Pokemon> pokemons = new ArrayList<>();

    //Informações inseridas
    //private List<Pokemon> pokemons = new ArrayList<>(List.of(
    //            new Pokemon("Pikachu", "elétrico", 90_000.0, false),
    //            new Pokemon("Bubasaur", "aquático", 22_000.0, true),
    //            new Pokemon("ReisFish", "aquático", 1_000.0, true)
    //    ));

    //Cadastrando Pokemon
    @GetMapping("/cadastrar/{nome}/{tipo}/{forca}/{capturado}")
    public String cadastrarPokemon(
            @PathVariable String nome,
            @PathVariable String tipo,
            @PathVariable double forca,
            @PathVariable boolean capturado
    ){
        for(Pokemon pokemon : pokemons){
            if(pokemon.getNome().equalsIgnoreCase(nome)){
                return "Esse pokemon já foi cadastrado";
            }

        }
        pokemons.add(new Pokemon(nome,tipo,forca,capturado));
        return "Pokemon cadastrado com sucesso!!!";
    }

    //Remover o pokemon pelo indice
    @GetMapping("/remover/{indice}")
    public String removerPokemon(@PathVariable int indice){
        pokemons.remove(indice);
        return "Pokemon removido com sucesso";
    }

    //Buscar Pokemon pelo indice
    @GetMapping("/buscar/{indice}")
    public Pokemon buscarPokemon(@PathVariable int indice){
        return pokemons.get(indice);
    }

    //Atualizar o pokemon pelo indice
    @GetMapping("/atualizar/{indice}/{nome}/{tipo}/{forca}/{capturado}")
    public String atualizarPokemon(
            @PathVariable int indice,
            @PathVariable String nome,
            @PathVariable String tipo,
            @PathVariable double forca,
            @PathVariable boolean capturado
    ){
        pokemons.set(indice, new Pokemon(nome,tipo,forca,capturado));
        return "Pokemon atualizado com sucesso!!!";
    }

    //Mostrar a lista de pokemons
    @GetMapping("/listar")
    public List<Pokemon> pokemons(){return pokemons;}


    //DESAFIOS

    //Retornar a quantidade do tipo informado
    @GetMapping("/contagem/{tipo}")
    public String contagemTipo(@PathVariable String tipo){
        int contador = 0;

        for (Pokemon pokemon :pokemons){
            if (pokemon.getTipo().equals(tipo)){
                contador ++;
            }
        }

        //Solução moderna
        /*
                long contadorzinho = pokemons.stream()
                .filter(pokemon -> pokemon.getTipo().equals(tipo))
                .count();

         */
        return String.format("Foram encontrados %d Pokemons do tipo %s", contador, tipo);
    }

    //Retornar os Pokemons que foram capturados
    @GetMapping("/capturados")
    public List<Pokemon> capturador(){
        List capturados = new ArrayList<>();

        for (Pokemon pokemon : pokemons){
            if (pokemon.isCapturado()){
                capturados.add(pokemon);
            }
        }
        return capturados;

        //Solução moderna
        /*
        return pokemons.stream()
                        .filter(pokemon -> pokemon.getCapturado())
                        .collect(Collectors.toList());

        // solução moderna v2
        return pokemons.stream()
                        .filter(Pokemon::getCapturado)
                        .collect(Collectors.toList());
         */

    }
    //Exibir pokemons fortes
    @GetMapping("/fortes")
    public List<Pokemon> fortes() {
        List fortes = new ArrayList<>();

        for (Pokemon pokemon : pokemons) {
            if (pokemon.getForca() > 3.000) {
                fortes.add(pokemon);
            }
        }
        return fortes;
    }

    //Exibir pokemons fracos
    @GetMapping("/fracos")
    public List<Pokemon> fracos() {
        List fracos = new ArrayList<>();

        for (Pokemon pokemon : pokemons) {
            if (pokemon.getForca() < 3.000) {
                fracos.add(pokemon);
            }
        }
        return fracos;
    }

}
