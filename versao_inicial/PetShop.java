package versao_inicial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetShop {
    private List<Pet> pets;
    private Scanner scanner;

    public PetShop() {
        this.pets = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void menuPrincipal() {
        while (true) {
            System.out.println("\n--- Sistema de Pet Shop ---");
            System.out.println("1. Cadastrar novo Pet");
            System.out.println("2. Listar todos os Pets");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                cadastrarPet();
            } else if (opcao.equals("2")) {
                listarPets();
            } else if (opcao.equals("3")) {
                System.out.println("Saindo do sistema. Até mais!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    public void cadastrarPet() {
        System.out.println("\n--- Cadastro de Pet ---");
        System.out.print("Digite o nome do Pet: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a espécie do Pet: ");
        String especie = scanner.nextLine();

        System.out.print("Digite a raça do Pet: ");
        String raca = scanner.nextLine();

        System.out.print("Digite a idade do Pet: ");
        int idade;
        try {
            idade = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida. Cadastro cancelado.");
            return;
        }

        Pet novoPet = new Pet(nome, especie, raca, idade);
        this.pets.add(novoPet);
        System.out.println("Pet " + novoPet.nome + " cadastrado com sucesso!");
    }

    public void listarPets() {
        System.out.println("\n--- Lista de Pets Cadastrados ---");
        if (this.pets.isEmpty()) {
            System.out.println("Nenhum Pet cadastrado ainda.");
        } else {
            for (Pet pet : this.pets) {
                pet.exibirDetalhes();
                System.out.println("--------------------");
            }
        }
    }

    public static void main(String[] args) {
        PetShop petShop = new PetShop();
        petShop.menuPrincipal();
    }
}