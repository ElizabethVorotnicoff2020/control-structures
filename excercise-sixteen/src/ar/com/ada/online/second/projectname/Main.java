package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int scoring;
        Double bond;
        final double MINIMALSALARY = 16875;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la puntuacion: ");
        scoring = keyboard.nextInt();
        if (scoring <= 100){
            bond = MINIMALSALARY;
        }else if (scoring >100 && scoring <150) {
            bond = 2 * MINIMALSALARY;
        } else {
            bond = 3 * MINIMALSALARY;
        }
        System.out.printf("el monto del bono que recibira es: $ %n " + bond);
    }
}
