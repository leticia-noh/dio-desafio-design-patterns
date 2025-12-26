package dio.design_patterns_spring_boot.repository;

import dio.design_patterns_spring_boot.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
