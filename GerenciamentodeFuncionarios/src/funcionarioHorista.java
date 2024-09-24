public class funcionarioHorista extends Funcionario {

    private double horasTrabalhadas;
    private double valorHora;

        public funcionarioHorista(String nome, String cpf, double salarioBase, double horasTrabalhadas, double valorHora){
            super(nome, cpf, 0);
            this.horasTrabalhadas = horasTrabalhadas;
            this.valorHora = valorHora;
        }



    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public void calcularPagamento(){
            double total = valorHora*horasTrabalhadas;
            System.out.printf("Salário de %s : %.2f\n", getNome(), total);
    }

    public void registrarHoras(double horas){
        setHorasTrabalhadas(horas);
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome : " + this.nome + "\nCpf : " + getCpf() + "\nHoras trabalhadas : " + this.horasTrabalhadas + "\nValor hora : "+this.valorHora);
    }
}
