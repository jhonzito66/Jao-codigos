import java.util.ArrayList;

public class SistemaGestaoProjetos {

    ArrayList<Projeto> projetos;

    public SistemaGestaoProjetos () {
        this.projetos = new ArrayList<>();
    }
    public void addProjetos (Projeto f) {
        if (f!=null) {
            projetos.add(f);
        } else {
            System.out.println("O projeto não pode ser nulo.");
        }
    }

    public void removeProjetos (String nome) {
        projetos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));

    }

    public void listarProjetos() {
        System.out.println("Projetos:");
        for (Projeto p : projetos) {
            p.imprimirDetalhes(); // Usa o método imprimirDetalhes() de Projeto
        }
    }

    public void adiconarEquipeaProjeto (Equipe e, Projeto p) {
        if (p != null && e != null) {
            p.addEquipes(e);
        } else {
            System.out.println("Projeto ou equipe não pode ser nulo.");
        }
    }

    public Projeto encontrarProjeto (String nome) {
        for (Projeto p : projetos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void removeEquipedeProjeto (Equipe e, Projeto p) {
        if (p != null && e != null) {
            p.remover(e);
        } else {
            System.out.println("Projeto ou equipe não pode ser nulo.");
        }
    }

    public void adicionarEspecifico (Equipe e, Funcionario f) {
        if (e != null && f != null) {
            e.addMembros(f);
        } else {
            System.out.println("Equipe ou funcionário não pode ser nulo.");
        }
    }

    public void transferenciap (Equipe origem, Funcionario f, Equipe destino) {
        if (origem != null && destino != null && f != null) {
            origem.removerMembros(f);
            destino.addMembros(f);
        } else {
            System.out.println("Equipe de origem, destino ou funcionário não pode ser nulo.");
        }
    }


}
