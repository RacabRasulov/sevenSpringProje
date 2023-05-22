package spr.receb.pr.sevenspringpro.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spr.receb.pr.sevenspringpro.dao.AuthorEntity;
import spr.receb.pr.sevenspringpro.dto.AuthorDto;
import spr.receb.pr.sevenspringpro.repository.AuthorRepository;

@Service
@AllArgsConstructor
public class AuthorService {

    public final AuthorRepository authorRepository;


    public AuthorDto saveAuthor(AuthorDto dto) {
        AuthorEntity authorEntity = AuthorEntity.builder().
                id(1L).name(dto.getName()).surname(dto.getSurname()).build();
        authorRepository.save(authorEntity);
        return dto;
    }


    public AuthorDto deleteAuthor(Long id) {
        AuthorEntity authorEntity = authorRepository.findById(id).get();

        authorRepository.delete(authorEntity);
        return new AuthorDto();
    }

    public AuthorEntity updateAuthor(long id, AuthorDto dto) {

        AuthorEntity authorEntity = authorRepository.findById(id).get();
        authorEntity.setName(dto.getName());
        authorEntity.setSurname(dto.getSurname());

        return  authorRepository.save(authorEntity);


    }

    public AuthorDto getAuthor(Long id,AuthorDto dto){

        AuthorEntity authorEntity=authorRepository.findById(id).get();

        return dto;



    }


}
