public class Retangulo extends Forma {
    public Retangulo(double altura, double base) {
        super(altura, base);

    }

    @Override
    public double calcularArea() {
        double area = getAltura() * getBase();

        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * (getBase() + getAltura());

        return perimetro;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nRETÂNGULO");
        System.out.println("BASE : " + getBase());
        System.out.println("ALTURA : " + getAltura());
    }
}
