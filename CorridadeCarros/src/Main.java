import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        String modelo;
        String cor;
        int velocidade;
        Carro car1 = new Carro("Mercedes Benz G63", "Preta", 0, 0);
        Carro car2 = new Carro("Toyota Supra", "Laranja", 0, 0);
        Carro car3 = new Carro("Porsche 911 gt3 rs", "Prata", 0, 0);    
    

            for(int i=0; i<200; i++){
                   int c1 = rand.nextInt(2);
                    if(c1==0){
                        car1.frear();
                    }else if(c1==1){
                        car1.Acelerar();
                        car1.Percorrer();
                    }
                    
                    int c2 = rand.nextInt(2);
                    if(c2==0){
                        car2.frear();
                    }else if(c1==1){
                        car2.Acelerar();
                        car2.Percorrer();
                    }
                    
                    int c3 = rand.nextInt(2);
                    if(c3==0){
                        car3.frear();
                    }else if(c1==1){
                        car3.Acelerar();
                        car3.Percorrer();
                    }

                    System.out.println("-----------------------");
                    car1.ExibirVelocidade();
                    System.out.println("-----------------------");
                    car2.ExibirVelocidade();
                    System.out.println("-----------------------");
                    car3.ExibirVelocidade();
                    System.out.println("-----------------------");
            }

            Carro vencedor = car1;

            if(car2.getVelocidade()> vencedor.getVelocidade()){
                vencedor = car2;
            }
            if(car3.getVelocidade()>vencedor.getVelocidade()){
                vencedor = car3;
            }

            System.out.println("O CARRO VENCEDOR FOI: ");
            vencedor.ExibirInfo();
            System.out.println("-----------------------");
    }
}
