package classesPrincipais;

public class Produto {
    private String nome;
    private double preco;
    private Data validade;

    public Produto(String nome, double preco, Data validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
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
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    public String toString(){
        return "Nome: "+nome+"\nPreço: "+preco+"\nValidade: "+validade;
    }

    public boolean estaVencido(Data data){
        boolean anoEhIgual = data.getAno() == validade.getAno();
        boolean anoEhMenor = data.getAno() < validade.getAno();

        if (anoEhIgual) {
            if (data.getMes() > validade.getMes()) {
                return true;
            } else if ((data.getDia() > validade.getDia()) && (data.getMes() >= validade.getMes())){
                return true;
            } else return false;
        }

        // caso óbvio -> ano é menor que o ano de validade
        if (anoEhMenor) {
            return false;
        }

        // caso óbvio -> ano é maior que ano de validade
        return true;
    }
}
