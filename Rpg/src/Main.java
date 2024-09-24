import java.util.Random;

public class Main {
    public static void main(String[] args){
        Equipe junimboapinta = new Equipe("junim Boapinta");
        Equipe carlosDelagran = new Equipe("CarlosDelagran");

        Hero sirgago = new Hero("Sirgago", "Damage",100, 25);
        Hero elPaton = new Hero("elPaton", "tank",150, 15);
        Hero fire = new Hero("FirePantalion", "Mage",90, 35);

        junimboapinta.adicionarHerois(0, sirgago);        
        junimboapinta.adicionarHerois(1, elPaton);        
        junimboapinta.adicionarHerois(2, fire);        

        Hero son = new Hero("SonGoku", "Damage", 100, 25);
        Hero escudon = new Hero("Escudon", "tank",150, 15);
        Hero rock = new Hero("RockBalboa", "Mage",90, 35);

        carlosDelagran.adicionarHerois(0, son);
        carlosDelagran.adicionarHerois(1, escudon);
        carlosDelagran.adicionarHerois(2, rock);

        Random random = new Random();
        int round=0;
        System.out.println("EQUIPES:");
        System.out.println();
            System.out.println("EQUIPE 1:");
            junimboapinta.exibirEquipe();
            System.out.println("EQUIPE 2:");
            carlosDelagran.exibirEquipe();

        while(junimboapinta.hpTotal() > 0 && carlosDelagran.hpTotal() > 0){
            round++;

            System.out.println("ROUND " + round);
            System.out.println();
            
                int ataque = random.nextInt(2);
                
                if(ataque==0){
                    System.out.println("Ataque equipe 1");
                    junimboapinta.attackTeam(carlosDelagran.getHerois());

                }else if(ataque==1){
                    System.out.println("Ataque equipe 2");                    
                    carlosDelagran.attackTeam(junimboapinta.getHerois());

                }
            
                if(round==1){
                    System.out.println("Após o ataque:");
                }
            
                System.out.println("EQUIPE 1:");
                junimboapinta.exibirEquipe();
                System.out.println("-------------------------------------------------------");
                System.out.println("EQUIPE 2:");
                carlosDelagran.exibirEquipe();
            
        }

        System.out.println("VENCEDOR:");
        System.out.println();
        if(junimboapinta.hpTotal() <= 0) {
            System.out.println("Equipe 2 vencedora");
            carlosDelagran.exibirEquipe();
        }else {
            System.out.println("Equipe 1 vencedora");
            junimboapinta.exibirEquipe();
        }
    }

}
