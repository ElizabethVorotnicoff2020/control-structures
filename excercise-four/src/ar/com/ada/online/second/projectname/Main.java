package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("programa para determinar el precio de un articulo");
        double priceSuit;
        double discount;
        double endPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el precio de los trajes: ");
        priceSuit = keyboard.nextDouble();

        if (priceSuit >= 2500) {
            discount = priceSuit * 0.15;
        } else {
            discount = priceSuit * 0.08;
        }

        endPrice = priceSuit - discount;

        System.out.println("el precio final es de: " + endPrice);
        System.out.println("el precio con descuento es de: " + discount);
    }
}
