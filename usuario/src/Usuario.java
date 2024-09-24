public class Usuario {
    private String nome;
    private String cpf;
    private int idade;

     public Usuario(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
     
    public void alterarNome(String novonome){
        setNome(novonome);
    }

    public void alterarIdade(int novaidade){
        setIdade(novaidade);
    }

    boolean verificarMaiordade(int idade){
            return idade>=18;
    }
    
    public void exibirInfo(int contador){
        System.out.println("\n"+contador+ "- Nome :"+ this.nome + " Idade: " + this.idade);
    }

    public void exibirCadastro(){
        System.out.println("\nNome: "+ this.nome);
        System.out.println("Cpf: "+ this.cpf);
        System.out.println("Idade: "+ this.idade);

    }
}
