package Controllers;


import Models.Book;
import Repository.BookRepository;
import Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class Controller {

    @Autowired
    private BookService service;
    @GetMapping (value = "/lista", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> listar(){
    List<Book> recorer =service.listar();
    return recorer;
    }

    @GetMapping(value = "/prueba")
    public String Hola (){
        return "hola";
    }

}
