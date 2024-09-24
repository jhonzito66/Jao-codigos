import java.util.ArrayList;

public class Biblioteca {
    private String name;
    ArrayList<Book> catalog;

    public Biblioteca(String name) {
        this.name = name;
        this.catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null) {
            catalog.add(book);
        } else {
            System.out.println("O livro não pode ser nulo.");
        }
    }
    public void removeBook(String isbn) {
        for(Book book: catalog){
            if(book.getIsbn().equalsIgnoreCase(isbn)) {
                catalog.remove(book);
                System.out.println("Livro removido com sucesso.");
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    public Book searchBook(String title){
        for(Book book: catalog){
            if(book.getTitle().equalsIgnoreCase(title)) {
                book.viewDetails();
            }
        }
        System.out.println("Livro não encontrado");
        return null;
    }

    public void listBooks(){
        for(Book book: catalog){
            book.viewDetails();
        }
    }

    public void borrowBook(String isbn){
        for(Book book: catalog){
            if(book.getIsbn().equalsIgnoreCase(isbn)) {
                book.borrow();
            }
        }
    }

    public void returnBook(String isbn){
        boolean bookFound = false;

            for(Book book : catalog){
                if(book.getIsbn().equalsIgnoreCase(isbn)){
                    bookFound = true;
                    book.Return();
                }
            }
            if(!bookFound){
                System.out.println("Nenhum livro encontrado com o ISBN fornecido.");
            }
    }


}
