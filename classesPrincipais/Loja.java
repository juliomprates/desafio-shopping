package classesPrincipais;

public class Loja {
    private String nome;
    private int quantidadeFuncionario;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;
    private Produto[] estoqueProdutos;

    public Loja (String nome, int quantidadeFuncionario, double salarioBaseFuncionario,
                 Endereco endereco, Data dataDeFundacao, int quantidadeMaxProdutos){
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaxProdutos];
    }

    public Loja (String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao, int quantidadeMaxProdutos){
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaxProdutos];
    }

    // getters
    public String getNome(){
        return nome;
    }
    
    public int getQuantidadeFuncionario(){
        return quantidadeFuncionario;
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

    public Produto[] getEstoqueProdutos() { return estoqueProdutos; }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setDataDeFundacao(Data dataDeFundacao){
        this.dataDeFundacao = dataDeFundacao;
    }

    // formatação legível dos atributos da classe
    public String toString (){
        return "\nNome: "+nome+"\nQuantidade de Funcionários: "+ quantidadeFuncionario +
                "\nSalário Base dos Funcionários: "+salarioBaseFuncionario+"\n"+
                endereco+"\nData de Fundação: "+dataDeFundacao;
    }
    

    public double gastosComSalario() {
        if (salarioBaseFuncionario != -1) {
            return salarioBaseFuncionario * quantidadeFuncionario;
        } else return -1;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionario >= 31) {
            return 'G'; // Grande
        } else if (quantidadeFuncionario >= 10 && quantidadeFuncionario <= 30) {
            return 'M'; // Média
        } else return 'P'; //Pequena
    }

}
