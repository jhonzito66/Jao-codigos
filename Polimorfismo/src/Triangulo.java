public class Triangulo extends Forma {
    private double angulo;

    public Triangulo(double altura, double base, double angulo) {
        super(altura, base);
        this.angulo = angulo;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    private static boolean verificarAnguloValido(double aradians) {
        return aradians > 0 && aradians < Math.PI;
    }

    @Override
    public double calcularArea() {
        double area = (getAltura() * getBase()) / 2;

        return area;
    }

    @Override
    public double calcularPerimetro() {
        double aradian = Math.toRadians(getAngulo());
        double ladoadjascente = getBase() / Math.cos(aradian);
        double terceirolado = Math.sqrt(Math.pow(getBase(), 2) + Math.pow(ladoadjascente, 2) - 2 * getBase() * ladoadjascente * Math.cos(aradian));
        double perimetro = getBase() + ladoadjascente + terceirolado;

        return perimetro;
    }

    public double calcularAreaAngulo() {
        double aradian = Math.toRadians(getAngulo());
        double area = 0.5 * getBase() * getAltura() * Math.sin(aradian);

        return area;
    }

    public double calcularHipotenura() {
        double hipotenusa = Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));

        return hipotenusa;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nTRIÂNGULO");
        System.out.println("BASE : " + getBase());
        System.out.println("ALTURA : " + getAltura());
        System.out.println("ANGULO : " + getAngulo() + "°");
    }
}


