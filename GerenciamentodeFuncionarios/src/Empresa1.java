import java.util.ArrayList;

public class Empresa1 {

    ArrayList<FuncionarioAssalariado> empresa = new ArrayList<>();

    public void addFuncionario(FuncionarioAssalariado f) {
        empresa.add(f);
    }

    public void listaFuncionario() {
        for (FuncionarioAssalariado f : empresa) {
            System.out.println("\nFUNCIONARIOS ASSALARIADOS\n");
            f.exibirInformacoes();
            f.calcularPagamento();
        }
    }

}
