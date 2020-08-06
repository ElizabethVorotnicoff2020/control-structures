package ar.com.ada.online.second.projectname;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstName;
        String secondName;
        String thirdName;
        int firstAge;
        int secondAge;
        int thirdAge;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        firstName = keyboard.next();

        System.out.println("Ingrese su edad");
        firstAge = keyboard.nextInt();

        System.out.println("Ingrese su nombre");
        secondName = keyboard.next();

        System.out.println("Ingrese su edad");
        secondAge = keyboard.nextInt();

        System.out.println("Ingrese su nombre");
        thirdName = keyboard.next();

        System.out.println("Ingrese su edad");
        thirdAge = keyboard.nextInt();

        if (firstAge < secondAge && firstAge < thirdAge) {
            System.out.println("La persona de menor edad es: "  + firstName +  " de " + firstAge);
        } else if (secondAge < firstAge && secondAge < thirdAge) {
            System.out.println("La persona de menor edad es: "+ secondName +  " de " + secondAge);
        } else {
            System.out.println("La persona de menor edad es:  "+ thirdName +   " de " + thirdAge);
        }
    }
}
