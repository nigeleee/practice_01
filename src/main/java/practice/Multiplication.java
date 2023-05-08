package practice;

import java.io.Console;

public class Multiplication {
    public static void main(String[] args) {
        Console con = System.console();
        String input = con.readLine("Please enter a number: ");

        int num = Integer.parseInt(input);
        int i;

        for (i = 1; i <= 10; i++) {
            // System.out.println("Result: " + num + " * " + i + " = " + num*i);
            System.out.printf("Result: %d * %d = %d\n", num, i, num*i);
            System.out.println();
        }

        
    }

    
}

/*create a prog that prompts user to input number
  print statement to return number multiplied by 1-10 with the result
 */