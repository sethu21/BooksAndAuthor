import java.util.Optional;
import java.util.Scanner;

public class GetAuthorByIdMenuAction implements MainAction {
    private AuthorService service;

    public GetAuthorByIdMenuAction(AuthorService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author id: ");
        int id = scanner.nextInt();
        Author author = service.getAuthorById(id);
        if (author == null) {
            System.out.println("Author not found");
        } else {
            System.out.println("Author: " + author);
        }
    }
}
