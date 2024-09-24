public class Equipe {
    private String nome;
    private Hero[] herois;
    private int numHerois;
    
    public Equipe(String nome) {
        this.nome = nome;
        this.herois = new Hero[3];
        this.numHerois = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hero[] getHerois() {
        return herois;
    }

    public void removerHeroi(int indice, Hero heroi) {
        if (indice>=0 && indice<herois.length) {
            if(herois[indice] != null) {
                herois[indice] = null;
                numHerois--;
                for (int i=indice; i<herois.length-1; i++) {
                    herois[i] = herois[i+1];
                }
                herois[herois.length-1] = null;
            }else {
                System.out.println("Nenhum herói para remover neste índice.");
            }
        }else {
            System.out.println("Índice fora dos limites.");
        }
    }

    public void adicionarHerois(int indice, Hero heroi){
        if(indice>=0 && indice<herois.length) {
            if(herois[indice] == null) { 
                numHerois++;
                herois[indice] = heroi;
            }else {
                System.out.println("Já existe um herói neste índice.");
            }
        }else {
            System.out.println("Índice fora dos limites.");
        }
    }

    public void attackTeam(Hero[] enemy){
        for(int i=0; i<herois.length; i++){
            if(herois[i] != null) {
                herois[i].attack(enemy[i]);
            }
        }
    }

    public void exibirEquipe(){
        for(int i=0; i<herois.length; i++){
            if(herois[i] != null) {
                System.out.printf("\nÍndice " + i + ": ");
                herois[i].displayStatus();
                System.out.println("-------------------------------------------------------");
            }else {
                System.out.println("Índice " + i + ": Vazio");
            }
        }
    }

    public int hpTotal(){
        int hptotal=0;
        for (int i = 0; i < herois.length; i++) {
            if(herois[i] != null) {
                hptotal += herois[i].getHp();
            }
        }
        return hptotal;
    }
    
}
