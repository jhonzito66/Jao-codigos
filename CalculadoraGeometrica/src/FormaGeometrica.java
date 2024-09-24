public abstract class FormaGeometrica {
    private double altura;
    private double base;


    public void exibirInfo() {
        System.out.println("\nAltura = " + this.altura);
        System.out.printf("\nBase = " + this.base);
    }


    public abstract void calcularArea();

    public abstract void calcularPerimetro();

}
