package one.digitalinnovation.comparators.Exercicio;

import java.util.List;

public class TimesFutebol implements Comparable<TimesFutebol> {

    private final String nome;
    private final Integer titulosMundiais;

    public TimesFutebol(String nome, Integer titulosMundiais){
        this.nome = nome;
        this.titulosMundiais = titulosMundiais;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTitulosMundiais() {
        return titulosMundiais;
    }

    @Override
    public String toString() {
        return nome + " - " + titulosMundiais;
    }

    @Override
    public int compareTo(TimesFutebol o) {
        return this.getTitulosMundiais() - o.getTitulosMundiais();
    }
}
