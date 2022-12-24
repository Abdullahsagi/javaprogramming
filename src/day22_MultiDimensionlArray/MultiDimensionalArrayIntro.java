package day22_MultiDimensionlArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[] group1 = {"Jon" , "Joes", "James"};
        String[] group2 = {"Jon" , "Joes", "James"};
        String[] group3 = {"Jon" , "Joes", "James"};

    String[][] groups = new String[3][];//index: 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.toString(groups)); //toString() is for one dimensional array only
        System.out.println( Arrays.deepToString(groups) );

    }
}
/*

 String[] group1 = {"Jon" , "Joes", "James"}
 String[] group2 = {"Jon" , "Joes", "James"}
 String[] group3 = {"Jon" , "Joes", "James"}
 */