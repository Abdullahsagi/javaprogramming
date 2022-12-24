package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_Nextline {
    public static void main(String[] args) {


        //123Enter
        Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter your full name:");
        String fullName = input.nextLine(); //Wooden spoonEnter

        System.out.println("Enter your Programming Language");
        String programming = input.nextLine();//Java Programing LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); //35Enter

        input.nextLine(); // capture the Enter key that user pressed for nextInt()

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine(); //Enter


        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

            input.close();
    }
}
