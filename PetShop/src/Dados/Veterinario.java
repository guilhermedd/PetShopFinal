package Dados;

public class Veterinario {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    public void setQuantidadeAnimais(int quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }
    public void setAnimals(Animal animals) {
        if (this.quantidadeAnimais < 30) {
            this.animals[quantidadeAnimais] = animals;
            this.quantidadeAnimais++;
        }
    }
    public Animal getAnimal(int i) {
        return this.animals[i];
    }
    public String toString() {
        String veterinario = "Nome: " + this.nome + "\nSalario: " + this.salario + "\n";
        if(this.endereco != null) {
            veterinario += "Endereco: " + this.endereco.toString();
        }
        return veterinario;
    }

    private String nome;
    private float salario;
    private Endereco endereco;
    private Animal[] animals = new Animal[30];
    private int quantidadeAnimais = 0;

}
