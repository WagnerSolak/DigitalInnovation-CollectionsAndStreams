package one.digitalinnovation.optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {

    public static void main(String[] args) {

        System.out.println("***Valor inteiro opcioinal***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Valor decimal opcioinal***");
        OptionalDouble.of(55.).ifPresent(System.out::println);

        System.out.println("***Valor longo opcioinal***");
        OptionalLong.of(23L).ifPresent(System.out::println);




    }
}
