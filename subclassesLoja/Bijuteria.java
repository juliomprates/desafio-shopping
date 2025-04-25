package subclassesLoja;

import classesPrincipais.*;

public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String _nome, int _qtdDeFuncionario, double _salarioBaseFuncionario,
                     Endereco _endereco, Data _dataDeFundacao, double metaVendas) {
        super(_nome, _qtdDeFuncionario, _salarioBaseFuncionario, _endereco, _dataDeFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString(){
        return super.toString()+"\nMeta de Vendas: R$"+getMetaVendas();
    }
}
