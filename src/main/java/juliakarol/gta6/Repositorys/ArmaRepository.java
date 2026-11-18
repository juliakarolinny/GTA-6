package juliakarol.gta6.Repositorys;

import juliakarol.gta6.Entityes.Arma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmaRepository extends JpaRepository<Arma,Integer> {
}
