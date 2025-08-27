package versao_refatorada.repository;

import versao_refatorada.model.Pet;
import java.util.List;

public interface PetRepository {
    void salvar(Pet pet);
    List<Pet> buscarTodos();
}