package spr.receb.pr.sevenspringpro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spr.receb.pr.sevenspringpro.dao.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {
}
