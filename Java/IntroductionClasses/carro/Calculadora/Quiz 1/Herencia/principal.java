
package Herencia;

import java.util.Scanner;

public class principal {
    private static String nombre;    
    private static String raza;
    private static String color;
    private static String tamaño;
    private static String Marcacroquetas;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE EL NOMBRE DEL PERRO: ");
        nombre=teclado.nextLine();
        System.out.println("DIGITE LA RAZA DEL PERRO: ");
        raza=teclado.nextLine();
        System.out.println("DIGITE EL COLOR DEL PERRO: ");
        color=teclado.nextLine();
        System.out.println("DIGITE EL TAMAÑO DEL PERRO: ");
        tamaño=teclado.nextLine();
        System.out.println("DIGITE LA MARCA DE CROQUETAS DEL PERRO: ");
        Marcacroquetas=teclado.nextLine();
        perro p = new perro(nombre,raza,color,tamaño,Marcacroquetas);
        p.imprimirDatos();
        p.imprimirMarcaCroquetas();
    }
}
