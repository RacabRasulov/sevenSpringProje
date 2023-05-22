package spr.receb.pr.sevenspringpro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spr.receb.pr.sevenspringpro.dao.CarEntity;
import spr.receb.pr.sevenspringpro.dao.CountryEntity;


@Repository
public interface CountryRepository extends CrudRepository<CountryEntity,Long> {
}
