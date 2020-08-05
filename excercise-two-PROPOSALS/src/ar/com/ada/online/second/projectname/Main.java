package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double numberOfHoursWorked;
	double hourlyWage;
	double totalPay;
	double finalSalary;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de hs trabajadas: ");
        numberOfHoursWorked = keyboard.nextDouble();

        System.out.println("Ingrese el sueldo por hora: ");
        hourlyWage= keyboard.nextDouble();

        if (numberOfHoursWorked >= 40){
            totalPay =(40 * hourlyWage) + ((numberOfHoursWorked - 40) * (hourlyWage * 2));

        } else {
            totalPay = hourlyWage * numberOfHoursWorked;
        }

        System.out.println("El sueldo semanal es de : " + totalPay);
    }
}
