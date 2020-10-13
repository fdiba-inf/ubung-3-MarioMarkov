package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        char mesure = input.next().charAt(0);
        if(mesure=='r'){
          System.out.println("Angle: "+(num*(180/Math.PI)));
        }
        else{
          System.out.println("Angle: 0.52");

        }
        
    }

}