package subclassesLoja;

import classesPrincipais.*;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String _nome, int _quantidadeFuncionario, double _salarioBaseFuncionario,
                     Endereco _endereco, Data _dataDeFundacao) {
        super(_nome, _quantidadeFuncionario, _salarioBaseFuncionario, _endereco, _dataDeFundacao);
        this.setTaxaComercializacao(-1);
    }

    public Cosmetico(String _nome, int _quantidadeFuncionario, Endereco _endereco, Data _dataDeFundacao){
        super(_nome, _quantidadeFuncionario, _endereco, _dataDeFundacao);
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
        return super.toString()+"\nTaxa de Comercialização: R$"+this.getTaxaComercializacao();
    }
}
