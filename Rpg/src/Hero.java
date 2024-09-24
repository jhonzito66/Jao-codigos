public class Hero {
    private String nome;
    private String classe;
    private int hp;
    private int attack;

    public Hero(String nome, String classe, int hp, int attack){
        this.nome = nome;
        this.classe = classe;
        this.hp = hp;
        this.attack = attack;        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    
    public void attack(Hero enemy){
       enemy.setHp(enemy.getHp() - this.attack);
    }
    

    public void displayStatus(){
        System.out.println("\nNome: "+ this.nome);
        System.out.println("Classe: "+ this.classe);
        if(this.hp>0){
        System.out.println("Hp: "+ this.hp);
        }else{
            System.out.println("Hp: 0 (MORTO)");
        }
        System.out.println("Attack: "+ this.attack);
    }
        
    
}
