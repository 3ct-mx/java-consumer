import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;

public class DemoConsumer {
    public static void main(String[] args) {

        List<String> galletas = Arrays.asList("Chocolate","Chispas");

        Consumer<String> consumer =    (String cadena) -> System.out.println("Comiendo galleta de " + cadena);

        galletas.forEach(consumer);

        System.out.println("Termino de comer");
    }
}