package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double scholarship;
	int age;
	double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        age = keyboard.nextInt();

        System.out.println("Ingrese su promedio");
        average = keyboard.nextDouble();

        if (age >=18){
            if (average >=9){
                scholarship = 2000;
                System.out.println("La beca es de: $ " + scholarship);
            } else if (average >=7.5){
                scholarship = 1000;
                System.out.println("La beca es de: $ " + scholarship);
            } else if (average<7.5 && average>=6){
                scholarship = 500;
                System.out.println("La beca es de: $ " + scholarship);
            } else {
                System.out.println("estudia vago");
            }
        } else if (age <=17){
            if (average >=9){
                scholarship = 3000;
                System.out.println("La beca es de: $ " + scholarship);
            }else if (average<9 && average>= 8){
                scholarship = 2000;
                System.out.println("La beca es de: $ " + scholarship);
            } else if (average<8 && average>=6){
                scholarship = 100;
                System.out.println("La beca es de: $ " + scholarship);
            }else {
                System.out.println("carta de invitacion a estudiar");
            }

        }
    }
}
