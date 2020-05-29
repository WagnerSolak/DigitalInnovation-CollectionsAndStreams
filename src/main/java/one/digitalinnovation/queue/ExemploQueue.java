package one.digitalinnovation.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) throws Exception {
        // Aplicabilidade: lista de compras, transações bancárias, envio de e-mails
        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Pâmela");  //primeiro que entra é o primeiro que sai !!!
        filaDeBanco.add("Patrícia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Anderson");

        System.out.println(filaDeBanco);

        String clienteASerAtendido = filaDeBanco.poll(); //remove o primeiro da fila

        System.out.println(clienteASerAtendido);

        System.out.println(filaDeBanco);

        String primeiroCliente = filaDeBanco.peek(); //saber quem é o primeiro da fila, se for vazio return null
        System.out.println(primeiroCliente);
        System.out.println(filaDeBanco);

        //filaDeBanco.clear();
                                                                // element não remove o elemento, apenas retorna
        String primeiroClienteOuErro = filaDeBanco.element();  // não pode ter fila vazia para ter uma chamada,
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaDeBanco);
        // resultado esperado: NoSuchElementException pois havíamos limpado a fila anteriormente

        //navegando nos elementos
        for (String client: filaDeBanco){
            System.out.println(client);
        }

        Iterator<String> iterator = filaDeBanco.iterator();
        while (iterator.hasNext()){
            System.out.println("Método HasNext:  " +iterator.next());
        }

        System.out.println(filaDeBanco.size());

        System.out.println(!filaDeBanco.isEmpty());

        //Não tem sort no Queue!!!!!
    }
}
