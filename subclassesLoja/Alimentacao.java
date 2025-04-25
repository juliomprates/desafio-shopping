package subclassesLoja;

import classesPrincipais.*;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String _nome, int _qtdDeFuncionario, double _salarioBaseFuncionario,
                       Endereco _endereco, Data _dataDeFundacao, Data dataAlvara) {
        super(_nome, _qtdDeFuncionario, _salarioBaseFuncionario, _endereco, _dataDeFundacao);
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
        return super.toString()+"\nData do Alvará: "+getDataAlvara();
    }
}
