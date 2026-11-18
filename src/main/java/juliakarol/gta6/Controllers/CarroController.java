package juliakarol.gta6.Controllers;


import jakarta.transaction.Transactional;
import juliakarol.gta6.Entityes.Arma;
import juliakarol.gta6.Entityes.Carro;
import juliakarol.gta6.Services.Service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Carro")

public class CarroController {

    private final CarroService service;
    public CarroController(CarroService service) {
        this.service = service;
    }

    @PostMapping
    public void cadastrar(@RequestBody Carro carro) {
        service.cadastrar(carro);
    }
    @GetMapping
    public List<Carro>mostrar(){
        return service.mostrar();
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        service.remover(id);
    }
    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Carro carro){
        service.atualizar(id,carro);
    }

}
