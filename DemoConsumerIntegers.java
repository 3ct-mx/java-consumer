import java.util.function.Consumer;
import java.util.*;
public class DemoConsumerIntegers{

    public static void main(String[] args) {
        // Que quiero
        List<Integer> numeros = Arrays.asList(8, 5, 9, 10);
        // Como lo consumira
        Consumer<Integer> imprimirNumeros = (numero) -> System.out.println(numero);
        // Consumimos los numeros

        numeros.forEach(imprimirNumeros);

        System.out.println("Termino de consumir Integers");
    }

}