package ar.com.ada.online.second.projectname;

import com.sun.org.apache.xpath.internal.objects.XString;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age;
        String vote;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        age = keyboard.nextInt();

        if (age >= 18) {
            vote = "puede votar";
        } else {
            vote = "no puede votar";
        }

        System.out.println("usted " + vote);
    }
}
