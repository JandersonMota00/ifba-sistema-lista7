package versao_refatorada.ui;

import versao_refatorada.model.Pet;
import versao_refatorada.service.PetService;
import java.util.Scanner;

public class ConsoleUI {
    private final PetService petService;
    private final Scanner scanner;

    public ConsoleUI(PetService petService) {
        this.petService = petService;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            exibirMenu();
            String opcao = scanner.nextLine();
            
            switch (opcao) {
                case "1":
                    cadastrarPetUI();
                    break;
                case "2":
                    listarPetsUI();
                    break;
                case "3":
                    System.out.println("Saindo do sistema. Até mais!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void exibirMenu() {
        System.out.println("\n--- Sistema de Pet Shop Refatorado ---");
        System.out.println("1. Cadastrar novo Pet");
        System.out.println("2. Listar todos os Pets");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void cadastrarPetUI() {
        System.out.println("\n--- Cadastro de Pet ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Espécie: ");
        String especie = scanner.nextLine();

        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = lerIdade();
        if (idade == -1) {
            System.out.println("Idade inválida. Cadastro cancelado.");
            return;
        }

        petService.cadastrarPet(nome, especie, raca, idade);
        System.out.println("Pet cadastrado com sucesso!");
    }

    // Método extraído para reutilização e clareza
    private int lerIdade() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void listarPetsUI() {
        System.out.println("\n--- Lista de Pets Cadastrados ---");
        var pets = petService.listarPets();
        if (pets.isEmpty()) {
            System.out.println("Nenhum Pet cadastrado ainda.");
        } else {
            pets.forEach(pet -> System.out.println(pet.toString()));
        }
    }
}