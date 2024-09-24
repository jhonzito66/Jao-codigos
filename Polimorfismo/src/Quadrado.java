public class Quadrado extends Forma {

    public Quadrado(double altura, double base) {
        super(altura, base);
    }

    @Override
    public double calcularArea() {
        double area = getAltura() * getBase();

        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = getAltura() * getBase();

        return perimetro;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nQUADRADO");
        System.out.println("BASE : " + getBase());
        System.out.println("ALTURA : " + getAltura());
    }
}
