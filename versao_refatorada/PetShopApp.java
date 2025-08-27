package versao_refatorada;

import versao_refatorada.repository.PetInMemoryRepository;
import versao_refatorada.repository.PetRepository;
import versao_refatorada.service.PetService;
import versao_refatorada.ui.ConsoleUI;

public class PetShopApp {
    public static void main(String[] args) {

        PetRepository petRepository = new PetInMemoryRepository();
        PetService petService = new PetService(petRepository);
        ConsoleUI consoleUI = new ConsoleUI(petService);

        consoleUI.iniciar();
    }
}