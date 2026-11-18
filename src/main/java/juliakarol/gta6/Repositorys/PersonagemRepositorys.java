package juliakarol.gta6.Repositorys;

import juliakarol.gta6.Entityes.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepositorys extends JpaRepository<Personagem,Integer> {
}
