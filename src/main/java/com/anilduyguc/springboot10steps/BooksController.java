package com.anilduyguc.springboot10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(1l, "The Clash off Kings", "George R. R. Martin"));
    }
}
