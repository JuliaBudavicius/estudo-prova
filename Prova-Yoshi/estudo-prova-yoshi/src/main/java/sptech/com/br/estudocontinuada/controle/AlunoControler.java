package sptech.com.br.estudocontinuada.controle;

import org.springframework.web.bind.annotation.*;
import sptech.com.br.estudocontinuada.entidade.Aluno;
import sptech.com.br.estudocontinuada.entidade.Linha;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoControler {

    //USAR NO POSTMAN
    private List<Aluno> alunos = new ArrayList<>();

    //Mostrar a lista
    @GetMapping
    public List<Aluno> getAlunos() {
        return alunos;
    }

    //Post = Adicionar
    //Para add no PostMan é (raw) e depois escolher JASON
    @PostMapping
    public String adicionarAluno (@RequestBody Aluno novoAluno){
        alunos.add(novoAluno);
        return "Aluno cadastrado!!!";
    }

    //Get = Pegar
    //Pegar pelo indice
    @GetMapping("/{indice}")
    public Aluno getAlunoPorIndice(@PathVariable int indice){
        return alunos.get(indice);
    }

    //Put = Atualizar
    @PutMapping("/{indice}")
    public String atualizarAlunoPorIndice(
            @PathVariable int indice,
            @RequestBody Aluno alunoAtualizado
    ){
        alunos.set(indice, alunoAtualizado);
        return "Aluno atualizado com sucesso";
    }

    //Delete = Deletar
    @DeleteMapping("/{indice}")
    public String removerPorIndice(@PathVariable int indice){
        alunos.remove(indice);
        return "Aluno removido";
    }
}

