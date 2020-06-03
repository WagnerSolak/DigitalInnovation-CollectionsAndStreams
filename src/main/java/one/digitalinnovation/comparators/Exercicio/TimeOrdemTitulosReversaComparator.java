package one.digitalinnovation.comparators.Exercicio;

import java.util.Comparator;

public class TimeOrdemTitulosReversaComparator implements Comparator<TimesFutebol> {

    @Override
    public int compare(TimesFutebol o1, TimesFutebol o2) {
        return o1.getTitulosMundiais() - o2.getTitulosMundiais();
    }
}
