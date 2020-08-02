package ar.com.ada.online.second.projectname;

import com.sun.corba.se.impl.ior.StubIORImpl;
import sun.security.mscapi.CKeyPairGenerator;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pricePerKilo;
        double totalprofit = 0;
        int type, size;
        double kilogramsOfGrapes;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el precio por kilo: ");
        pricePerKilo = keyboard.nextDouble();

        System.out.println("Ingrese el tipo de uva: ");
        System.out.println("[1] A [2] B: ");
        type = keyboard.nextInt();


        System.out.println("Ingrese el tamaño de uva: ");
        System.out.println("[1] 1 [2] 2: ");
        size = keyboard.nextInt();


        System.out.println("Ingrese los kilos de uva: ");
        kilogramsOfGrapes = keyboard.nextDouble();

        if (type == 1)
        {
            if (size == 1)
            {
                pricePerKilo = pricePerKilo + 20;
            } else{
            pricePerKilo = pricePerKilo + 30;
        }
        } else{
            if (type == 2)
            {
                if (size == 1)
                {
                    pricePerKilo = pricePerKilo - 30;
                } else{
                pricePerKilo = pricePerKilo - 50;
            }
            }
        }
        totalprofit = pricePerKilo * kilogramsOfGrapes;

        System.out.println("La ganancia es de: " + totalprofit);
        
    }
}
