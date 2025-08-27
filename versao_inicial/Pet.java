package versao_inicial;

public class Pet {
    public String nome;
    public String especie;
    public String raca;
    public int idade;

    public Pet(String nome, String especie, String raca, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade + " anos");
    }
}