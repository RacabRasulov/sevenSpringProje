package spr.receb.pr.sevenspringpro.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spr.receb.pr.sevenspringpro.dao.BookEntity;
import spr.receb.pr.sevenspringpro.dto.BookDto;
import spr.receb.pr.sevenspringpro.repository.BookRepository;

@Service
@AllArgsConstructor
public class BookService {

    public final BookRepository bookRepository;

    public BookDto saveBook(BookDto dto) {
        BookEntity bookEntity = BookEntity.builder().
                id(1L).origin(dto.getOrigin()).numberOfSheets(dto.getNumberOfSheets()).build();
        bookRepository.save(bookEntity);

        return dto;
    }

    public BookEntity deleteBook(int id){
        BookEntity bookEntity=bookRepository.findById(1L).get();
        bookRepository.delete(bookEntity);
        return bookEntity;

    }

    public BookEntity updateBook(Long id, BookDto dto){

        BookEntity bookEntity=bookRepository.findById(id).get();

        bookEntity.setOrigin(dto.getOrigin());
        bookEntity.setNumberOfSheets(dto.getNumberOfSheets());

       return bookRepository.save(bookEntity);

    }


}
