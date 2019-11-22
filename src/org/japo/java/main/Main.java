/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Variables
        double userValue;
        int exit = 0;

        //Bucle principal
        while (exit != 1) {
            //Bloque principal
            try {
                //Pedimos el dato al usuario
                System.out.print("Por favor, inserte una nota aprobada ...: ");
                userValue = SCN.nextDouble();

                //Si el valor no está aprobado o está fuera de rango...:
                if (userValue < 5 || userValue > 10) {
                    System.out.printf("%nERROR: Rango no válido.%n%n");

                } /* Si es válido...: */ else {
                    //Le mostraremos el valor
                    System.out.printf(Locale.ENGLISH,
                            "Usted aprobó con un ...: %.2f%n",
                            userValue);

                    //Y saldremos del bucle
                    exit = 1;
                }
            } catch (Exception e) {
                //Si el valor no es un double, mostraremos el siguiente
                //mensaje por pantalla y se repetirá el bucle
                System.out.printf("%nERROR: Valor no válido.%n"
                        + "Recuerde que debe de usar un punto para los "
                        + "decimales, no una coma.%n%n");
            } finally {
                //Limpiamos el búfer
                SCN.nextLine();
            }
        }
    }
}
