package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double cost;
	double discount;
	double endPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el costo del articulo: ");
        cost = keyboard.nextDouble();

        if (cost >=200){
            discount = cost * 0.15;
        } else if (cost >=100 && cost<200) {
            discount = cost * 0.12;
        } else {
            discount = cost * 0.10;
        }
        endPrice = cost - discount;
        System.out.println("El precio final es: " + endPrice + " con un descuento de: $ " + discount);
    }
}
