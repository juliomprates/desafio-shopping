public class Data {
    private int dia, mes, ano;

    public Data(int _dia, int _mes, int _ano) {
       /* VALIDAÇÃO DOS PARÂMENTROS */
        
        // checa se o valor de _dia é valido
        // se não for, atribui uma data padrão
        boolean diaValido = false;
        if (_dia >= 1 && _dia <= 31) {
            diaValido = true;
        } else {
            /*Data Padrão */
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            System.err.println("Erro: A data inserida é inválida");
            return;
        }
        
        // checa se o valor de _mes é válido
        // se não for, atribui uma data padrão
        boolean mesValido = false;
        if (_mes >= 1 && _mes <= 12) {
            mesValido = true;
        } else {
            /*Data Padrão */
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            System.err.println("Erro: A data inserida é inválida");
            return;
        }

        // checa se o ano é bissexto
        boolean ehBissexto = false;
        if ((_ano % 4 == 0 && _ano % 100 != 0) || (_ano % 400 == 0)) {
            ehBissexto = true;
        } 

        // define que o dia 29 só pode ser atribuído ao mês 2 em anos bissextos
        if (diaValido && mesValido) {
            if(( _dia == 29) && (_mes == 2 && ehBissexto)){
                this.dia = _dia;
                this.mes = _mes;
                this.ano = _ano;
                return;
            }
        }

        // define que o mês 2 só pode receber até o dia 28 em anos não bissextos
        if (diaValido && mesValido) {
            if (_mes == 2) {
                if (_dia > 28) {
                    /* Data Padrão */
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
        if (diaValido && mesValido) {  // true true
            if (_dia == 31) { // true
                if ((_mes == 2) || (_mes == 4) || (_mes == 6) || (_mes == 9) || (_mes == 11)) { 
                    /* Data Padrão */
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                    System.err.println("Erro: A data inserida é inválida");
                    return;
                } else {
                    this.dia = _dia;
                    this.mes = _mes;
                    this.ano = _ano;
                }
            } else {
                this.dia = _dia;
                this.mes = _mes;
                this.ano = _ano;
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
    public void setDia(int _dia) {
        this.dia = _dia;
    }

    public void setMes(int _mes) {
        this.mes = _mes;
    }

    public void setAno(int _ano) {
        this.ano = _ano;
    }

    public String toString() {
        return "Data { Dia: "+dia+", Mês: "+mes+", Ano: "+ano+" }";
    }
}
