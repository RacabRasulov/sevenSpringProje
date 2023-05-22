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
public class BookEntity {

    @Id
    private Long id;
    private String origin;
    private int numberOfSheets;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
