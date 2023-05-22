package spr.receb.pr.sevenspringpro.dao;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class AuthorEntity {
    @Id
    private Long id;

private String name;
    private String surname;




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
