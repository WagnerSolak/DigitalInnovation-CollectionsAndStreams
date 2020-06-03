package one.digitalinnovation.comparators;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {

    // comparator usado para uma classe externa de dominio, recebe 2 parâmetros
    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
