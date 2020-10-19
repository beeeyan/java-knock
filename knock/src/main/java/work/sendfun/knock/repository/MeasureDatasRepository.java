package work.sendfun.knock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.sendfun.knock.entity.Measuredatas;

@Repository
public interface MeasureDatasRepository extends JpaRepository<Measuredatas,Integer> {
}
