package subclassesLoja;

import classesPrincipais.*;

public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,
                       Endereco endereco, Data dataDeFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao);
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
