public class Carro {
    String modelo;
    String cor;
    int velocidade;
    int percorrida;

    public Carro(String modelo, String cor, int velocidade, int percorrida){
            this.modelo = modelo;
            this.cor = cor;
            this.velocidade = velocidade;
            this.percorrida = percorrida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setPercorrida(int percorrida) {
        this.percorrida = percorrida;
    }

    public int getPercorrida() {
            return percorrida;
    }

    public void Percorrer(){
        this.percorrida+=10;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void Acelerar(){
        this.velocidade+=10;
    }

    public void frear(){
        if(this.velocidade>=10){
            this.velocidade-=10;
        }
    }

    public void ExibirVelocidade(){
        if(this.velocidade<=200){
            System.out.println("MODELO: "+ this.modelo);
            System.out.println("COR: "+ this.cor);
            System.out.println("VELOCIDADE: "+ this.velocidade);
            System.out.println("VELOCIDADE PERCORRIDA: "+ this.percorrida);

        }else if(this.velocidade>200){
            System.out.println("MODELO: "+ this.modelo);
            System.out.println("COR: "+ this.cor);
            System.out.println("BATEU");
            System.out.println("VELOCIDADE PERCORRIDA: "+ this.percorrida);

        }
    }

    public void ExibirInfo(){
        System.out.println("MODELO: "+ this.modelo);
        System.out.println("COR: "+ this.cor);
        System.out.println("VELOCIDADE: "+ this.velocidade);
        System.out.println("VELOCIDADE PERCORRIDA: "+ this.percorrida);

    }

    


    
}
