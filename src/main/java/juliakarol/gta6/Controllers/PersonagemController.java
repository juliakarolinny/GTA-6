package juliakarol.gta6.Controllers;


import juliakarol.gta6.Entityes.Personagem;
import juliakarol.gta6.Services.Service.PersonagemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@RestController
@RequestMapping("api/personagens")
public class PersonagemController {

    private final PersonagemService service;

    public PersonagemController(PersonagemService service) {
        this.service = service;
    }

    @PostMapping
    public void criar(@RequestBody Personagem p) {
        service.cadastrar(p);
    }
    @GetMapping
    public List<Personagem> mostrar() {
        return service.mostrar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        service.deletar(id);
    }

    @PutMapping ("/{id}")
    public void alterar(@PathVariable int id, @RequestBody  Personagem p){
        service.alterar(id,p);
    }
}



