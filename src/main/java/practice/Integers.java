package practice;

import java.io.Console;
import java.util.Scanner;

public class Integers {
    

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter a number");
        int a = scanner.nextInt();

        System.out.println("Please enter a second number");
        int b = scanner.nextInt();

        System.out.println("Please enter the last number");
        int c = scanner.nextInt();

        

        System.out.println("The average sum of integers entered is: " + (sum(a, b, c))/3);

        
        
        
    }

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
}
//create a prog that promts user in to input 3 integers. after that print a staement to return average of the 3 numbers