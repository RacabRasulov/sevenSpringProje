package spr.receb.pr.sevenspringpro.dao;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class CountryEntity {
    @Id
    private Long id;
    private String countryName;
    private int population;




}
