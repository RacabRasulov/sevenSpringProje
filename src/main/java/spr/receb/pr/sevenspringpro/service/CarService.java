package spr.receb.pr.sevenspringpro.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spr.receb.pr.sevenspringpro.dao.CarEntity;
import spr.receb.pr.sevenspringpro.dto.CarDto;
import spr.receb.pr.sevenspringpro.repository.CarRepository;

@Service
@AllArgsConstructor
public class CarService {

    public final CarRepository carRepository;

    public CarDto saveCar(CarDto dto) {
        CarEntity carEntity = CarEntity.builder().id(1L).mark(dto.getMark()).price(dto.getPrice()).build();
        carRepository.save(carEntity);

        return dto;
    }

    public CarEntity deleteCar(int id) {
        CarEntity carEntity = carRepository.findById(1L).get();
        carRepository.delete(carEntity);

        return carEntity;
    }

    public CarEntity update(Long id, CarDto dto) {

        CarEntity carEntity = carRepository.findById(id).get();
        carEntity.setMark(dto.getMark());
        carEntity.setPrice(dto.getPrice());

        return carRepository.save(carEntity);

    }

}
