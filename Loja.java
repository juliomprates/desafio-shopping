public class Loja {
    private String nome;
    private int qtdDeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;

    public Loja (String _nome, int _qtdDeFuncionario, double _salarioBaseFuncionario, 
                 Endereco _endereco, Data _dataDeFundacao){
        this.nome = _nome;
        this.qtdDeFuncionarios = _qtdDeFuncionario;
        this.salarioBaseFuncionario = _salarioBaseFuncionario;
        this.endereco = _endereco;
        this.dataDeFundacao = _dataDeFundacao;
    }

    public Loja (String _nome, int _qtdDeFuncionario, Endereco _endereco, Data _dataDeFundacao){
        this.nome = _nome;
        this.qtdDeFuncionarios = _qtdDeFuncionario;
        this.salarioBaseFuncionario = -1;
        this.endereco = _endereco;
        this.dataDeFundacao = _dataDeFundacao;
    }

    // getters
    public String getNome(){
        return nome;
    }
    
    public int getQtdDeFuncionarios(){
        return qtdDeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }

    public Data getDataDeFundacao(){
        return dataDeFundacao;
    }

    // setters
    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public void setQtdDeFuncionarios(int _qtdDeFuncionarios) {
        this.qtdDeFuncionarios = _qtdDeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double _salarioBaseFuncionario) {
        this.salarioBaseFuncionario = _salarioBaseFuncionario;
    }

    public void setEndereco(Endereco _endereco){
        this.endereco = _endereco;
    }

    public void setDataDeFundacao(Data _dataDeFundacao){
        this.dataDeFundacao = _dataDeFundacao;
    }

    // formatação legível dos atributos da classe
    public String toString (){
        return "Loja { nome: "+nome+", Quantidade de Funcionários: "+qtdDeFuncionarios+
                ", Salário Base dos Funcionários: "+salarioBaseFuncionario+",\n"+
                endereco.toString()+",\nData de Fundação: "+dataDeFundacao.formatada();
    }
    

    public double gastosComSalario() {
        if (salarioBaseFuncionario != -1) {
            return salarioBaseFuncionario * qtdDeFuncionarios;
        } else return -1;
    }

    public char tamanhoDaLoja() {
        if (qtdDeFuncionarios >= 31) {
            return 'G'; // Grande
        } else if (qtdDeFuncionarios >= 10 && qtdDeFuncionarios <= 30) {
            return 'M'; // Média
        } else return 'P'; //Pequena
    }

}
