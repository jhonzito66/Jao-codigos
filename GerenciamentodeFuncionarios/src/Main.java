import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Empresa lista = new Empresa();
        Empresa1 lista1 = new Empresa1();

        int opt;

        do{
            System.out.println("\n     -----MENU-----     ");
            System.out.println("1- Registrar Funcinário.");
            System.out.println("2-  Listar Funcionário. ");
            System.out.println("3-        Sair.         ");
            System.out.println("     ---------------    ");
            System.out.println();
            System.out.printf("Digite sua opção: ");
            opt = scn.nextInt();


            switch(opt){
                case 1:
                    System.out.println("\n------------------------------------------------");
                    System.out.println("\n-----TIPO DE FUNCIONÁRIO-----");
                    System.out.println("1-   Funcionário assalariado.  ");
                    System.out.println("2-     Funcionário horista.    ");
                    int opc = scn.nextInt();

                        if(opc==1) {
                            System.out.println("\nFuncionário Assalariado");
                            scn.nextLine();
                            System.out.print("Nome : ");
                            String nome = scn.nextLine();
                            System.out.printf("CPF : ");
                            String cpf = scn.nextLine();
                            System.out.printf("SALARIO BASE : ");
                            double salario = scn.nextDouble();
                            System.out.printf("BONUS MENSAL : ");
                            double bonus = scn.nextDouble();

                            FuncionarioAssalariado newf = new FuncionarioAssalariado(nome, cpf, salario, bonus);
                            lista1.addFuncionario(newf);

                            System.out.println("------------------------------------------------");
                        } else if( opc == 2 ) {
                            System.out.println("\nFuncionário Horista.");
                            scn.nextLine();
                            System.out.printf("Nome : ");
                            String nome = scn.nextLine();
                            System.out.printf("CPF : ");
                            String cpf = scn.nextLine();
                            System.out.printf("HORAS TRABALHADAS : ");
                            double tb = scn.nextDouble();
                            System.out.printf("VALOR HORA : ");
                            double vh = scn.nextDouble();

                            funcionarioHorista newf = new funcionarioHorista(nome, cpf, 0, tb, vh);
                            lista.addFuncionario(newf);

                            System.out.println("------------------------------------------------");
                        } else {
                            System.out.println("INVALIDO!!!");
                        }
                        break;
                case 2:
                    System.out.println("\nLISTANDO....");
                    System.out.println("------------------------------------------------");
                    lista.listaFuncionario();
                    lista1.listaFuncionario();
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    System.out.println("SAINDO....");
                    break;
                default:
                    System.out.println("INVALIDO!!!");
                    break;
            }

        }while(opt!=3);
    }
}