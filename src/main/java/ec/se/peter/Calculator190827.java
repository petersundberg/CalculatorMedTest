package ec.se.peter;

import java.util.Scanner;

public class Calculator190827 {


    //Miniräknare

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        double result = 0;

        boolean keepAlive = true;
        while (keepAlive) {

            System.out.println("Write number 1:");
            num1 = scanner.nextDouble();
            System.out.println("Write number 2:");
            num2 = scanner.nextDouble();

            //välj räknesätt
            System.out.println("Choose arithmetic (+, -, * or /)");
            char operator = scanner.next().charAt(0);
            //---------------------------------------------------------------------

            switch (operator) {
                case '+':
                    doAddition(num1, num2);
                    System.out.println("The result is: " + (num1 + num2));
                    break;
                case '-':
                    doSubtraction(num1, num2);
                    System.out.println("The result is: " + (num1 - num2));
                    break;
                case '*':
                    doMultiplication(num1, num2);
                    System.out.println("The result is: " + (num1 * num2));
                    break;
                case '/':
                    doDivision(num1, num2);
                    System.out.println("The result is: " + (num1 / num2));
                    break;
                default:
                    anotherInput(operator);
                    //System.out.println(operator + " is not supported");
                    break;
            }


            //fråga om fortsätta
            System.out.println("Do you want to continue? (y/n)");

            char operator_yn = scanner.next().charAt(0);
            switch (operator_yn) {
                case 'y':
                    //result = num1 + num2;
                    break;
                case 'n':
                    keepAlive = false;
                    break;
                //default:
            }

        }

    } //main slutar

//metoder

    //addition
    public static double doAddition(double num1, double num2) {
        //System.out.println("The result is: " + (num1 + num2));
        return num1 + num2;
    }
    //subtraktion
    public static double doSubtraction(double num1, double num2) {
        //System.out.println("The result is: " + (num1 - num2));
        return num1 - num2;
    }
    //multiplikation
    public static double doMultiplication(double num1, double num2) {
        //System.out.println("The result is: " + (num1 * num2));
        return num1 * num2;
    }
    //division
    public static double doDivision(double num1, double num2) {
        //System.out.println("The result is: " + (num1 / num2));
        return num1 / num2;
    }
    //annat, fel, tecken
    public static void anotherInput(char operator){
        System.out.println("Unknown input.");
    }

}





