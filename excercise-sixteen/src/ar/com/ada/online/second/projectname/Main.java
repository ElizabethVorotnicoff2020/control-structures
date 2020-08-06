package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int scoring;
        double bond;
        double minimalSalary;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese su puntuacion: ");
        scoring = keyboard.nextInt();

        System.out.println("Ingrese el salario minimo: ");
        minimalSalary = keyboard.nextDouble();

        if (scoring <= 100) {
            bond = minimalSalary;
        } else if (scoring <= 150) {
            bond = 2 * minimalSalary;
        } else {
            bond = 3 * minimalSalary;
        }
        System.out.printf("El monto del bono que usted recibira es: $ %.0f", bond);
    }
}
