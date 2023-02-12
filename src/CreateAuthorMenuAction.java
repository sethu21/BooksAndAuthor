import java.util.Scanner;

public class CreateAuthorMenuAction implements MainAction {
    private AuthorService service;

    public CreateAuthorMenuAction(AuthorService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author name: ");
        String name = scanner.nextLine();
        Author author = new Author(0, name);
        service.addAuthor(author);
        System.out.println("Author created: " + author);
    }
}
