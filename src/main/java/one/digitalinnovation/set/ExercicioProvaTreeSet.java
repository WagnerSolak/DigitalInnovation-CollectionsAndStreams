package one.digitalinnovation.set;

import java.util.TreeSet;

public class ExercicioProvaTreeSet {

    public static void main(String[] args) {

        TreeSet<String> cidades = new TreeSet<>();

        cidades.add("Porto Alegre");
        cidades.add("Florianópolis");
        cidades.add("Curtitiba");
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");

        System.out.println(cidades);
    }
}
