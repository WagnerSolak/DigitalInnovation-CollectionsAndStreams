package one.digitalinnovation.comparators.Exercicio;

import java.lang.reflect.Array;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorsTimesList {

    public static void main(String[] args) {

        List<TimesFutebol> times = new ArrayList<>();

        times.add(new TimesFutebol("Corinthians" , 2));
        times.add(new TimesFutebol("Palmeiras", 0));
        times.add(new TimesFutebol("São Paulo", 3));
        times.add(new TimesFutebol("Santos", 2));
        times.add(new TimesFutebol("Flamengo", 2));
        times.add(new TimesFutebol("Grêmio", 2));
        times.add(new TimesFutebol("Internacional", 2));

        System.out.println(times);

        // Ordenação usando a interface java.util.Comparator
        Collections.sort(times, new TimeOrdemTitulosReversaComparator());
        System.out.println(times);

        System.out.println(times);
        Collections.sort(times);

        System.out.println(times);
        times.sort((first, second) -> second.getTitulosMundiais() - first.getTitulosMundiais());
    }
}
