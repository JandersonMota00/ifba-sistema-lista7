package versao_refatorada.repository;

import versao_refatorada.model.Pet;
import java.util.ArrayList;
import java.util.List;

public class PetInMemoryRepository implements PetRepository {
    private List<Pet> pets = new ArrayList<>();

    @Override
    public void salvar(Pet pet) {
        pets.add(pet);
    }

    @Override
    public List<Pet> buscarTodos() {
        return new ArrayList<>(pets); // Retorna uma cópia para evitar modificações externas
    }
}