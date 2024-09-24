public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(getRaio(), 2);

        System.out.printf("Área do círculo = %.2f", area, "\n");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * getRaio();

        System.out.printf("Perímetro do círculo = %.2f", perimetro, "\n");
    }

}
