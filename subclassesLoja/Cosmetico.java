package subclassesLoja;

import classesPrincipais.*;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,
                     Endereco endereco, Data dataDeFundacao, int quantidadeMaxProdutos) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaxProdutos);
        this.setTaxaComercializacao(-1);
    }

    public Cosmetico(String nome, int quantidadeFuncionario, Endereco endereco,
                     Data dataDeFundacao, int quantidadeMaxProdutos){
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao, quantidadeMaxProdutos);
        this.setSalarioBaseFuncionario(-1);
        this.setTaxaComercializacao(-1);
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString(){
        return super.toString() +
                "\nTaxa de Comercialização: R$"+taxaComercializacao;
    }
}
