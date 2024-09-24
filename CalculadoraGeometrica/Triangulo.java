class Triangulo extends FormaGeometrica {
    private double angulo;
    private double altura;
    private double base;

    public Triangulo(double altura, double base, double angulo) {
        this.altura = altura;
        this.base = base;
        this.angulo = angulo;
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
    public void calcularArea() {
        double area = (getAltura() * getBase()) / 2;

        System.out.printf("\nArea do triângulo = %.2f", area, "\n");
    }

    @Override
    public void calcularPerimetro() {
        double aradian = Math.toRadians(getAngulo());
        double ladoadjascente = getBase() / Math.cos(aradian);
        double terceirolado = Math.sqrt(Math.pow(getBase(), 2) + Math.pow(ladoadjascente, 2) - 2 * getBase() * ladoadjascente * Math.cos(aradian));
        double perimetro = getBase() + ladoadjascente + terceirolado;

        System.out.printf("\nPerimetro do triangulo = %.2f", perimetro, "\n");
    }

    public void calcularAreaAngulo() {
        double aradian = Math.toRadians(getAngulo());
        double area = 0.5 * getBase() * getAltura() * Math.sin(aradian);

        System.out.printf("\nArea do triângulo usando seno do ângulo = %.2f", area, "\n");
    }

    public void calcularHipotenura() {
        double hipotenusa = Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));

        System.out.printf("\nHipotenusa do triângulo = %.2f", hipotenusa, "\n");
    }

}
