import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Biblioteca asfaldos = new Biblioteca("asfaldos");
        Scanner scan = new Scanner(System.in);
        String sim = "sim";
        Book[] a = new Book[3];
        int opt, i=0;
        do{
            System.out.println("\n-----MENU------");
            System.out.println("1- Adicionar Livros na biblioteca: ");
            System.out.println("2- Pegar livro: ");
            System.out.println("3- Devolver livro: ");
            System.out.println("4- Remover livro: ");
            System.out.println("5- Listar livros: ");
            System.out.println("6- Procurar livro: ");
            System.out.println("7- Sair: \n");
            opt = scan.nextInt();
            scan.nextLine();
            if(opt == 1){
                if(i<3) {
                    System.out.println("Digite o titulo do livro: ");
                    String titulo = scan.nextLine();
                    System.out.println("Digite o autor do livro: ");
                    String autor = scan.nextLine();
                    System.out.println("Digite o isbn do livro: ");
                    String isbn = scan.nextLine();

                    a[i] = new Book(titulo, autor, isbn, true);
                    if(i==0){
                        Book livro1 = a[i];
                        asfaldos.addBook(livro1);
                    }else if(i==1){
                        Book livro2 = a[i];
                        asfaldos.addBook(livro2);
                    }else if(i==2){
                        Book livro3 = a[i];
                        asfaldos.addBook(livro3);
                    }
                    i++;
                }else{
                    System.out.println("\nNúmero máximo de livros Cadastrados.");
                }
            }else if(opt == 2){
                System.out.println("\nDigite o ISBN do livro: ");
                String isbn = scan.next();
                asfaldos.borrowBook(isbn);
            }else if(opt == 3){
                System.out.println("\nDigite o ISBN do livro: ");
                String isbn = scan.nextLine();
                asfaldos.returnBook(isbn);
            }else if(opt == 4){
                System.out.println("\nDigite o ISBN do livro: ");
                String isbn = scan.nextLine();

                i--;
                asfaldos.removeBook(isbn);
            }else if(opt == 5){
                System.out.println("\nLISTANDO...");
                asfaldos.listBooks();
            }else if(opt == 6){
                System.out.println("\nDigite o título do livro: ");
                String titulonovo = scan.nextLine();
                asfaldos.searchBook(titulonovo);
            }else if(opt == 7){
                System.out.println("SAINDO...");
            }
        }while(opt!=7);





        scan.close();
    }
}
