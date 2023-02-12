import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepository {
    private List<Author> authors = new ArrayList<>();
    private int nextId = 1;

    public void addAuthor(Author author) {
        author.id = nextId++;
        authors.add(author);
    }

    public Author getAuthorById(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
