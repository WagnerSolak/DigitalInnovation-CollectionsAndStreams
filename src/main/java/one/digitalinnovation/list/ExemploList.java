package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        //List -> usada para buscar uma lista no bd, ou uma busca em um arquivo de texto
        //instanciar a lista para poder usar ela
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");  //método add item na lista
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);  // mostramos os elementos no console

        nomes.set(2, "Larissa");  // método de atualização, alterando a posicao 2 por Larissa

        System.out.println(nomes);



        Collections.sort(nomes); // reordenamos por ordem alfabética

        nomes.set(2, "Wesley"); // método de atualização, alterando a posição 2 para Wesley

        System.out.println(nomes);

        nomes.remove(4); // index -> remove de acordo com índice que for passado como parâmetro

        System.out.println(nomes);  // pode remover por índice ou por elemento !

        nomes.remove("Wesley"); //object -> remove o objeto

        System.out.println(nomes);

        String nome = nomes.get(3); // retorna para uma variável o elemento dado indice que a gnt quer passar.
                                    // se informar um índice não existente ocorre o erro: IndexOutOfBoundsException
        System.out.println(nome);

        int posicao = nomes.indexOf("Wesley"); // retorna o índice do nome passado como parâmetro
        System.out.println("O indice do Wesley eh:" +posicao); // quando não encotra ele retorna -1

        int tamanho = nomes.size(); // saber quantos elementos possui na lista
        System.out.println("A lista possui: " +tamanho);// retornamos o tamanho

        nomes.remove("Larissa");

        tamanho = nomes.size();
        System.out.println("A lista atualizada: "+tamanho);

        boolean temAnderson = nomes.contains("Anderson"); //retorna um boleano para citar se o elementos existe ou não na lista
        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando"); //retorna um boleano para citar se o elementos existe ou não na lista
        System.out.println(temFernando);

        boolean listaEstaVazia = nomes.isEmpty(); // retorna boleano true se a lista estiver vazia
        System.out.println("A lista esta vazia? " +listaEstaVazia);

        // navegar para percorrer a lista. For each é o for que Recebe 2 args, 1º declaração de 1 var 'nomeDoItem', 2º lista
        for(String nomeDoItem: nomes){

            System.out.println("Foreach percorreu o nome: " +nomeDoItem);
        }


        Iterator<String> iterator = nomes.iterator(); //retorna Iterator de String


        while(iterator.hasNext()) {                         //poderá ser navaegado através de um while
            System.out.println("-It->" +iterator.next());   // retorna boolean true enquanto for verdadeiro
        }                                                 //  hasNext() -> return boolean true or false while true
                                                         //   next()    -> retorna o objeto que está interando naquele momento


        nomes.clear(); //  limpa, remove todos elementos da lista

        listaEstaVazia = nomes.isEmpty();  // verificamos se a lista está vazia
        System.out.println("A lista esta vazia? " +listaEstaVazia);




    }
}
