package one.digitalinnovation.stream.exercicios;

public class Jogador {

    private String nome;
    private Integer idade;

    public Jogador(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
