package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio {
    public static void main(String[] args) {

        Set<Integer> inteiros = new HashSet<>();

        inteiros.add(3);
        inteiros.add(88);
        inteiros.add(20);
        inteiros.add(44);
        inteiros.add(3);

        System.out.println("Implementacao HashSet---------------------");

        System.out.println("Os elementos da lista inicial sao: " +inteiros);

        for (Integer num: inteiros){
            System.out.println("for:  " +num);        }

        System.out.println(inteiros.remove(3));

        System.out.println("Removido  primeiro item do Set:  " +inteiros);

        inteiros.add(23);
        System.out.println("Add novo numero no item do Set:  " +inteiros);

        System.out.println("Tamanho da lista eh:::::::::::>  " + inteiros.size());

        System.out.println("A lista esta vazia::::::::::::> " + inteiros.isEmpty());

        System.out.println("Os elementos da lista final sao: " +inteiros);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();


        LinkedHashSet<Integer> inteirosL = new LinkedHashSet<>();

        inteirosL.add(3);
        inteirosL.add(88);
        inteirosL.add(20);
        inteirosL.add(44);
        inteirosL.add(3);

        System.out.println("Implementacao LinkedHashSet----------------");

        System.out.println("Os elementos da lista inicial sao: " +inteirosL);

        for (Integer numH: inteirosL){
            System.out.println("for:  " +numH);        }

        System.out.println(inteirosL.remove(3));

        System.out.println("Removido  primeiro item do Set:  " +inteirosL);

        inteirosL.add(23);
        System.out.println("Add novo numero no item do Set:  " +inteirosL);

        System.out.println("Tamanho da lista eh:::::::::::>  " + inteirosL.size());

        System.out.println("A lista esta vazia::::::::::::> " + inteirosL.isEmpty());

        System.out.println("Os elementos da lista final sao: " +inteirosL);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();


        TreeSet<Integer> inteirosT = new TreeSet<>();

        inteirosT.add(3);
        inteirosT.add(88);
        inteirosT.add(20);
        inteirosT.add(44);
        inteirosT.add(3);

        System.out.println("Implementacao TreeSet----------------------");
        System.out.println("Os elementos da lista inicial sao: " +inteirosT);

        for (Integer numT: inteirosT){
            System.out.println("for:  " +numT);        }

        System.out.println(inteirosL.remove(3));

        System.out.println("Removido  primeiro item do Set:  " +inteirosT.pollFirst());

        inteirosT.add(23);
        System.out.println("Add novo numero no item do Set:  " +inteirosT);

        System.out.println("Tamanho da lista eh:::::::::::>  " + inteirosT.size());

        System.out.println("A lista esta vazia::::::::::::> " + inteirosT.isEmpty());

        System.out.println("Os elementos da lista final sao: " +inteirosT);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
     }

}
