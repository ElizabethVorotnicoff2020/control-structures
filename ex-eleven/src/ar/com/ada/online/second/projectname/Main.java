package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int numberOfYears;
	int bond;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de años trabajados: ");
        numberOfYears = keyboard.nextInt();

        if (numberOfYears ==1){
            System.out.println("Se le otorgara un bono de $100");
        } else if (numberOfYears ==2){
            System.out.println("se les otorgara un bono de 200");
        } else if (numberOfYears ==3){
            System.out.println("Se les otorgara un bono de 300");
        } else if (numberOfYears ==4){
            System.out.println("Se les otorgara un bono de 400");
        }else if (numberOfYears ==5){
            System.out.println("Se les otorgara un bono de 500");
        }else {
            System.out.println("Usted recibira 1000");
        }
    }
}
