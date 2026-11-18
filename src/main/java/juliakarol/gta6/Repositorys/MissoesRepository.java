package juliakarol.gta6.Repositorys;

import juliakarol.gta6.Entityes.Missoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissoesRepository extends JpaRepository<Missoes,Integer> {
}
