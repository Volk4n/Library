import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("***** Java Library *****");
            System.out.println(" -> Options:");
            System.out.println(" -> 1. Add Book");
            System.out.println(" -> 2. List Books");
            System.out.println(" -> 3. Remove Books");
            System.out.println(" -> 4. Add Member");
            System.out.println(" -> 5. List Members");
            System.out.println(" -> 0. Exit");

            System.out.print(" Your Choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine();
                System.out.print("Title of the Book: ");
                String title = scanner.nextLine();
                System.out.print("Author of the book: ");
                String author = scanner.nextLine();
                library.addBook(title, author);

            } else if (choice == 2) {
                library.listBooks();

            } else if (choice == 3) {
                scanner.nextLine();
                System.out.print("Title of the book that will be removed: ");
                String removeBook = scanner.nextLine();
                library.removeBook(removeBook);

            } else if (choice == 4) {
                scanner.nextLine();
                System.out.print("Name of new member: ");
                String newMember = scanner.nextLine();
                System.out.print("Member No: ");
                int memberNo = scanner.nextInt();
                library.addMember(newMember, memberNo);
                
            } else if (choice == 5) {
                library.listMembers();
            } else if (choice == 0) {
                isRunning = false;
            }
        }
    }
}
