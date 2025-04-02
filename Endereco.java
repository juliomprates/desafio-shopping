public class Endereco {
    private String nomeDaRua, cidade, estado, pais, cep, numero, complemento;

    public Endereco(String _nomeDaRua, String _cidade, String _estado, String _pais, 
                    String _cep, String _numero, String _complemento) {

            this.nomeDaRua = _nomeDaRua;
            this.cidade = _cidade;
            this.estado = _estado;
            this.pais = _pais;
            this.cep = _cep;
            this.numero = _numero;
            this.complemento = _complemento;
        }
    
    // getters
    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getCep() {
        return cep;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    // setters
    public void setNomeDaRua(String _nomeDaRua) {
        this.nomeDaRua = _nomeDaRua;
    }

    public void setCidade(String _cidade) {
        this.cidade = _cidade;
    }

    public void setEstado(String _estado) {
        this.estado = _estado;
    }

    public void setPais(String _pais) {
        this.pais = _pais;
    }

    public void setCep(String _cep) {
        this.cep = _cep;
    }

    public void setNumero(String _numero) {
        this.numero = _numero;
    }

    public void setComplemento(String _complemento) {
        this.complemento = _complemento;
    }


}
