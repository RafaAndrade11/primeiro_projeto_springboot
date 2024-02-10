/**
 * 
 */
package br.com.randrade.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.randrade.domain.Cliente;

/**
 * 
 */
public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}
