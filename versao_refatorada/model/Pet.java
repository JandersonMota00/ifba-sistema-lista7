package versao_refatorada.model;

public class Pet {
    private String nome;
    private String especie;
    private String raca;
    private int idade;

    public Pet(String nome, String especie, String raca, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Espécie: " + especie + ", Raça: " + raca + ", Idade: " + idade + " anos";
    }
}