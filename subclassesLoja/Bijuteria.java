package subclassesLoja;

import classesPrincipais.*;

public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,
                     Endereco endereco, Data dataDeFundacao, double metaVendas) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao);
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
