public class Produto {
    private String nome;
    private double preco;

    public Produto(String _nome, double _preco) {
        this.nome = _nome;
        this.preco = _preco;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    //setters
    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public void setPreco(double _preco) {
        this.preco = _preco;
    }

    public String toString(){
        return "Produto { Nome: "+nome+", Preço: "+preco+" }";
    }
    
}
