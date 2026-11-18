package juliakarol.gta6.Repositorys;

import juliakarol.gta6.Entityes.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro,Integer> {
}
