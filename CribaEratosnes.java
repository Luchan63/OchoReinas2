//ejercicio 7.27
import java.util.Arrays;

public class CribaEratosnes
{
    public static void main(String[] args) {
        boolean[] primos = new boolean[1000];
        inicialCriba(primos);
        ejecutarAlgoritmo(primos);
        mostrarAlgoritmo(primos);
    }
    // ponemos todos los elemento en true
    public static void inicialCriba(boolean[] primos)
    {
        Arrays.fill(primos,true);
    }

    // utilizamos el algoritmo de criba
    public static void ejecutarAlgoritmo(boolean[] primos)
    {
        for (int i = 2; i < Math.sqrt(primos.length); i++)
        {
            if (primos[i]){
                for (int j = i*i; j < primos.length; j+=i) {
                    primos[j] = false;

                }
            }
        }
    }

    // mostrar algoritmo
    public static void mostrarAlgoritmo(boolean[] primos)
    {
        System.out.println("Numero PRimos entre 2 y 999:");
        for (int i = 2; i < primos.length; i++) {
            if (primos[i]){
                System.out.print(i + " ");
            }
        }
    }
}
