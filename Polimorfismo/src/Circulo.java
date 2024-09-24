public class Circulo extends Forma {
    private double raio;

    public Circulo(double altura, double base, double raio) {
        super(0, 0);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(getRaio(), 2);

        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * getRaio();

        return perimetro;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nCÍRCULO");
        System.out.println("RAIO : " + getRaio());
    }
}
