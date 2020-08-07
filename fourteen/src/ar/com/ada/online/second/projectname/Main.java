package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int rating;
	char qualificationLetter;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la calificacion");
        rating = keyboard.nextInt();

        switch (rating){
                case 10:
                    qualificationLetter = 'A';
                    break;
                case 9:
                    qualificationLetter = 'B';
                    break;
                case 8:
                    qualificationLetter = 'C';
                    break;
                case 7:
                case 6:
                    qualificationLetter = 'D';
                    break;
                    default:
                        qualificationLetter = 'F';
                    rating = qualificationLetter;
                    System.out.println("Nuemro de destino invalido");
            }

            System.out.println("La calificacion es: " + qualificationLetter);
    }
}
