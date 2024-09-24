public abstract class Forma {

    private double altura;
    private double base;

    public Forma(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract void exibirInfo();
}
