public class StringFun {
    public static void main(String[] args) {

        String phrase = "Hello there,";

        int space = phrase.indexOf('z');
        System.out.println("Character index is: " + space);

        // I'm not sure what happened to this code. //
        // This code works but I think it was a hard time understanding what we are trying to do with the code. //
        // The results came out to Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 12
       // at java.base/java.lang.String.checkBoundsBeginEnd(String.java:4601) //
        // at java.base/java.lang.String.substring(String.java:2704) //
       // at StringFun.main(StringFun.java:12) //

        String secondWord = phrase.substring(space+1);
        System.out.println("The second word is: " + secondWord);

        String firstWord = phrase.substring(0,space);
        System.out.println("The first word is: " + firstWord);

        System.out.println("\n\n");

        String name = new String("Mickey Mouse");
        String loudName = name.toUpperCase();

        System.out.println("Original Name: " + name);
        System.out.println("Loud name: " + loudName);

        System.out.println("The original phrase is: " + phrase);
        phrase = phrase.toLowerCase();
        System.out.println("The original phrase (after conversion) is: " + phrase);


    }
    
}
