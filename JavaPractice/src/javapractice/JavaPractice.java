/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Scanner;

/**
 *
 * @author acavedon
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cont = true;
        while (cont) {
            System.out.println("\n\n");
            System.out.println("Input function that you want to run: ");
            System.out.println("1 - Hello World");
            System.out.println("2 - Replace");
            System.out.println("3 - Temperature");
            System.out.println("4 - Boiling");
            System.out.println("5 - Boiling and Freezing");
            System.out.println("0 - quit");
            System.out.println("Choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Bye Bye now.");
                    cont = false;
                    break;
                case 1:
                    HelloWorld();
                    break;
                case 2:
                    Replace();
                    break;
                case 3:
                    Temperature();
                    break;
                case 4: 
                    Boiling(); 
                    break;
                case 5: 
                    BoilingFreezing(); 
                    break;
                default:
                    System.out.println("ERROR: bad input... try again.");
                    break;
            }   // switch()
        }   // while()
    }   //main()

    private static void HelloWorld() {
        System.out.println("\nHello World!");
    }

    private static void Replace() {
        int first = 7;
        int second = 19;
        int third;
        third = second;
        second = first;
        first = third;
        
        System.out.println("\nfirst=" + first + " second=" + second);
    }

    private static void Temperature() {
        System.out.println("Input a Celius value: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        System.out.println("\nFahrenheit: "+fahrenheit);
    }

    private static void BoilingFreezing() {
        System.out.println("Input the temperature: ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("\nThe water is boiling.");
        } else if (temp <=0) {
            System.out.println("\nThe water is freezing.");
        } else {
            System.out.println("\nThe water is liquid.");
        }
    }

    private static void Boiling() {
        System.out.println("Input the temperature: ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("\nThe water is boiling.");
        } else {
            System.out.println("\nThe water is not boiling");
        }
    }
    
}
