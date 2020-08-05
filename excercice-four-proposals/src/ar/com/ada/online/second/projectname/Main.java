package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double charging;
	double hours;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("ingrese la cantidad de horas");
        hours = keyboard.nextDouble();

        if (hours >=1 && hours<=2){
            charging = hours * 5;
        } else if (hours >=3 && hours <5){
            charging = hours * 4;
        } else if (hours >=7 && hours <10 ){
            charging = hours *3;
        } else {
            charging = hours * 2;
        }

        System.out.println("debe cobrar: " + charging);
    }
}
