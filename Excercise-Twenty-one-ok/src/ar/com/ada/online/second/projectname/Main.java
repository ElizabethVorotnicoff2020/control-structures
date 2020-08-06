package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double currentBalance =0;
        double minimumFee;
        double nonInterestBearingPayment;
        double previousBalance;
        double shopping;
        double previousPayment;
        double interests = 0;
        final double FINE = 200;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("ingrese el saldo anterior : ");
        previousBalance = keyboard.nextDouble();

        System.out.println("ingrese el monto de las compras que realizo : ");
        shopping = keyboard.nextDouble();

        System.out.println("ingrese el pago anterior : ");
        previousPayment = keyboard.nextDouble();

        currentBalance = previousBalance - previousPayment + shopping;

        minimumFee = currentBalance * 0.15;
        nonInterestBearingPayment = (currentBalance * 0.85) + interests + FINE;
        interests = previousBalance - previousPayment * 0.12;

        System.out.println("El pago minimo es de: $ " + minimumFee);
        System.out.println("El saldo actual es de: $" + currentBalance);
        System.out.println("El pago para no generar intereses es de $ " + nonInterestBearingPayment);

    }
}
