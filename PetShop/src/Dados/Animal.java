package Dados;

public class Animal {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
    public String toString() {
        String animal = "Nome: " + this.nome + "\nEspecie: " + this.especie + "\nDescricao: " + this.descricao + "\n";
        return animal;
    }

    private String nome, especie, descricao;
    private Dono dono;
}
