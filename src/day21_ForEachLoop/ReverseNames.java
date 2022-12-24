package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseNames {
    public static void main(String[] args) {

        String[] names = {"Elmiur Ablimit", "Ali kilic", "Hulya keles", "Sinem kaya",
                "Begench Begenjov", " Ruveyda Durna", " Jonathan Holly", " Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        for (String each : names) {// each: "Elminur Ablimit, "Ali kilic", "Hulya keles" ...

          String reversed = "";

            for (int i = each.length()-1; i >= 0; i--) { // reverses the string
               reversed += each.charAt(i);

                System.out.println(reversed);
                
            }


        }
    }
}
