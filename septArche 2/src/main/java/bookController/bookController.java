package bookController;

import bookModel.Book;
import bookDao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(path = "/books")
public class bookController {
    @Autowired
    private BookRepository bookRepository;

    public bookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(value = "/books")

    public List<Book> getAllBooks() {
        return bookRepository.findAll();

   }

}
