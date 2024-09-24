import java.util.stream.DoubleStream;

public class Jogador {

    private String nome;
    private int idade;
    private String posicao;

    public Jogador(String nome, int idade, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void fazerGol() {
        System.out.println(this.nome + " fez um gol.");
    }

    public void defender() {
        System.out.println(this.nome + " está tentando defender.");
    }

    public void exibirDetalhes(){
        System.out.println("Jogador" + this.nome + " tem " + this.idade + " anos e é " + this.posicao);
    }
}
