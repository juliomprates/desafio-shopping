package subclassesLoja;

import classesPrincipais.*;

public class Vestuario extends Loja {
    private boolean produtosImportados = false;

    public Vestuario(String _nome, int _qtdDeFuncionario, double _salarioBaseFuncionario,
                     Endereco _endereco, Data _dataDeFundacao, boolean produtosImportados)
    {
        super(_nome, _qtdDeFuncionario, _salarioBaseFuncionario, _endereco, _dataDeFundacao);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String _nome, int _qtdDeFuncionario, Endereco _endereco,
                     Data _dataDeFundacao, boolean produtosImportados)
    {
        super(_nome, _qtdDeFuncionario, _endereco, _dataDeFundacao);
        this.produtosImportados = produtosImportados;
    }

    public String isProdutosImportados() {
        if (produtosImportados == true) return "Sim";
        return "Não";
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString(){
        return super.toString()+"\nVende produtos Importados? "+isProdutosImportados();
    }
}
