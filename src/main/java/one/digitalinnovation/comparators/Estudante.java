package one.digitalinnovation.comparators;

public class Estudante implements Comparable<Estudante>{

    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + "-" + idade;
    }
                                          // recebe um argumento
    @Override                            // Padrão 1, -1, 0
    public int compareTo(Estudante o) {  // receb um objecto o prox. dentro de uma coleção e o objeto atual
        return this.getIdade() - o.getIdade();
    }
}
