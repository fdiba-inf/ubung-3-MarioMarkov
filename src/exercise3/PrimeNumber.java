package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i=2;
        boolean isPrime = true;
        while(i<num){
          if(num%i == 0){
            isPrime = false;
            break;
          }
          i++;
        }
        System.out.println("Prime number: "+ isPrime);
    }

}