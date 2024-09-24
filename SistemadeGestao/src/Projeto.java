import java.util.ArrayList;

public class Projeto {

    private String nome;
    private String descricao;
    ArrayList<Equipe> equipes;

    public Projeto (String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.equipes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public void addEquipes (Equipe e) {
        if (e!=null) {
            equipes.add(e);
        } else {
            System.out.println("A equipe não pode ser nulo.");
        }
    }

    public void remover (Equipe e) {
        equipes.remove(e);
    }


    public void removeEquipes (String nome) {
        equipes.removeIf(e -> e.getNome().equalsIgnoreCase(nome));
    }

    public void listarEquipes() {
        System.out.println("Equipes do Projeto \"" + nome + "\":");
        for (Equipe e : equipes) {
            e.imprimirDetalhes(); // Usa o método imprimirDetalhes() de Equipe
        }
    }

    public void imprimirDetalhes() {
        System.out.println("Projeto: " + nome);
        System.out.println("Descrição: " + descricao);
        listarEquipes();
    }
}
