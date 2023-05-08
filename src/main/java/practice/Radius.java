package practice;

import java.io.Console;

import javax.swing.plaf.ToolBarUI;

public class Radius {

    public static void main(String[] args) {
        Console con = System.console();   
   
        String input = con.readLine("Key in a number for radius: ");
        int r = Integer.parseInt(input);
    
        int d = r*2;
        // System.out.println("Diameter = " + d + " Area = " + area(r));
        System.out.printf("Diameter = %d, Area = %.3f ", d, area(r));
        
       }

    public static double area(int r) {
        double area = 3.142*r*r;
        return area;

}
}    

//create a prog that prompts user to input a radius for a circle, 
// after which print a statement to return the diameter and area of the circle
//A = pie*^2