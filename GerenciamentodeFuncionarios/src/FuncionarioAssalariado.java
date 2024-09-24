public class FuncionarioAssalariado extends Funcionario {

    protected double bonusMensal;

    public FuncionarioAssalariado(String nome, String cpf, double salarioBase, double bonusMensal) {
        super(nome,cpf, salarioBase);
        this.bonusMensal = bonusMensal;
    }

    public double getBonusMensal() {
        return bonusMensal;
    }



    public void setBonusMensal(double bonusMensal) {
        this.bonusMensal = bonusMensal;
    }

    @Override
    public void calcularPagamento(){
        double total = getSalarioBase()+bonusMensal;
        System.out.printf("O salário de %s ficou: %.2f\n", getNome(), total);
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome : " + this.nome + "\nCpf : " + getCpf() + "\nBonus : " + this.bonusMensal + "\nSalario base : "+this.getSalarioBase());

    }
}
