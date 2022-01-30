/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            double calificacion;
            String nombre;

            int i = 1;
            while (i <= 4) {
                System.out.println("Ingrese calificación: \n");
                calificacion = entrada.nextDouble();
                if (calificacion > 10 || calificacion < 0) {
                    throw new Exception("La calificación no debe ser mayor a "
                            + "10 o menor a 0 ");
                }
                entrada.nextLine();
                System.out.println("Ingrese nombre: \n");
                nombre = entrada.nextLine();
                if (nombre.equals("Mario") || nombre.equals("Pedro")
                        || nombre.equals("Ana") || nombre.equals("Luis")
                        || nombre.equals("Carolina")) {
                    throw new Exception("No se puede ingresar nombres como:"
                            + " Mario, Pedro, Ana, Luis, Carolina ");
                }
                System.out.printf("Nombre: %s\n"
                        + "Calificación: %.1f\n",
                        nombre, calificacion);
                i = i + 1;
            }

            System.out.printf("%s\n", "Gracias por usar el sistema");
        } catch (InputMismatchException inputMismatchException) {

            System.out.printf("Existe un error de tipo %s\n",
                    inputMismatchException);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
    }
}
