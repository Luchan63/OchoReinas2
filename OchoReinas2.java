

public class OchoReinas2 {

    public static boolean esAtaque(int[] tablero)
    {
        boolean res = false;
        // descartamos reinas en la misma columnas
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 8; j++) { // utilizamos j = i+1 para asegurarnos que la reina no se verifique asi misma
                if (tablero[i] == tablero[j]) {
                    return true;
                }
            }
        }
        // descartamos reinas en la diagonales
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 8; j++) {
                if (tablero[i]+i == tablero[j]+j)
                {
                    return true;
                }
                if (tablero[i]-i == tablero[j]-j)
                {
                    return true;
                }
            }
        }
        return res;
    }
    public static void buscarSoluciones() {
        int contador = 0;
        // Usamos fuerza bruta para buscar las 8 posibles soluciones de la reina
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                for (int c = 0; c < 8; c++) {
                    for (int d = 0; d < 8; d++) {
                        for (int e = 0; e < 8; e++) {
                            for (int f = 0; f < 8; f++) {
                                for (int g = 0; g < 8; g++) {
                                    for (int h = 0; h < 8; h++) {
                                        int[] tablero = {a, b, c, d, e, f, g, h};
                                        if (!esAtaque(tablero)) {
                                            dibujar(tablero);
                                            contador++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Se han encontrado: " + contador + " soluciones");
    }

    private static void dibujar(int[] tablero) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i] == j) {
                    System.out.print("|*");
                } else {
                    System.out.print("|_");
                }
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        buscarSoluciones();
    }
}
