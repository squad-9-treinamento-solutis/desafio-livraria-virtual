package br.com.solutis.livraria.repository;

import br.com.solutis.livraria.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
