package juliakarol.gta6.Services.Service;


import jakarta.transaction.Transactional;
import juliakarol.gta6.Entityes.Missoes;
import juliakarol.gta6.Repositorys.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private final MissoesRepository repository;

    public MissoesService(MissoesRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(Missoes missoes){
        repository.save(missoes);
    }

    public List<Missoes> mostrar(){
        return repository.findAll();
    }
    public void deletar(int id){
        repository.deleteById(id);
    }

    @Transactional
    public void editar( int id, Missoes missoes){
        Missoes m = repository.getReferenceById(id);
        m.setDescricaoObjetivo(m.getDescricaoObjetivo());
        m.setDificuldade(m.getDificuldade());
        m.setLocal(m.getLocal());
        m.setNomeDaMissao(m.getNomeDaMissao());

    }

}
