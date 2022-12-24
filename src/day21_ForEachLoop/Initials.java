package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Elmiur Ablimit", "Ali kilic", "Hulya keles", "Sinem kaya",
        "Begench Begenjov", " Ruveyda Durna", " Jonathan Holly", " Alshaun Rodgers","Manas Kalenov","Gulsen Sohret"};


       for(String each : names ){
           String initial = each.charAt(0)+"."+ each.charAt( each.indexOf(" ") +1  );
           System.out.println(initial);

        }







    }
}
