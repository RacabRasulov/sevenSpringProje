package spr.receb.pr.sevenspringpro.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spr.receb.pr.sevenspringpro.dao.CountryEntity;
import spr.receb.pr.sevenspringpro.dto.BookDto;
import spr.receb.pr.sevenspringpro.dto.CountryDto;
import spr.receb.pr.sevenspringpro.repository.CountryRepository;

@Service
@AllArgsConstructor
public class CountryService {

    public final CountryRepository countryRepository;

    public CountryDto saveCountry(CountryDto dto) {
        CountryEntity countryEntity = CountryEntity.builder().
                id(1L).countryName(dto.getCountryName()).population(dto.getPopulation()).build();

        countryRepository.save(countryEntity);
        return dto;
    }

    public CountryEntity deleteCountry (int id){
        CountryEntity countryEntity=countryRepository.findById(1L).get();
      countryRepository.delete(countryEntity);
    return countryEntity;

    }

    public CountryEntity updateCountry (Long id, CountryDto dto){
        CountryEntity countryEntity=countryRepository.findById(id).get();
countryEntity.setCountryName(dto.getCountryName());
       return countryRepository.save(countryEntity);

    }

}
