package day17_While_DoWHile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if(i == 'C'){
                continue;
            }

            System.out.println(i);//A B D E
        }


    }
}
