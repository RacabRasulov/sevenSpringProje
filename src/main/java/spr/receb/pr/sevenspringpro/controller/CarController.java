package spr.receb.pr.sevenspringpro.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spr.receb.pr.sevenspringpro.dao.CarEntity;
import spr.receb.pr.sevenspringpro.dto.CarDto;
import spr.receb.pr.sevenspringpro.service.CarService;

@RestController
@AllArgsConstructor
public class CarController {

    public final CarService carService;

    @PostMapping("saveC")
    public CarDto save(@RequestBody CarDto dto) {
        return carService.saveCar(dto);

    }

    @DeleteMapping("deleteC")
    public int delete(int id) {

        carService.deleteCar(id);
        return id;
    }

    @PutMapping("update")
    public CarEntity update (@RequestParam Long id, @RequestBody CarDto dto){

    return     carService.update(id, dto);

    }
}
