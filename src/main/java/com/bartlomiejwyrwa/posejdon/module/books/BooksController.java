package com.bartlomiejwyrwa.posejdon.module.books;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
@RestController
public class BooksController {
    @Autowired
    private BooksRepository booksRepository;


    //private static final List<BooksEntity> BOOKS_ENTITIES = List.of(
          //  new BooksEntity().setId(1L).setTitle("Lorem 1").setAuthor("Author 1"),
             // new BooksEntity().setId(2L).setTitle("Lorem ").setAuthor("Authore"),
               //   new BooksEntity()  .setId(3L).setTitle("Lorem 7").setAuthor("Author o"));
    @GetMapping(value="/rest/books/{id}")
    public BooksEntity getBook(@PathVariable Long id){
    return booksRepository.findById(id).get();

    }
    @GetMapping("/rest/books")
    public List<BooksEntity>getBooks(){
        return booksRepository.findAll();
}
@PostMapping("/rest/books")
    public BooksEntity newBooks(@RequestBody BooksEntity booksEntity){
        return booksRepository.saveAndFlush(booksEntity);
}
@DeleteMapping("rest/books/{id}")
    public void deleteBooks(@PathVariable Long id){
        booksRepository.deleteById(id);
}

}
