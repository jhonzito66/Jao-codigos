public class Goleiro extends Jogador {

    public Goleiro(String nome, int idade, String posicao) {
        super(nome, idade, posicao);
    }

    @Override
    public void defender() {
        System.out.println("\nO goleiro "+ this.getNome() +" está fazendo uma defesa.");
    }

    public void defenderPenalti() {
        System.out.println("\nO goleiro "+ this.getNome() +" está tenatndo defender um pênalti.");
    }
}

