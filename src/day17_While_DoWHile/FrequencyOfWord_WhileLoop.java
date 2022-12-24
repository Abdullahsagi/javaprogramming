package day17_While_DoWHile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python ";

        int frequency = 0;

    while (str.contains("Java")){
       str = str.replaceFirst("Java","");
        frequency++;
    }
        System.out.println(frequency);

        System.out.println("-----------------------------------");
   String sentences = " cat cat cat cat dog dog dog cat cat CAT CAT CAT";
   sentences = sentences.toLowerCase();

   int countCat = 0;

   while (sentences.contains("cat")){
       sentences = sentences.replaceFirst("cat","");
       countCat++;
   }
        System.out.println(countCat);






    }
}
