import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorService {
    private AuthorRepository repository = new AuthorRepository();

    public AuthorService(Library library) {
    }


    public void addAuthor(Author author) {
        repository.addAuthor(author);
    }

    public Author getAuthorById(int id) {
        return repository.getAuthorById(id);
    }

    public List<AuthorDto> getAllAuthors() {
        List<AuthorDto> result = new ArrayList<>();
        for (Author author : repository.getAuthors()) {
            result.add(AuthorDtoConverter.convertToDTO(author));
        }
        return result;
    }
}
