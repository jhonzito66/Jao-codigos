import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaGestaoProjetos sistema = new SistemaGestaoProjetos();

        boolean continuar = true;

        while (continuar) {
            System.out.println("----- MENU -----");
            System.out.println("1. Adicionar Projeto");
            System.out.println("2. Remover Projeto");
            System.out.println("3. Listar Projetos");
            System.out.println("4. Adicionar Equipe a Projeto");
            System.out.println("5. Remover Equipe de Projeto");
            System.out.println("6. Adicionar Funcionário a Equipe");
            System.out.println("7. Transferir Funcionário entre Equipes");
            System.out.println("8. Listar Projetos e Detalhes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                System.out.println("\n-------------------------");
                System.out.print("Nome do Projeto: ");
                String nomeP = scanner.nextLine();
                System.out.print("Descrição do Projeto: ");
                String descricaoP = scanner.nextLine();
                Projeto projeto = new Projeto(nomeP, descricaoP);
                sistema.addProjetos(projeto);
                System.out.println("Projeto adicionado com sucesso!");

            } else if (escolha == 2) {
                System.out.println("\n-------------------------");
                System.out.print("\nNome do Projeto para remover: ");
                String nomeRemoverP = scanner.nextLine();
                sistema.removeProjetos(nomeRemoverP);
                System.out.println("Projeto removido com sucesso!");

            } else if (escolha == 3) {
                System.out.println("\n-------------------------");
                sistema.listarProjetos();

            } else if (escolha == 4) {
                System.out.println("\n-------------------------");
                System.out.print("\nNome do Projeto: ");
                String nomeProjetoEquipe = scanner.nextLine();
                Projeto projetoEquipe = sistema.encontrarProjeto(nomeProjetoEquipe);

                if (projetoEquipe != null) {
                    System.out.print("Nome da Equipe: ");
                    String nomeEquipe = scanner.nextLine();
                    Equipe equipe = new Equipe(nomeEquipe);
                    sistema.adiconarEquipeaProjeto(equipe, projetoEquipe);
                    System.out.println("Equipe adicionada ao projeto com sucesso!");
                } else {
                    System.out.println("\nProjeto não encontrado.");
                }

            } else if (escolha == 5) {
                System.out.println("\n-------------------------");
                System.out.print("\nNome do Projeto: ");
                String nomeProjetoRemoverEquipe = scanner.nextLine();
                Projeto projetoRemoverEquipe = sistema.encontrarProjeto(nomeProjetoRemoverEquipe);

                if (projetoRemoverEquipe != null) {
                    System.out.print("Nome da Equipe para remover: ");
                    String nomeEquipeRemover = scanner.nextLine();
                    Equipe equipeRemover = encontrarEquipe(projetoRemoverEquipe, nomeEquipeRemover);

                    if (equipeRemover != null) {
                        sistema.removeEquipedeProjeto(equipeRemover, projetoRemoverEquipe);
                        System.out.println("Equipe removida do projeto com sucesso!");
                    } else {
                        System.out.println("\nEquipe não encontrada.");
                    }
                } else {
                    System.out.println("\nProjeto não encontrado.");
                }

            } else if (escolha == 6) {
                System.out.println("\n-------------------------");
                System.out.print("\nNome do Projeto: ");
                String nomeProjetoFunc = scanner.nextLine();
                Projeto projetoFunc = sistema.encontrarProjeto(nomeProjetoFunc);

                if (projetoFunc != null) {
                    System.out.print("Nome da Equipe: ");
                    String nomeEquipeFunc = scanner.nextLine();
                    Equipe equipeFunc = encontrarEquipe(projetoFunc, nomeEquipeFunc);

                    if (equipeFunc != null) {
                        System.out.print("Nome do Funcionário: ");
                        String nomeFunc = scanner.nextLine();
                        System.out.print("Cargo do Funcionário: ");
                        String cargoFunc = scanner.nextLine();
                        System.out.print("Salário do Funcionário: ");
                        double salarioFunc = scanner.nextDouble();
                        scanner.nextLine();  // Consumir a nova linha
                        Funcionario funcionario = new Funcionario(nomeFunc, cargoFunc, salarioFunc);
                        sistema.adicionarEspecifico(equipeFunc, funcionario);
                        System.out.println("\nFuncionário adicionado à equipe com sucesso!");
                    } else {
                        System.out.println("\nEquipe não encontrada.");
                    }
                } else {
                    System.out.println("\nProjeto não encontrado.");
                }

            } else if (escolha == 7) {
                System.out.println("\n-------------------------");
                System.out.print("\nNome do Projeto de Origem: ");
                String nomeProjetoOrigem = scanner.nextLine();
                Projeto projetoOrigem = sistema.encontrarProjeto(nomeProjetoOrigem);

                if (projetoOrigem != null) {
                    System.out.print("\nNome da Equipe de Origem: ");
                    String nomeEquipeOrigem = scanner.nextLine();
                    Equipe equipeOrigem = encontrarEquipe(projetoOrigem, nomeEquipeOrigem);

                    if (equipeOrigem != null) {
                        System.out.print("\nNome do Funcionário a Transferir: ");
                        String nomeFuncionario = scanner.nextLine();
                        Funcionario funcionario = encontrarFuncionario(equipeOrigem, nomeFuncionario);

                        if (funcionario != null) {
                            System.out.print("\nNome do Projeto de Destino: ");
                            String nomeProjetoDestino = scanner.nextLine();
                            Projeto projetoDestino = sistema.encontrarProjeto(nomeProjetoDestino);

                            if (projetoDestino != null) {
                                System.out.print("\nNome da Equipe de Destino: ");
                                String nomeEquipeDestino = scanner.nextLine();
                                Equipe equipeDestino = encontrarEquipe(projetoDestino, nomeEquipeDestino);
                                
                                if (equipeDestino != null) {
                                    sistema.transferenciap(equipeOrigem, funcionario, equipeDestino);
                                    System.out.println("\nFuncionário transferido com sucesso!");
                                } else {
                                    System.out.println("\nEquipe de destino não encontrada.");
                                }
                            } else {
                                System.out.println("\nProjeto de destino não encontrado.");
                            }
                        } else {
                            System.out.println("\nFuncionário não encontrado.");
                        }
                    } else {
                        System.out.println("\nEquipe de origem não encontrada.");
                    }
                } else {
                    System.out.println("\nProjeto de origem não encontrado.");
                }

            } else if (escolha == 8) {
                sistema.listarProjetos();

            } else if (escolha == 0) {
                // Sair
                continuar = false;
                System.out.println("Saindo do sistema...");

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static Equipe encontrarEquipe(Projeto projeto, String nomeEquipe) {
        for (Equipe e : projeto.equipes) {
            if (e.getNome().equalsIgnoreCase(nomeEquipe)) {
                return e;
            }
        }
        return null;
    }

    private static Funcionario encontrarFuncionario(Equipe equipe, String nomeFuncionario) {
        for (Funcionario f : equipe.membros) {
            if (f.getNome().equalsIgnoreCase(nomeFuncionario)) {
                return f;
            }
        }
        return null;
    }
}
