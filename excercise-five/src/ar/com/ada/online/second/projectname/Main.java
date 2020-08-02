package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int primaryValue;
        int secondHighestValue;
        int thirdValue;
        int greaterValue;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        primaryValue = keyboard.nextInt();

        System.out.println("Ingrese el segundo nuemero: ");
        secondHighestValue = keyboard.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        thirdValue = keyboard.nextInt();

        if (primaryValue > secondHighestValue) {
            if (primaryValue > thirdValue) {
                System.out.println(primaryValue);
            } else {
                System.out.println(thirdValue);
            }
        } else {
            System.out.println(secondHighestValue);
        }
    }
}
