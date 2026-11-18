package juliakarol.gta6.Services.Service;

import jakarta.transaction.Transactional;
import juliakarol.gta6.Entityes.Arma;
import juliakarol.gta6.Entityes.Personagem;
import juliakarol.gta6.Repositorys.ArmaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaService {

    private final ArmaRepository repository;

    public ArmaService(ArmaRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(Arma arma){
        repository.save(arma);
    }

    public List<Arma> mostrar(){
        return repository.findAll();
    }

    public void deletar(int id){
        repository.deleteById(id);
    }
    @Transactional
    public void alterar(int id, Arma arma){
        Arma arm = repository.getReferenceById(id);
        arm.setNomeDaArma(arma.getNomeDaArma());
        arm.setCategoria(arma.getCategoria());
        arm.setDescricao(arma.getDescricao());
        arm.setFabricante(arma.getFabricante());

    }
}
