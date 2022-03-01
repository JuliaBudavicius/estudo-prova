package sptech.com.br.estudocontinuada.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.com.br.estudocontinuada.entidade.Aluno;
import sptech.com.br.estudocontinuada.entidade.Linha;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoControler {

    //USAR NO JASON
    private List<Aluno> alunos = new ArrayList<>();

    @GetMapping("/{indice}")
    public List<Aluno> getAlunos(){
        return alunos;
    }
}
