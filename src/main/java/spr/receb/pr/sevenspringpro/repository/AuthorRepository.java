package spr.receb.pr.sevenspringpro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spr.receb.pr.sevenspringpro.dao.AuthorEntity;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity,Long> {
}
