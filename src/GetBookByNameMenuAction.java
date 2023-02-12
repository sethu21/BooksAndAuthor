import java.util.List;
import java.util.Scanner;

public class GetBookByNameMenuAction implements MainAction{
    private BookService service;

    public GetBookByNameMenuAction(BookService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book name:");
        String name = scanner.nextLine();
        List<Book> books = service.getBooks();
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(name)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }
}
