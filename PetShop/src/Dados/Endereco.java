package Dados;

public class Endereco {
    public Endereco (){}
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    public String toString() {
        String endereco = "Rua: " + this.rua + "\n Bairro: " + this.bairro + "\nCidade: " + this.cidade + "\nCEP: " + this.cep;
        return endereco;
    }

    private String rua, bairro, cidade, estado;
    private int numero, cep;
}
