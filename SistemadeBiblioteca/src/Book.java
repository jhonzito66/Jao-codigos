public class Book {
    private String title;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Book(String title, String autor, String isbn, boolean disponivel) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void borrow(){
        if(disponivel){
            this.disponivel = false;
            System.out.println("Livro emprestado com sucesso.");
        }else{
            System.out.printf("Livro não disponível.");
        }
    }

    public void Return(){
        this.disponivel = true;
        System.out.println("Livro devolvido com sucesso.");
    }

    public void viewDetails(){
        System.out.println("\nTítulo: "+ this.title);
        System.out.println("Autor: "+ this.autor);
        System.out.printf("Isbn: "+ this.isbn);
        if(!disponivel){
            System.out.println(" Está indisponível.");
        }else{
            System.out.println(" Está disponível.");
        }
    }
}
