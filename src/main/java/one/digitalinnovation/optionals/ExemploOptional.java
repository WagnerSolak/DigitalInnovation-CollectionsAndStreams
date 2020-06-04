package one.digitalinnovation.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalLong;

public class ExemploOptional {

    public static void main(String[] args) {
        /*
        Optional<String> optionalString = Optional.of(null);

        System.out.println(optionalString.isPresent()); // return true when state optional is present, false is state present is empty
        // Result.: true


        System.out.println(optionalString.isEmpty());  //  return true when state optional is empty, false is state present is present
        // Result.: false


        optionalString.ifPresent(System.out::println);
        // result.: Valor Opcional


        optionalString.ifPresentOrElse(System.out::println,
                () -> System.out.println("Valor não está presente"));
        // result.: Valor Opcional

        // Se present pegue o valor optional e atribua em uma variável
        if (optionalString.isPresent()){  //chamamos o is Present, se for true ele cai no get, pega o vl e retorna, se nulo exceção
            String valor = optionalString.get();                                                                //NoSuchElementException
            System.out.println(valor);
        }
        // result.: Valor Opcional


        // chama map e transforma  valor em outra coisa, caso present
        optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);
        // result.: Valor Opcional****

        // se optional present executa, ou senão lança a exceção

        System.out.println(optionalString.orElseThrow(IlegalStateException::new));
        // Result.: valor opcional



        // teste
       /*    Optional<String> optionalStringVazia = Optional.empty();
             optionalStringVazia.get();
        // resultado
             NoSuchElementException                                 */


    }
}
