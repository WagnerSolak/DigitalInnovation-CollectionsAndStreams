package one.digitalinnovation.set;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        // TreeSet é performático para leitura, e mais lento para modificação pois tem a necessidade de reordenar após cada alteração.
        TreeSet<String> treeCapitais = new TreeSet<>(); // muito performatico para leitura, porém não para ordenação

        // Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a pultima capital no final da árvore
        System.out.println(treeCapitais.last());

        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        // Retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        // Retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        // Navega em todos ois itens do iterator
        Iterator<String> capitais = treeCapitais.iterator();
        while(capitais.hasNext()){
            System.out.println("while:  " +capitais.next());
        }

        for (String capital: treeCapitais){
            System.out.println("for:  " +capital);
        }
    }
}
