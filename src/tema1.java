import java.util.Arrays;
import java.util.Scanner;

public class tema1 {
    final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio1();
        //Declaramos nuestro array 2D

        //Forma 1 de declarar una variable array 2D
//        String [][] autos = {
//                {"Nissan", "Toyota", "Subaru"},
//                {"Audi", "BMW", "Challenger"},
//                {"Lambo", "Camaro", "Ferrari"}
//        };

        //Forma 2 de declarar una variable array 2D
        String [][] autos = new String[3][3]; //El primer corchete son filas y el segundo son columnas
        autos[0][0] = "Nissan";
        autos[0][1] = "Toyota";
        autos[0][2] = "Subaru";
        autos[1][0] = "Audi";
        autos[1][1] = "BMW";
        autos[1][2] = "Challenger";
        autos[2][0] = "Lambo";
        autos[2][1] = "Camaro";
        autos[2][2] = "Ferrari";

        for (int filas = 0; filas < autos.length; filas++) {
            System.out.println();
            for (int columna = 0; columna < autos[filas].length; columna++) {
                System.out.println(autos[filas][columna] + "");
            }
        }
    }

    public static void ejercicio1() {
        System.out.println("Introduce el numero de filas de tu array: ");
        int filas = TECLADO.nextInt();
        System.out.println("Introduce el numero de columnas de tu array: ");
        int columnas = TECLADO.nextInt();

        int vector [][] = new int [filas][columnas];
        int sumar = 2;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j % 2 == 0) {
                    vector[i][j] = 0;
                } else {
                    vector[i][j] = sumar;
                    sumar += 2;
                }
            }
        }
        System.out.println("Mostrando array:");
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.print(vector[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
    }
}
}
