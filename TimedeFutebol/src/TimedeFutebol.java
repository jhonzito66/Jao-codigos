public class TimedeFutebol {
    public static void main(String[] args) {

        JogadorDeCampo Neymar = new JogadorDeCampo("Neymar jr", 25 , "Atacante");
        JogadorDeCampo Messi = new JogadorDeCampo("Messi ", 30 , "Atacante");
        JogadorDeCampo Mbappe = new JogadorDeCampo("Mbappe ", 20 , "Atacante");
        Goleiro Courtois = new Goleiro("Courtois", 40 , "Goleiro");


        System.out.println("O JOGO VAI COMEÇAR");
        System.out.println();
        System.out.println("JOGADORES PRESENTES:");
        System.out.println("------------------------------------------------");
        Neymar.exibirDetalhes();
        System.out.println("------------------------------------------------");
        Messi.exibirDetalhes();
        System.out.println("------------------------------------------------");
        Mbappe.exibirDetalhes();
        System.out.println("------------------------------------------------");
        Courtois.exibirDetalhes();
        System.out.println("------------------------------------------------");


        Neymar.driblar();
        Messi.defender();
        Mbappe.driblar();
        Courtois.defenderPenalti();

    }
}