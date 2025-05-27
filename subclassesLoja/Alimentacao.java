package subclassesLoja;

import classesPrincipais.*;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,
                       Endereco endereco, Data dataDeFundacao, Data dataAlvara, int quantidadeMaxProdutos) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaxProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\nData do Alvará: "+dataAlvara;
    }
}
