/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author jdmen
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int OPCION;
        float A, B, RESULTADO;

        System.out.println("**CALCULADORA**");
        System.out.println("OPCIONES: ");
        System.out.println("1) SUMAR ");
        System.out.println("2) RESTAR ");
        System.out.println("3) MULTIPLICAR ");
        System.out.println("4) DIVISION ");

        System.out.print("DIGITE UNA OPCION: ");
        OPCION = scanner.nextInt();

        switch (OPCION) {
            case 1:
                System.out.print("DIGITA UN NUMERO #1: ");
                A = scanner.nextFloat();
                System.out.print("DIGITA UN NUMERO #2: ");
                B = scanner.nextFloat();
                RESULTADO = A + B;
                System.out.println("EL RESULTADO DE TU SUMA ES: " + RESULTADO);
                break;
            case 2:
                System.out.print("DIGITA UN NUMERO #1: ");
                A = scanner.nextFloat();
                System.out.print("DIGITA UN NUMERO #2: ");
                B = scanner.nextFloat();
                RESULTADO = A - B;
                System.out.println("EL RESULTADO DE TU RESTA ES: " + RESULTADO);
                break;
            case 3:
                System.out.print("DIGITA UN NUMERO #1: ");
                A = scanner.nextFloat();
                System.out.print("DIGITA UN NUMERO #2: ");
                B = scanner.nextFloat();
                RESULTADO = A * B;
                System.out.println("EL RESULTADO DE TU MULTIPLICACION ES: " + RESULTADO);
                break;
            case 4:
                System.out.print("DIGITA UN NUMERO #1: ");
                A = scanner.nextFloat();
                System.out.print("DIGITA UN NUMERO #2: ");
                B = scanner.nextFloat();
                RESULTADO = A / B;
                System.out.println("EL RESULTADO DE TU DIVISION ES: " + RESULTADO);
                break;

            default:
                System.out.println("NO EXISTE ESA OPCION LO SIENTO");
                break;
        }

        scanner.close();
    }
    
}
