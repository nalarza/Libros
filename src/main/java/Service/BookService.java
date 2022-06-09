package Service;

import Models.Book;
import Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book insertar (Book book) {
        return bookRepository.save(book);
    }
    public List<Book> listar(){
        return (List<Book>) bookRepository.findAll();
    }
}
