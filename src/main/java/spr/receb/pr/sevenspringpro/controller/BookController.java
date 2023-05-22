package spr.receb.pr.sevenspringpro.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spr.receb.pr.sevenspringpro.dao.BookEntity;
import spr.receb.pr.sevenspringpro.dto.BookDto;
import spr.receb.pr.sevenspringpro.service.BookService;

@RestController
@AllArgsConstructor
public class BookController {

    public final BookService bookService;


    @PostMapping("saveB")
    public BookDto save(@RequestBody BookDto dto) {

        return bookService.saveBook(dto);

    }

    @DeleteMapping("deleteB")

    public int delete(int id) {
        bookService.deleteBook(id);
        return id;

    }

@PutMapping ("updateB")
    public BookEntity update(@RequestParam Long id, @RequestBody BookDto dto){
        return bookService.updateBook( id,dto);
}

}
