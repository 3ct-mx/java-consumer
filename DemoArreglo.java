import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class DemoArreglo{
    public static void main(String[] args){
        String[] nombres = {"Rocio", "Pedro", "Ana","Damian"};
        List<String> basesDeDatos = Arrays.asList("MySQL","Oracle","MongoDB","Oracle");
        Map<String, String> mapa = new HashMap<>();// Creo el mapa

        for (int i=0; i< nombres.length; i++){
            mapa.put(nombres[i],basesDeDatos.get(i));
        }

        String llave = "Damian";
        if (mapa.containsKey(llave)){
            System.out.println(mapa.get(llave));
        }
}