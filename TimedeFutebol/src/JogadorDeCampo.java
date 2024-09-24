public class JogadorDeCampo extends Jogador {

    public JogadorDeCampo(String nome, int idade, String posicao) {
        super(nome, idade, posicao);
    }

    @Override
    public void defender() {
        System.out.println("\nJogadores de campo não são responsáveis por defender como goleiros.");
    }

    public void driblar() {
        System.out.println(this.getNome() + " está driblando.");
    }
}


