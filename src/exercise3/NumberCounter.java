package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive=0;
        int negative=0;
        double sum=0;
        double average=0.0;
        double countofNumbers=0.0;
        while(true){
          int num = input.nextInt();
          if(num ==0){
              break;
          } 
          if(num >0){
            positive++;
          }
          else{
            negative++;
          }
          sum+=num;
          countofNumbers++;
        }
        average = sum /countofNumbers;
        System.out.println("Positive numbers: "+ positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ average);

    }

}