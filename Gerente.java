public non-sealed class Gerente extends Colaborador{
    
    public Gerente(String nome,
                    String cargo, 
                    int idade, 
                    String endereco, 
                    String codigo, 
                    double salario,
                    double comissao,
                    String login,
                    String senha) {
        super(nome, cargo, idade, endereco, codigo, salario);
        this.comissao = comissao;
        this.login = login;
        this.senha = senha;
    }

    protected String nome;

    protected String login;

    protected String senha;

    protected double comissao;

    public String getCodigo(){
        return "SL" + this.codigo;
    }


    public Gerente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double obterSalarioIntegral() {
       return this.salario + this.comissao;
    }

    
}
