import java.util.Scanner;
public class CalculatorApp {
static Scanner userinput = new Scanner(System.in);
public static void main(String[] args) {

    //Initciated the variables x and y:
    Double x;
    Double y;
    //Get the user's input and set it equal to x:
    System.out.print("Enter a decimal number --> ");
    x = userinput.nextDouble();
    userinput.nextLine();
    
    //Get the user's input and set it equal to y:
    System.out.print("Enter another decimal number --> ");
    y = userinput.nextDouble();
    userinput.nextLine();

    System.out.println("\n");
    //Print the values the user entered:
    System.out.println("x = "+x);
    System.out.println("y = "+y);

    //Do the calculations with the inputted numbers:
    System.out.println("the sum of x and y (x + y) = "+(x+y));
    System.out.println("The product of x and y (x * y) = "+(x*y));
    System.out.println("x to the power of y (x ^ y) = "+Math.pow(x,y));
    System.out.println("The log base y of x (log y (x)) = "+Math.log(x)/Math.log(y));









}}
