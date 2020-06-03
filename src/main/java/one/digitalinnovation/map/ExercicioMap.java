package one.digitalinnovation.map;

import org.apache.logging.log4j.message.StringFormattedMessage;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

    public static void main(String[] args) {
        Map<String, String> estadosBrasileiros = new HashMap<>(); {
            estadosBrasileiros.put("AC", "Acre");
            estadosBrasileiros.put("AL", "Alagoas");
            estadosBrasileiros.put("AP", "Amapá");
            estadosBrasileiros.put("AM", "Amazonas");
            estadosBrasileiros.put("BA", "Bahia");
            estadosBrasileiros.put("CE", "Ceará");
            estadosBrasileiros.put("ES", "Espírito Santo");
            estadosBrasileiros.put("GO", "Goiás");
            estadosBrasileiros.put("MA", "Maranhão");
            estadosBrasileiros.put("MT", "Mato Grosso");
            estadosBrasileiros.put("MS", "Mato Grosso do Sul");
            estadosBrasileiros.put("MG", "Minas Gerais");
            estadosBrasileiros.put("PA", "Pará");
            estadosBrasileiros.put("PB", "Paraíba");
            estadosBrasileiros.put("PR", "Paraná");
            estadosBrasileiros.put("PE", "Pernambuco");
            estadosBrasileiros.put("PI", "Piauí");
            estadosBrasileiros.put("RJ", "Rio de Janeiro");
            estadosBrasileiros.put("RN", "Rio Grande do Norte");
            estadosBrasileiros.put("RS", "Rio Grande do Sul");
            estadosBrasileiros.put("RO", "Rondônia");
            estadosBrasileiros.put("RR", "Roraima");
            estadosBrasileiros.put("SC", "Santa Catarina");
            estadosBrasileiros.put("SP", "São Paulo");
            estadosBrasileiros.put("SE", "Sergipe");
            estadosBrasileiros.put("TO", "Tocantins");

            System.out.println(estadosBrasileiros);

            estadosBrasileiros.remove("MG");

            System.out.println(estadosBrasileiros);

            estadosBrasileiros.put("DF", "Distrito Federal");

            System.out.println(estadosBrasileiros);

            System.out.println(estadosBrasileiros.size());

            estadosBrasileiros.remove("MS", "Mato Grosso do Sul");

            System.out.println(estadosBrasileiros);

            for (Map.Entry<String, String> entry : estadosBrasileiros.entrySet()){
                System.out.println(entry.getValue() + " ("+entry.getKey()+")");
            }

            System.out.println(estadosBrasileiros.containsKey("SC"));

            System.out.println(estadosBrasileiros.containsValue("Maranhão"));





        }
    }
}
