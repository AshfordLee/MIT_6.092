package Ass4;
public class Library {
    // Add the missing implementation to this class
    String address;
    Book[] books;
    int count;
    Library(String address)
    {
        this.address=address;
        this.books=new Book[100];
        this.count=0;
    }

    void addBook(Book book)
    {
        this.books[this.count]=book;
        this.count++;
    }

    static void printOpeningHours()
    {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    void printAddress()
    {
        System.out.println(this.address);
    }

    void borrowBook(String book)
    {
        for (int i=0;i<this.count;i++)
        {
            if (this.books[i].getTitle().equals(book))
            {
                if (this.books[i].isBorrowed())
                {
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                }
                else
                {
                    System.out.println("You successfully borrowed "+book);
                    this.books[i].borrowed();
                    return;
                }
            }
        }

        System.out.println("Sorry, this book is not in our catalog.");
        return;
    }

    void printAvailableBooks()
    {
        if (this.count==0)
        {
            System.out.println("No book in catalog");
            return;
        }

        for(int i=0;i<this.count;i++)
        {
            if (!this.books[i].isBorrowed())
            {
                System.out.println(this.books[i].getTitle());
            }
        }
    }

    void returnBook(String book)
    {
        for(int i=0;i<this.count;i++)
        {
            if (this.books[i].getTitle().equals(book))
            {
                this.books[i].returned();
                System.out.println("You successfully returned "+book);
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
        return;
    }
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 