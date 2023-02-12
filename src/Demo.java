import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        AuthorService authorService = new AuthorService(library);
        BookService bookService = new BookService(library);
        

        List<MainAction> actions = Arrays.asList(
                new CreateAuthorMenuAction(authorService),
                new GetAuthorByIdMenuAction(authorService),
                new GetBookByNameMenuAction(bookService)
        );

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create author");
            System.out.println("2. Get author by id");
            System.out.println("3. Get book by name");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int option = scanner.nextInt();
            if (option == 4) {
                break;
            }
            if (option >= 1 && option <= 3) {
                MainAction action = actions.get(option - 1);
                action.execute();
            } else {
                System.out.println("Invalid option");
            }
        }
    }
}
