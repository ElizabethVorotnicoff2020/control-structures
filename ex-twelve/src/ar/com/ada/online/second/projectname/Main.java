package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double salary = 0;
	double costPerHour;
	int hoursWorked;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de hs trabajadas: ");
        hoursWorked = keyboard.nextInt();

        System.out.print("Ingrese el costo por hora: ");
        costPerHour = keyboard.nextDouble();

        if (hoursWorked >=50){
            System.out.println("No esta permitido trabajar");
        } else if (hoursWorked <50 && hoursWorked >46){
            salary = (costPerHour * hoursWorked) *3;
        } else if (hoursWorked <46 && hoursWorked >40){
            salary = (costPerHour * hoursWorked) *2;
        } else {
            salary = costPerHour * hoursWorked;
        }
        System.out.println("el salario es: $ " + salary);
    }
}
