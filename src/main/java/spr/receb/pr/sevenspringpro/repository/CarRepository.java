package spr.receb.pr.sevenspringpro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spr.receb.pr.sevenspringpro.dao.CarEntity;

@Repository
public interface CarRepository extends CrudRepository<CarEntity,Long> {
}
