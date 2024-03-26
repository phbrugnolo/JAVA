public class Endereco {
    private String rua, complemento, cep;

    public Endereco(String rua, String complemento, String cep) {
        this.rua = rua;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", complemento=" + complemento + ", cep=" + cep + "]";
    }

    
}
