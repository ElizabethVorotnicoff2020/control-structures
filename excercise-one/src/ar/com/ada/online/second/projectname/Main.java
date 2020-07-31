package ar.com.ada.online.second.projectname;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstValueA;
        int secondValueB;
        int result;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        firstValueA = keyboard.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        secondValueB = keyboard.nextInt();

        if (firstValueA > secondValueB) {
            result = firstValueA;
        } else {
            result = secondValueB;
        }

        System.out.println("El mayor valor es: " + result);
    }
}
