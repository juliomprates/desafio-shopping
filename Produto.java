public class Produto {
    private String nome;
    private double preco;
    private Data validade;

    public Produto(String _nome, double _preco, Data _validade) {
        this.nome = _nome;
        this.preco = _preco;
        this.validade = _validade;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getValidade() {
        return validade;
    }

    //setters
    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public void setPreco(double _preco) {
        this.preco = _preco;
    }

    public void setValidade(Data _validade) {
        this.validade = _validade;
    }

    public String toString(){
        return "Produto { Nome: "+nome+", Preço: "+preco+", Validade: "+validade+" }";
    }
}
