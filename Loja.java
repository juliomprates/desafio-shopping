public class Loja {
    String nome;
    int qtdDeFuncionarios;
    double salarioBaseFuncionario;

    public Loja (String _nome, int _qtdDeFuncionario, double _salarioBaseFuncionario) {
        this.nome = _nome;
        this.qtdDeFuncionarios = _qtdDeFuncionario;
        this.salarioBaseFuncionario = _salarioBaseFuncionario;
    }

    public Loja (String _nome, int _qtdDeFuncionario) {
        this.nome = _nome;
        this.qtdDeFuncionarios = _qtdDeFuncionario;
        this.salarioBaseFuncionario = -1;
    }

    

}
