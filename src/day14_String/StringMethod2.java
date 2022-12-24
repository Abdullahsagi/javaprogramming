package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

      String str = "Java is fun, I love learning Java";
      String str2 =  str.replace("java" , "python");// pyhton is fun,

        System.out.println("str = " + str);
        System.out.println("str2 = " +str2);


   String email = "JohnSmith@yahoo.com";
   email = email.replace("yahoo", "gmail");//JonhSmith@gmail.com

        System.out.println("email = " + email); // gmail

        String sentence = "Java Java Pyhton Pyhton C# C# C++ C++  Python Python Python";
     String sentence2 = sentence.replace("Python", "");//"Java Java C# C# C# C++ C++"

        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence2.replace("  " , "");
        System.out.println("sentences2 = " + sentence2);


    }
}
