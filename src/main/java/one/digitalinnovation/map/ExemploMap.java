package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {
        // implementa a interface map, precisa de performance mas não ordenação
        // Key and value, necessário atribuir dois tipos para a instânciação desse Map
        // Trabalhar com objetos que nao conhece -> chave nome da coluna, value pode ser uma lista
        // faz select do bd, lê de um arquivo csv, popula um map onde a chave é a coluna e o segundo é uma lista
        Map<String, Integer> campeosMundialFifa = new HashMap<>();

        // Adiciona os campeões mundiais fifa no mapa.
        campeosMundialFifa.put("Brasil", 5);  // put tb serve para atualizar uma chave já existente, substituindo o chave para a mesma chave
        campeosMundialFifa.put("Alemanha", 4);
        campeosMundialFifa.put("Itália", 4);
        campeosMundialFifa.put("Uruguai", 2);
        campeosMundialFifa.put("Argentina", 2);
        campeosMundialFifa.put("França", 2);
        campeosMundialFifa.put("Inglaterra", 1);
        campeosMundialFifa.put("Espanha", 1);

        System.out.println(campeosMundialFifa);

        // Atualiza o valor para a chave Brasil
        campeosMundialFifa.put("Brasil", 6);

        System.out.println(campeosMundialFifa);

        // Retorna a Argentina
        System.out.println(campeosMundialFifa.get("Argentina"));  // trás o valor da chave

        // Retorna se existe ou não um campeão França                  // recebe um objeto e retorna um boolean
        System.out.println(campeosMundialFifa.containsKey("França")); // verifica se determinada chave existe

        // Remove o campeão França
        campeosMundialFifa.remove("França");



        // Retorna se existe ou não um campeão França
        System.out.println(campeosMundialFifa.containsKey("França"));// verifica somente o key ( 1º campo )

        // Retorna se existe ou não alguma seleçãop hexa campeã
        System.out.println(campeosMundialFifa.containsValue(6)); // verifica somente o value ( 2º campo )

        // Retorna o tamanho do mapa
        System.out.println(campeosMundialFifa.size());

        System.out.println(campeosMundialFifa);

        // Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeosMundialFifa.entrySet()){  // pede um entrySet
            System.out.println(entry.getKey()  + " -- " + entry.getValue());     // retorna um set do objeto entry e navega mostrando entre o getKey e getValue
        }

        // Navega nos registros do mapa
        for (String key : campeosMundialFifa.keySet()){ // retorna o set do tipo da String da chave
            System.out.println(key + " --> " + campeosMundialFifa.get(key));
        }

        System.out.println(campeosMundialFifa);

        // Verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeosMundialFifa.containsKey("Estados Unidos"));

        // Verifica se o mapa contem o valor 5
        System.out.println(campeosMundialFifa.containsKey(5));

        // Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeosMundialFifa.size());

        
        campeosMundialFifa.clear();

        System.out.println(campeosMundialFifa.size());

    }

}
