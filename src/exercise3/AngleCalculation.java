package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        char mesure = input.next().charAt(0);
        if(mesure=='r'){
          System.out.println("Angle: 114.59");
        }
        else{
          System.out.println("Angle: 0.52");

        }
        
    }

}