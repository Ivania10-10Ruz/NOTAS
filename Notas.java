/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notas;
import java.util.Scanner;
/**
 *
 * @author Graciela
 */
public class Notas {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del estudiante
        System.out.print("Introduce el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        // Solicitar la nota del estudiante
        System.out.print("Introduce la nota del estudiante: ");
        double nota = scanner.nextDouble();

        // Determinar si está Aprobado o Reprobado
        String resultado = (nota >= 70) ? "Aprobado" : "Reprobado";

        // Imprimir los resultados
        System.out.println("\nNombre del estudiante: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println(resultado);
    }
}
