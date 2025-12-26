package dio.design_patterns_spring_boot.service;

import dio.design_patterns_spring_boot.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

     Cliente buscarPorId(Long id);

     void inserir(Cliente cliente);

     void atualizar(Long id, Cliente cliente);

     void deletar(Long id);
}
