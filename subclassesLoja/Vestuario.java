package subclassesLoja;

import classesPrincipais.*;

public class Vestuario extends Loja {
    private boolean produtosImportados = false;

    public Vestuario(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,
                     Endereco endereco, Data dataDeFundacao, boolean produtosImportados, int quantidadeMaxProdutos)
    {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaxProdutos);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionario, Endereco endereco,
                     Data dataDeFundacao, boolean produtosImportados, int quantidadeMaxProdutos)
    {
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao, quantidadeMaxProdutos);
        this.produtosImportados = produtosImportados;
    }

    public String temProdutosImportados() {
        return produtosImportados ? "Sim" : "Não";
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString(){
        return super.toString()+"\nVende produtos Importados? "+ temProdutosImportados();
    }
}
