package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String policyType;
        double basicRate;
        boolean answer;
        double charge;
        double finalInstalment;


        Scanner keyboard = new Scanner(System.in);

        System.out.println("ingrese el tipo de poliza, A, B: ");
        policyType = keyboard.next();

        switch (policyType) {
            case "A":
                basicRate = 1200;
                break;
            case "B":
                basicRate = 950;
                break;
            default:
                basicRate = 0;
                System.out.println("Destino invalido");
        }
        finalInstalment = basicRate;

            System.out.println("El costo de la poliza es: " + basicRate);

        System.out.println("¡Bebe alchol?");
        answer = keyboard.nextBoolean();

        if (answer){
            charge = basicRate * 0.10;
            finalInstalment = finalInstalment + charge;
        } else {
            finalInstalment = finalInstalment;
        }

        System.out.println("¡Usa lentes?");
        answer = keyboard.nextBoolean();

        if (answer){
            charge = basicRate * 0.05;
            finalInstalment = finalInstalment + charge;
        } else {
            finalInstalment = finalInstalment;
        }

        System.out.println("¡Padece enfermedades, como deficiencia cardiaca o diabetes?");
        answer = keyboard.nextBoolean();

        if (answer){
            charge = basicRate * 0.05;
            finalInstalment = finalInstalment + charge;
        } else {
            finalInstalment = finalInstalment;
        }
        System.out.println("¡Tiene mas de 40 años?");
        answer = keyboard.nextBoolean();

        if (answer){
            charge = basicRate * 0.20;
            finalInstalment = finalInstalment + charge;
        } else {
            charge = basicRate * 0.10;
            finalInstalment = finalInstalment + charge;
        }

        System.out.println("El costo de su seguro es $ " + finalInstalment);
    }
}
