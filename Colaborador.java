public sealed abstract class Colaborador permits Gerente, Vendedor {

    protected String nome;

    protected String cargo;

    protected int idade;

    protected String endereco;

    protected String codigo;

    protected double salario;

    public Colaborador( String nome, String cargo, int idade, String endereco, String codigo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.endereco = endereco;
        this.codigo = codigo;
        this.salario = salario;
    }

    public Colaborador() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public abstract double obterSalarioIntegral();

     public double getValorVendido(double extra) {
        return this.obterSalarioIntegral() + extra;

    }
}