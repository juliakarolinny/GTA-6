package juliakarol.gta6.Controllers;

import jakarta.transaction.Transactional;
import juliakarol.gta6.Entityes.Arma;
import juliakarol.gta6.Entityes.Personagem;
import juliakarol.gta6.Services.Service.ArmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Arma")
public class ArmaController {

    private final ArmaService service;
    public ArmaController(ArmaService service){
        this.service = service;
    }

    @PostMapping
    public void criarArma(@RequestBody Arma arma){
        service.cadastrar(arma);
    }

    @GetMapping
    public List<Arma>mostrar(){
        return service.mostrar();
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        service.deletar(id);
    }
    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Arma arma){
        service.alterar(id, arma);
    }

}
