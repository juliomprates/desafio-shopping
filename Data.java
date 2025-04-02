public class Data {
    private int dia, mes, ano;

    public Data(int _dia, int _mes, int _ano) {
        this.dia = _dia;
        this.mes = _mes;
        this.ano = _ano;
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
