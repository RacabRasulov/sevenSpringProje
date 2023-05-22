package spr.receb.pr.sevenspringpro.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spr.receb.pr.sevenspringpro.dao.AuthorEntity;
import spr.receb.pr.sevenspringpro.dto.AuthorDto;
import spr.receb.pr.sevenspringpro.service.AuthorService;

@RestController
@AllArgsConstructor


public class AuthorController {
    public final AuthorService authorService;


    @PostMapping("saveA")
    public AuthorDto save(@RequestBody AuthorDto dto) {
        return authorService.saveAuthor(dto);

    }

    @DeleteMapping("deleteA")
    public AuthorDto delete(@RequestParam Long id) {

        return authorService.deleteAuthor(id);

    }

    @PutMapping("updateA")
    public AuthorEntity update(@RequestParam int id, @RequestBody AuthorDto authorDto) {
        return authorService.updateAuthor(id, authorDto);
    }

    @GetMapping ("get/{id}")
    public AuthorDto getid(@PathVariable long id, @RequestBody AuthorDto dto){
        return authorService.getAuthor(id,dto);




    }

}
