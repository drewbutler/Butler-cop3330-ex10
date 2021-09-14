/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        int itemOne = myObj.nextInt();

        System.out.println("Enter the quantity of item 1: ");
        int quantOne = myObj.nextInt();

        System.out.println("Enter the price of item 2: ");
        int itemTwo = myObj.nextInt();

        System.out.println("Enter the quantity of item 2: ");
        int quantTwo = myObj.nextInt();

        System.out.println("Enter the price of item 3: ");
        int itemThree = myObj.nextInt();

        System.out.println("Enter the quantity of item 3: ");
        int quantThree = myObj.nextInt();

        int totalOne = itemOne * quantOne;
        int totalTwo = itemTwo * quantTwo;
        int totalThree = itemThree * quantThree;

        double subtotal = totalOne + totalTwo + totalThree;

        System.out.println("Subtotal: $" + subtotal);

        double tax = subtotal * 0.055;

        System.out.println("Tax: $" + tax);
        
        double total = tax + subtotal;

        System.out.println("Total: $" + total);

        myObj.close();
    }
}