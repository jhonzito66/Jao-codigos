import java.util.ArrayList;
public class Equipe {

    private String nome;
    ArrayList<Funcionario> membros;

    public Equipe (String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void addMembros (Funcionario f) {
        if (f!=null) {
            membros.add(f);
        } else {
            System.out.println("O funcionário não pode ser nulo.");
        }
    }

    public void removeMembros (String nome) {
        membros.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
    }

    public void removerMembros (Funcionario f) {
        membros.remove(f);
    }

    public void listarMembros() {
        System.out.println("Membros da Equipe \"" + nome + "\":");
        for (Funcionario f : membros) {
            f.imprimirDetalhes(); // Usa o método imprimirDetalhes()
        }
    }

    public void imprimirDetalhes() {
        System.out.println("Equipe: " + nome);
        listarMembros();
    }

}
