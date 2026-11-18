package juliakarol.gta6.Services.Service;

import jakarta.transaction.Transactional;
import juliakarol.gta6.Entityes.Personagem;
import juliakarol.gta6.Repositorys.PersonagemRepositorys;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonagemService {

    private final PersonagemRepositorys repository;

    public PersonagemService(PersonagemRepositorys repository) {
        this.repository = repository;
    }

    public void cadastrar(Personagem p) {
        repository.save(p);
    }

    public List<Personagem> mostrar() {
        return repository.findAll();
    }

    //DELETAR
    public void deletar(int id) {
        repository.deleteById(id);
    }

    //ALTERAR
    //  public Personagem alterar(int id, Personagem p) {
    //        Personagem personagem = repository.getReferenceById(id);
    //        personagem.setNome(p.getNome());
    //        personagem.setApelido(p.getApelido());
    //        personagem.setCategoria(p.getCategoria());
    //        personagem.setDescricao(p.getDescricao());
    //    }
    @Transactional
    public void alterar(int id, Personagem p) {
        Personagem personagem = repository.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setDescricao(p.getDescricao());
    }

}



