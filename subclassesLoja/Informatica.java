package subclassesLoja;

import classesPrincipais.*;

public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String _nome, int _qtdDeFuncionario, double _salarioBaseFuncionario,
                       Endereco _endereco, Data _dataDeFundacao, double seguroEletronicos) {
        super(_nome, _qtdDeFuncionario, _salarioBaseFuncionario, _endereco, _dataDeFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString()+"\nValor do Seguro: R$"+getSeguroEletronicos();
    }
}
