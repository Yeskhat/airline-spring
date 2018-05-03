package kz.kaznitu.airline.repositories;

import kz.kaznitu.airline.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, Long> {
    @Override
    Optional<Client> findById(Long aLong);
}
