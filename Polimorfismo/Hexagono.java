public class Hexagono extends Forma {
    public Hexagono(double altura, double base) {
        super(altura, base);

    }

    @Override
    public double calcularArea() {
        double area = Math.sqrt(getBase()) * (3 * Math.sqrt(3)) / 2;

        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = getBase() * 6;

        return perimetro;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nHEXÁGONO");
        System.out.println("BASE : " + getBase());
        System.out.println("ALTURA : " + getAltura());
    }
}
