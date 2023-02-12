import java.util.List;

public class BookService {
    private BookRepository repository = new BookRepository();

    public BookService(Library library) {
    }

    public void addBook(Book book) {
        repository.addBook(book);
    }

    public List<Book> getBooks() {
        return repository.getBooks();
    }

    public List<Book> getBooksByAuthor(Author author) {
        return repository.getBooksByAuthor(author);
    }

    public Book getBookById(int id) {
        return repository.getBookById(id);
    }
}
