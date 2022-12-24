package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'A';
        String result = "";
        // \\
        switch (ch) {

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);


    }
}
   // if the grade is A or B C or D ====> "passed"
   // otherwise ==> "Failed"