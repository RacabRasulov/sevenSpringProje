package spr.receb.pr.sevenspringpro.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spr.receb.pr.sevenspringpro.dao.CountryEntity;
import spr.receb.pr.sevenspringpro.dto.BookDto;
import spr.receb.pr.sevenspringpro.dto.CountryDto;
import spr.receb.pr.sevenspringpro.service.CountryService;

@RestController
@AllArgsConstructor
public class CountryController {

    public final CountryService countryService;


    @PostMapping("saveCo")
    public CountryDto save(@RequestBody CountryDto dto) {

        return countryService.saveCountry(dto);
    }

    @DeleteMapping("deleteCo")
    public CountryEntity delete(int id) {
      return   countryService.deleteCountry(id);

    }
@PutMapping ("updateCo")
    public CountryEntity update(@RequestParam Long id, @RequestBody CountryDto dto){

       return countryService.updateCountry(id,dto);
}

}
