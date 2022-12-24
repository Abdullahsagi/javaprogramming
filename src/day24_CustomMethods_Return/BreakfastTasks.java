package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Cydeo", "school"); // C.S

    }
//1. Create a method that can display the initials of the person, initials (String firstName,String lastName)
    public static void initials(String firstName, String lastName){

        String initial = firstName.charAt(0)+ "."+lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }


}


/*

Warmup tasks:
    1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

 */