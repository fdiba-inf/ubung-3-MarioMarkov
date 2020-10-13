package exercise3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double area = 0.0;
        double p =0.0;
        
        while(true){
          double a = input.nextDouble();
          double b = input.nextDouble();
          double c = input.nextDouble();
          p =(a+b+c)/2;
          if (a<=0||b<=0||c<=0){
            break; 
          }
          if (a>0 && b>0&& c>0 && a+b>c && a+c>b&& b+c>a ){
            area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Area: "+ area);
            if(a==b && b==c)
            System.out.println("Equilateral");

        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
            System.out.println("Isosceles");

        else if(a!=b && b!=c && c!=a)
            System.out.println("Scalene");
          } 
          else{
            System.out.println("Values are not correct!");
          }
        }
    }    

}