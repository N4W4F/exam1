import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please, Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Please, Input the second number: ");
        int num2 = input.nextInt();

        System.out.print("Please, Input the third number: ");
        int num3 = input.nextInt();

//      1. Calling max method to return the biggest number of previous 3
        System.out.println("The biggest number is: " + max(num1, num2, num3));

        System.out.println("-----------------------------------------------------------");

        System.out.print("Please, write a string: ");
        String userString = input.nextLine();
         userString = input.nextLine();

        System.out.print("Please, write the index you want to print: ");
        int index = input.nextInt();

//      2. Calling printIndex method to print an index in a string
        printIndex(userString, index);

        System.out.println("-----------------------------------------------------------");

//      3. Calling printSum to print the sum of numbers from the user
        printSum();

        System.out.println("-----------------------------------------------------------");

        int[] arrayOfIntegers = {10, -21, 30, 31, -25};

//      4. Calling findArray to show which positive and negative integers
        findArray(arrayOfIntegers);

        System.out.println("-----------------------------------------------------------");

        String[] arrayOfStrings = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};

//      5. Calling findShortest method to return the shortest string of an array
        System.out.println(findShortest(arrayOfStrings));
    }


//  1. Write a Java program that accept three numbers from the usr and print the largest number.

    public static int max(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3)
            return num1;

        else if (num2 >= num1 && num2 >= num3)
            return num2;

        return num3;
    }


//  2. Write a Java program that accept a String and a number from the
//  user, then print the character in the given index.

    public static void printIndex(String userString, int index) {
        if(index > userString.length() - 1 || index < 0) {
            System.out.println("Index is out of bound");
            return;
        }
        System.out.println(userString.charAt(index));
    }


//  3. Write a program to enter the numbers till the user wants and at the end
//  it should display the sum entered.

    public static void printSum() {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int userInput = 0;

        do {
            System.out.print("Please, Input a number, or 0 to quit: ");
            userInput = input.nextInt();
            sum += userInput;
        } while (userInput != 0);

        System.out.println("The sum = " + sum);
    }


//  4. Write a Java program to find a positive and negative numbers of a given array:

    public static void findArray(int[] arr) {
        for (int a : arr) {
            if (a >= 0)
                System.out.println(a + " is a positive number");

            else System.out.println(a + " is a negative number");
        }
    }


//  5. Write a Java program to find a shortest word of a given array:

    public static String findShortest(String[] arr) {
        String shortest = "null";

        for (int i = 0; i < arr.length - 1; i ++) {
            if (arr[i].length() > arr[i+1].length())
                shortest = arr[i + 1];

        }
        return shortest;
    }
}
