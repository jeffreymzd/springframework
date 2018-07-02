package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.models.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
