package classesPrincipais;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
       /* VALIDAÇÃO DOS PARÂMENTROS */
        
        // checa se o valor de dia é valido
        // se não for, atribui uma data padrão
        boolean diaValido = false;
        if (dia >= 1 && dia <= 31) {
            diaValido = true;
        } else {
            /* Data Padrão */
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            System.err.println("Erro: A data inserida é inválida");
            return;
        }
        
        // checa se o valor de mes é válido
        // se não for, atribui uma data padrão
        boolean mesValido = false;
        if (mes >= 1 && mes <= 12) {
            mesValido = true;
        } else {
            /* Data Padrão */
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            System.err.println("Erro: A data inserida é inválida");
            return;
        }

        // checa se o ano é bissexto
        boolean ehBissexto = false;
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            ehBissexto = true;
        } 

        // define que o dia 29 só pode ser atribuído ao mês 2 em anos bissextos
        if (diaValido && mesValido) {
            if(( dia == 29) && (mes == 2 && ehBissexto)){
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
                return;
            }
        }

        // define que o mês 2 só pode receber até o dia 28 em anos não bissextos
        if (diaValido && mesValido) {
            if (mes == 2) {
                if (dia > 28) {
                    /*  Data Padrão */
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                    System.err.println("Erro: A data inserida é inválida");
                    return;
                }
            }
        }

        // verifica se o mês pode receber o dia 31
        // se não puder, atribui uma data padrão
        if (diaValido && mesValido) {
            if (dia == 31) { // true
                if ((mes == 2) || (mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
                    /*  Data Padrão */
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                    System.err.println("Erro: A data inserida é inválida");
                    return;
                } else {
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }
            } else {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }

        }

    }

    // getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        if((dia < 10) && (mes < 10)){
            return "0"+dia+"/0"+mes+"/"+ano;
        } else if (dia < 10) {
            return "0"+dia+"/"+mes+"/"+ano;
        } else if (mes < 10) {
            return dia+"/0"+mes+"/"+ano;
        } else {
            return dia+"/"+mes+"/"+ano;
        }
    }

    public boolean verificaAnoBissexto(){
        return ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0));
    }
}
