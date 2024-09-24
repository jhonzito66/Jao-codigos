import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome, cpf, novonome;
        int idade, novaidade, count=0, opt;
        Scanner scan = new Scanner(System.in);
        Usuario[] user = new Usuario[5];

        do{
            System.out.println("-----MENU-----");
            System.out.println("1- CADASTRAR");
            System.out.println("2- ALTERAR NOME");
            System.out.println("3- ALTERAR IDADE");
            System.out.println("4- LISTAR");
            System.out.println("5- SAIR");

            opt = scan.nextInt();
            scan.nextLine();
            if(opt==1){
                if(count<=5){
                System.out.println("\nNOME: ");
                nome = scan.nextLine();
                System.out.println("CPF: ");
                cpf = scan.nextLine();
                System.out.println("IDADE: ");
                idade = scan.nextInt();

                Usuario aux = new Usuario(nome, cpf, idade);
                    
                if(aux.verificarMaiordade(idade)){
                        user[count] = aux;
                        count++;
                        System.out.println("Usuário cadastrado com sucesso.\n");
                    }else{
                        System.out.println("IDADE INVALIDA. MINIMO 18");
                    }
                }else{
                    System.out.println("NUMERO MÁXIMO DE CADASTROS.");
                } 
            }else if(opt==2){
                int indice;
                System.out.println("Selecione o índice correspondente ao usuário que deseja alterar nome:");
                for(int i=0; i<count; i++){
                    user[i].exibirInfo(i);
                }
               do{
                System.out.printf("Digite o índice: ");
                indice = scan.nextInt();
                if(indice>count){
                    System.out.println("INDICE INVALIDO");
                }else{
                    System.out.println("Digite o novo nome:");
                    scan.nextLine();
                    novonome = scan.nextLine();
                    user[indice].alterarNome(novonome);
                    System.out.println("nome alterado com sucesso.");
                }
                }while(indice>=count || indice<0);
            }else if(opt==3){
                int indice;
                System.out.println("Selecione o índice correspondente ao usuário que deseja alterar idade:");
                for(int i=0; i<count; i++){
                    user[i].exibirInfo(i);
                }
                do{
                    System.out.printf("Digite o índice: ");
                    indice = scan.nextInt();
                    if(indice>count){
                        System.out.println("INDICE INVALIDO");
                    }else{
                        System.out.println("Digite a nova idade:");
                        novaidade = scan.nextInt();
                        if(user[indice].verificarMaiordade(novaidade)){
                        user[indice].alterarIdade(novaidade);
                        System.out.println("Idade alterado com sucesso.");
                        }else{
                            System.out.println("IDADE INVALIDA. MINIMO 18.");
                        }
                    }
                    }while(indice>=count || indice<0);


            }else if(opt==4){
                Usuario[] temporario = new Usuario[count];
                for(int i=0; i<count; i++){
                    temporario[i] = user[i];
                }

                System.out.println("LISTANDO");

                for(int i = 0; i<temporario.length - 1; i++) {
                    for(int j = 0; j<temporario.length - i - 1; j++) {
                        if (temporario[j].getIdade()>temporario[j + 1].getIdade()) {
                            Usuario temp = temporario[j];
                            temporario[j] = temporario[j + 1];
                            temporario[j + 1] = temp;
                        }
                    }
                }
                
                for (int i = 0; i<temporario.length; i++) {
                    temporario[i].exibirCadastro();
                    System.out.println();
                }

            }else if(opt==5){
                System.out.println("\nSAINDO....");
            }else{
                System.out.println("INVALIDO\n");
            }

        }while(opt!=5);

        scan.close();
    }
}
