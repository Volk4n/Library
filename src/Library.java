import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<Member> memberList = new ArrayList<>();

    Library() {
        this.bookList = new ArrayList<>();
        this.memberList = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookList.add(book);
        System.out.println(title + " added successfully.");
    }

    public void listBooks() {
        if (bookList.isEmpty()) {
            System.out.println("There is no book in the library!");
        } else {
            System.out.println("----- Book List -----");
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    public void removeBook(String title) {
        Book bookToDelete = null;

        for (Book book: bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookToDelete = book;
                break;
            }
        }
        if (bookToDelete != null) {
            bookList.remove(bookToDelete);
            System.out.println("Book removed: " + title);
        } else {
            System.out.println("Error: Book '" + title + "' not found!");
        }
    }

    public void addMember(String name, int memberNo) {
        Member member = new Member(name, memberNo);
        memberList.add(member);
        System.out.println(member + " added successfully.");
    }

    public void listMembers() {
        if (memberList.isEmpty()) {
            System.out.println("No member found!");
        } else {
            System.out.println("----- Member List -----");
            for (Member member : memberList) {
                System.out.println(member);
            }
        }
    }
}
