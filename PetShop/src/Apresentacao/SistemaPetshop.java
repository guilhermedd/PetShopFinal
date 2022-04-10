package Apresentacao;
import java.util.Scanner;

import Dados.*;
import Dados.Endereco;

public class SistemaPetshop {
    private static Veterinario[] veterinarios = new Veterinario[50];
    private static int numeroVeterinarios = 0;
    private static Scanner scan = new Scanner(System.in);
    public static void imprimeMenu() {
        System.out.println("Escolha uma opcao:");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar Veterinario");
        System.out.println("2 - Exibir Veterinario");
        System.out.println("3 - Cadastrar Endereco do Veterinario");
        System.out.println("4 - Cadastrar Animal");
        System.out.println("5 - Exibir Animais");
        System.out.println("6 - Cadastrar Dono");
    }
    public static void cadastrarVeterinaio() {
        if(numeroVeterinarios < 50) {
            Veterinario vet = new Veterinario();
            System.out.println("Digite o nome do veterinario:");
            String nome = scan.nextLine();
            nome = scan.nextLine();
            vet.setNome(nome);
            System.out.println("Digite o salario do veterinario:");
            float salario = scan.nextFloat();
            vet.setSalario(salario);
            veterinarios[numeroVeterinarios] = vet;
            numeroVeterinarios++;
        }
    }
    public static void mostrarVeterinarios() {
        for(int i = 0; i < numeroVeterinarios; i++) {
            System.out.println("Codigo do veterinario: " + i);
            System.out.println(veterinarios[i].toString());
            System.out.println("\n");
        }
    }
    public static Veterinario escolherVeterinario() {
        System.out.println("Escolha um Veterinario para cadastrar o animal");
        mostrarVeterinarios();
        int escolha = scan.nextInt();
        if(escolha > numeroVeterinarios) {
            System.out.println("Escolha um Veterinario valido");
            return null;
        } else {
            return veterinarios[escolha];
        }
    }
    public static Endereco cadastrarEndereco() {
        Endereco vet = new Endereco();
        int num;
        String endereco = scan.nextLine();
        System.out.println("Qual o nome da rua?");
        endereco = scan.nextLine();
        vet.setRua(endereco);
        System.out.println("Qual o nome do bairro?");
        endereco = scan.nextLine();
        vet.setBairro(endereco);
        System.out.println("Qual o nome da cidade?");
        endereco = scan.nextLine();
        vet.setCidade(endereco);
        System.out.println("Qual o numero da residencia?");
        num = scan.nextInt();
        vet.setNumero(num);
        System.out.println("Qual o numero do CEP?");
        num = scan.nextInt();
        vet.setCep(num);
        return vet;
    }
    public static void cadastrarEnderecoVeterinario() {
        Veterinario vet = escolherVeterinario();
        if(vet != null) {
            vet.setEndereco(cadastrarEndereco());
        }
    }
    public static void mostrarAnimais() {
        Veterinario vet = escolherVeterinario();
        if(vet != null) {
            for (int i = 0; i < vet.getQuantidadeAnimais(); i++) {
                System.out.println("Codigo do animal: " + i);
                System.out.println(vet.getAnimal(i).toString());
            }
        }
    }
    public static Animal escolherAnimais() {
        Veterinario vet = escolherVeterinario();

        if(vet != null) {
            for (int i = 0; i < vet.getQuantidadeAnimais(); i++) {
                System.out.println("Animal atendido " + i);
                System.out.println(vet.getAnimal(i).toString());
            }
            int escolha = scan.nextInt();
            if (escolha > vet.getQuantidadeAnimais()) {
                System.out.println("Animal invalido");
                return null;
            } else {
                return vet.getAnimal(escolha);
            }
        }
        return null;
    }
    public static Animal cadastrarAnimal() {
        Animal animal = new Animal();
        mostrarVeterinarios();
        System.out.println("O animal vai ser atendido por qual veterinario?");
        int escolha = scan.nextInt();
        System.out.println("Digite o nome do animal");
        String str = scan.nextLine();
        str = scan.nextLine();
        animal.setNome(str);
        System.out.println("Digite a especie do animal");
        str = scan.nextLine();
        animal.setEspecie(str);
        System.out.println("Digite a descricao do animal");
        str = scan.nextLine();
        animal.setDescricao(str);
        veterinarios[escolha].setAnimals(animal);
        return animal;
    }
    public static Dono cadastrarDono() {
        Dono dono = new Dono();
        System.out.println("Digite o nome do dono");
        String str = scan.nextLine();
        str = scan.nextLine();
        dono.setNome(str);
        System.out.println("Digite o CPF do dono");
        int cpf = scan.nextInt();
        dono.setCpf(cpf);
        return dono;
    }
    public static void cadastrarDonoAnimal() {
        Animal animal = escolherAnimais();
        if (animal != null) {
            animal.setDono(cadastrarDono());
        }
    }
    public static void main(String[] args) {
        int opcao = -1;
        while(opcao != 0) {
            imprimeMenu();
            opcao = scan.nextInt();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    cadastrarVeterinaio();
                    break;
                case 2:
                    mostrarVeterinarios();
                    break;
                case 3:
                    cadastrarEnderecoVeterinario();
                    break;
                case 4:
                    cadastrarAnimal();
                    break;
                case 5:
                    mostrarAnimais();
                    break;
                case 6:
                    cadastrarDonoAnimal();
                    break;
                default :
                    System.out.println("Escolha uma opcao valida");
                    break;

            }
        }
    }
}
