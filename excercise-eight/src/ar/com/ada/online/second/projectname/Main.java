package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOfStudents;
        int costPerPupil = 0;
        int totalDue;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        numberOfStudents = keyboard.nextInt();

        if (numberOfStudents >= 100) {
            costPerPupil = numberOfStudents * 65;
        } else if (numberOfStudents > 50 && numberOfStudents < 100) {
            costPerPupil = numberOfStudents * 70;
        } else if (numberOfStudents > 30 && numberOfStudents < 50) {
            costPerPupil = numberOfStudents * 95;
        } else {
            costPerPupil = 4000 / numberOfStudents;
        }

        totalDue = costPerPupil * numberOfStudents;

        System.out.println("el costo por alumno es de: " + costPerPupil);
        System.out.println("El pago total es de: " + totalDue);
    }
}

