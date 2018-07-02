package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepository extends CrudRepository<Book, Long> {
}
