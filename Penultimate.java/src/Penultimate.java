import java.util.Scanner;
public class Penultimate {
   public void Last(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
   try{
       if (line.length() <= 1){
           System.out.print("Enter more than 1 word:  ");
       }
       String[] words = line.split("[ ]+");
       System.out.println("The Penultimate word you are looking for is: "+words[words.length - 2]);
   } catch (Exception e) {
       System.out.println("Please enter more than 1 word: ");
   }
       //String[] words = line.split("[ ]+");
        //System.out.println("The Penultimate word you are looking for is: "+words[words.length - 2]);
    }


}