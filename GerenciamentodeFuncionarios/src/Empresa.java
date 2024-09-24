import java.util.ArrayList;

public class Empresa {

    ArrayList<funcionarioHorista> empresa = new ArrayList<>();

    public void addFuncionario(funcionarioHorista f){
        empresa.add(f);
    }

    public void listaFuncionario(){
        for(funcionarioHorista f : empresa){
            System.out.println("\nFUNCIONARIOS HORISTAS\n");
            f.exibirInformacoes();
            f.calcularPagamento();
        }
    }
}
