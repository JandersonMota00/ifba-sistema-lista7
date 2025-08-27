package versao_refatorada.service;

import versao_refatorada.model.Pet;
import versao_refatorada.repository.PetRepository;
import java.util.List;

public class PetService {
    private final PetRepository petRepository;

    // Injeção de Dependência via Construtor (IoC)
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public void cadastrarPet(String nome, String especie, String raca, int idade) {
        Pet novoPet = new Pet(nome, especie, raca, idade);
        petRepository.salvar(novoPet);
    }

    public List<Pet> listarPets() {
        return petRepository.buscarTodos();
    }
}