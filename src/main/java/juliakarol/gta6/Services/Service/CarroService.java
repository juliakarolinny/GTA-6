package juliakarol.gta6.Services.Service;

import jakarta.transaction.Transactional;
import juliakarol.gta6.Entityes.Carro;
import juliakarol.gta6.Repositorys.CarroRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CarroService {

    private final CarroRepository repository;

    public CarroService(CarroRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(Carro carro){
        repository.save(carro);
    }

    public List<Carro> mostrar(){
        return repository.findAll();
    }

    public void remover(int id){
        repository.deleteById(id);
    }

    @Transactional
    public void atualizar(int id, Carro c){
        Carro carro = repository.findById(id).get();
        carro.setCategoria(c.getCategoria());
        carro.setDescricao(c.getDescricao());
        carro.setMarca(c.getMarca());
        carro.setNomeDoVeiculo(c.getNomeDoVeiculo());

    }

}
