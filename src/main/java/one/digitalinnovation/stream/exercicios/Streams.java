package one.digitalinnovation.stream.exercicios;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    private static List<Jogador> jogadores = null;

    public static void main(String[] args) {

        Jogador j1 = new Jogador("Boleiro Bruno", 29);
        Jogador j2 = new Jogador("Ronaldinho", 50);
        Jogador j3 = new Jogador("Pelé", 101);
        Jogador j4 = new Jogador("Duda", 21);
        Jogador j5 = new Jogador("Marcelinho", 12);

        jogadores = new Vector<>();

        jogadores.addAll(Arrays.asList(j1, j2, j3, j4));

        transformeString();

        System.out.println("A quantidade de elementos da lista eh:  " + contarElementos());

        System.out.println("Maiores de 18 anos:  " + contarMaioresDeDezoitoAnos());

        System.out.println("Jogadores com letra B:  " + contemLetra("b"));

        System.out.println("Jogadores com letra D:  " + contemLetra("d"));

        System.out.println("Jogador mais velho eh: " + maiorIdade());

        System.out.println("Jogador mais novo eh: " + menorIdade());

    }

    private static Optional<Jogador> maiorIdade(){
        return jogadores.stream().max(Comparator.comparingInt(Jogador::getIdade));
    }

    private static Optional<Jogador> menorIdade(){
        return jogadores.stream().min(Comparator.comparingInt(Jogador::getIdade));
    }

    private static List<Jogador> contemLetra(String letra){
        return jogadores.stream()
                .filter((jogador) -> jogador.getNome().toLowerCase().contains(letra))
                .collect(Collectors.toList());
    }

    private static List<Jogador> contarMaioresDeDezoitoAnos() {
        return jogadores.stream()
                .filter((jogador) -> jogador.getIdade() >= 18)
                .collect(Collectors.toList());
    }

    private static int contarElementos() {
        return (int) jogadores.stream().count();
    }

    private static void transformeString() {
        jogadores.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
