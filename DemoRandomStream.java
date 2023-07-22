import java.util.*;
import java.util.function.Predicate;

public class DemoRandomStream{
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        List<Integer> salida = new ArrayList<>();

        Random random = new Random();

        System.out.println("Todos los numeros");
        for (int i =0; i < 10 ;i++){
            numeros.add(random.nextInt(10) + 1);
        }
        System.out.println(numeros);
        System.out.println("Todos los aprobados");
        Predicate<Integer> aprobados = (numero) -> numero > 5;

        Predicate<Integer> apenas = (numero) -> numero > 5 && numero < 8;

        numeros.stream()
                .filter(aprobados)
                .sorted()
                .forEach(salida::add);



        System.out.println("Lista resultante");
        System.out.println(salida);

        numeros.stream()
                .filter(apenas)
                .sorted()
                .forEach(System.out::println);



        System.out.println("Fin de linea de ensamble");
    }
}