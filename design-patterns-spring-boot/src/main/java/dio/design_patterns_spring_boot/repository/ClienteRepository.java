package dio.design_patterns_spring_boot.repository;

import dio.design_patterns_spring_boot.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
