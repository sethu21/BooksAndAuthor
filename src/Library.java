import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Author> authors;
    private List<Book> books;

    public Library() {
        authors = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Author getAuthorById(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    public Book getBookByName(String name) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }
}
