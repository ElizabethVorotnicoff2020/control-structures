package ar.com.ada.online.second.projectname;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int valueNumberBySign;
        String result;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        valueNumberBySign = keyboard.nextInt();

        if (valueNumberBySign -1>=0  ){
            result = "Positivo";
        } else {result = "negativo";}

        System.out.println("Su numero es: " + result);
    }
}
