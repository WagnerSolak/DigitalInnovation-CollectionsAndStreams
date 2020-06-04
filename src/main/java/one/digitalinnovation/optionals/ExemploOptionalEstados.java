package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {
                                            //       (valor diferente de vazio)
        Optional<String> optionalString = Optional.of("Valor Presente");  // recebe o valor do tipo que está trabalhando

        // Código não permitido pois a implementação foi feita no java 9
        // ifPresentOrElse: recebe 2 args:
        // 1° ifPresent (System.out::println(executa se o vl está presente)) 2° OrElse (() -> System.out.println("não está presente"))
        System.out.println("Valor opcional que está presente");
        //optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        //optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));  //executa orElse pq foi passado null atraves do ofNullable

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        //emptyOptnional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lanca erro NullPointerException");
        //optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
    }
}
