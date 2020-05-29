package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {
                                                                // mantem a ordem de inserção, porém menos performático
        Set<Integer> sequenciaNumerica = new LinkedHashSet<>();  //manter a ordem de inserção, mais lenta! em rel. ao HashSet

        // Adiciona os números no set
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);



        System.out.println(sequenciaNumerica);

        // Remove o número do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        // Retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        // Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println("Iterator:  " +iterator.next());
        }

        for (Integer numero: sequenciaNumerica){
            System.out.println("For:  "+numero);
        }

        // Retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
