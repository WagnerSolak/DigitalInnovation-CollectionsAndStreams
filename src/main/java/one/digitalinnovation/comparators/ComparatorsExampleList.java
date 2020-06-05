package one.digitalinnovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparators e Comparables são interfaces auxiliares da API de Collections para trabalhar com ordenação de coleções.
public class ComparatorsExampleList {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        
        System.out.println("--- ordem de inserção---");
        System.out.println(estudantes);

        // uso de lambda para definir dentro do código um algorítmo de ordenção
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println(" --- ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println(" --- ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade)); // compartor em ordem de execução

        System.out.println(" --- ordem natural dos números - idade (method reference) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());  // reverte a ordem

        System.out.println(" --- ordem reversa dos números - idade (method reference) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes); // sort recebe list T extend Comparable, se tirar implement Comparable da classe Estudante
        // . ele dará erro: no instance(s) of type variable(s) T so that Estudante conforms to Comparable(? super T>

        System.out.println(" --- ordem natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator()); // não é obrigado a implementar a interface Comparable ou Comparator

        System.out.println(" --- ordem reversa dos números - idade (interface Comparator) ---");
        System.out.println(estudantes);




    }

}
