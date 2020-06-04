package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        //Cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();  // Pensando em performance? use stream.

        // Adiciona  estudantes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());
        //retorna um long com a qtd de elementos da lista

        // Retorna o elemento com maior número de letras
        System.out.println("Maior numero de letras:  " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        // recebe um comparator(algoritmo de ordenção) e retorna

        // Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras:  " + estudantes.stream().min(Comparator.comparingInt(String::length)));
        // recebe um comparator(algoritmo de ordenção) e retorna

        // Retorna o elemento que têm a letra R no nome
        System.out.println("Com a letra R no nome:   " + estudantes.stream().filter((estudante) ->
        estudante.toLowerCase().contains("r")).collect(Collectors.toList()));  // toList() retorna list
        // retorna um novo stream, filter recebe lambda, regra que retorna true ou false

        // Retorna uma nova coleção, com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Retorna uma colecao com a quantodade de letras:  " + estudantes.stream().map(estudante ->
                estudante.toLowerCase().concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
        // map recebe um stream API, executa um algoritimo para cada elemento da coleção, transformando em alguma outra coisa e
        // retorna um novo stream com cada elementos nesta nova "coisa" que foi transformada.
        // .collect(Collectors.toList())); para retornar uma lista.

        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos:  " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os elementos:  " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        // peek() recebe uma função que não retorna nada, ele recebe e executa somente (Consumer rt void)
        // executa a função (System.out::println) para cada elemento da nossa coleção, retorna mesma coisa, diferente do map

        // Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os elementos novamente:");
        estudantes.stream().forEach(System.out::println);
        // recebe um Consumer, mas faz percorre cada elemento e só

        // Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Todos os elementos tem o (W) no nome?  " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));
        // recebe uma expressão que retorna boolean, executa a operação lambda para todos elementos, se todos retornarem true ele retorna true
        // se somente um elemento retornar false ele retorna false

        // Retorna true se algum os elementos possuem a letra a minúscula no nome
        System.out.println("Não têm nenhum elemento com (a) minusculo no nome?  " + estudantes.stream().anyMatch((elemento) ->
                elemento.contains("a")));
        // executa a mesma lógica booleana do allMatch porém ele tiver um elemento que é true, ele retornará true

        // Retorna true se nenhum elemento possue a letra (a) minúsculo no nome
        System.out.println("Nao tem nenhum elemento com (a) minuscula no nome: " + estudantes.stream().noneMatch((elemento) ->
                elemento.contains("a")));
        // SE retornar false para todos elementos (elemento) -> elemento.contains("a"), ele retorna true

        // Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da colecao:  ");
        estudantes.stream().findFirst().ifPresent(System.out::println);
        // retorna um optional,

        // Exemplo de operação encadeada, operação assíncrona, ocorre de forma concorrente, (1°peek) mostra, (1° map) faz operação e ja no 2° peek já mostra com a operação feita
        System.out.println("Operação encadeada:   ");
        System.out.println(estudantes.stream()
            .peek(System.out::println) // vai fazer o System.out.println, mostra nome. Retorna o msm stream de entrada
            .map(estudante ->         // vai concatenar o traço e contar quantos caracteres tem o elemento
                    estudante.concat(" - ").concat(String.valueOf(estudante.length())))
            .peek(System.out::println) // outro peek para mostrar os elementos transformados
//            .filter((estudante ->
//                    estudante.toLowerCase().contains("r")))  // filter para ver se tem r no nome
//        .collect(Collectors.toList()));   // colecionar por lista
//        .collect(Collectors.joining(", "))); // concatena o elemento com o caracter que estiver passo no parametro joining
//        .collect(Collectors.toSet()));            // set não fornece ordem garantida
        .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") +1))));  // agrupa pelo lenght
    }
}
