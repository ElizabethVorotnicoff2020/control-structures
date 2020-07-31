package ar.com.ada.online.second.projectname;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pencilCount;
        double pencilPayment;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de lapices: ");
        pencilCount = keyboard.nextDouble();

        if (pencilCount >= 1000) {
            pencilPayment = 85;
        } else {
            pencilPayment = 90;
        }

        System.out.println("El precio a pagar por cada lapiz es de: $ " + pencilPayment);

    }
}
