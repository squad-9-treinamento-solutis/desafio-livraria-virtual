package br.com.solutis.livraria.service;

import br.com.solutis.livraria.domain.Book;
import br.com.solutis.livraria.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
/*
 * This is a generic service for the usage of eletronic and printed books.
 * */
public class BookService<T extends Book> {
    private final BookRepository<T> bookRepository;

    public T addBook(T book) {
        return bookRepository.save(book);
    }

    public void removeBook(Long id) {
        Optional<T> optionalBook = bookRepository.findById(id);
        optionalBook.ifPresent(bookRepository::delete);
    }
}
