package ar.com.ada.online.second.projectname;

import com.sun.java.swing.plaf.motif.MotifTreeUI;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String holidayOne = "mexico";
        String holidayTwo = "acapulco";
        String holidayThree = "cancun";
        double km;
        double money;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el precio por km: ");
        km = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de dinero que tiene: ");
        money = keyboard.nextDouble();

        if (money >= (km * 1200 * 2)) {
            System.out.println(holidayThree);
        } else if (money >= (km * 800 * 2)) {
            System.out.println(holidayTwo);
        } else if (money >= (km * 750 * 2)) {
            System.out.println(holidayOne);
        } else {
            System.out.println("Quedate en casa");
        }
    }


}
