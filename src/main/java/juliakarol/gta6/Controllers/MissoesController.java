package juliakarol.gta6.Controllers;

import juliakarol.gta6.Entityes.Missoes;
import juliakarol.gta6.Services.Service.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MissoesController {

    private final MissoesService service;
    public MissoesController(MissoesService service) {
        this.service = service;
    }

    @PostMapping
    public void criar (@RequestBody Missoes m) {
        service.cadastrar(m);
    }
    @GetMapping
    public List<Missoes> mostrar() {
        return service.mostrar();
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Integer id) {
        service.deletar(id);
    }
    @PutMapping ("/{id}")
    public void atualizar (@PathVariable Integer id, @RequestBody Missoes m) {
        service.editar(id,m);
    }
}
