import java.util.Scanner;
class StudentClassWithMultipleMethods
{
    public static void main(String arg[])
    {
        Scanner sree = new Scanner(System.in);
        Student sreeni = new Student();
        sreeni.name = "Sreenivas";
        System.out.println( "Name of the Student is:  "+ sreeni.name); //This prints the name of the student.
        System.out.println("Enter the marks of the following subjects out of 100:" );

        System.out.println("Enter the English marks "); //This takes thee user input for the english marks.
        sreeni.english = sree.nextInt();
        while(sreeni.english>100){ //The while loop  is used to display the error until the condition is met.
            System.out.print("The Marks cannot be more than 100"); //This throws the error message that the marks is greater than 100
            System.out.println("Enter the English marks ");
            sreeni.english = sree.nextInt();
        }
        System.out.println("Enter Computers marks");
        sreeni.computers = sree.nextInt();
        while(sreeni.computers > 100){
            System.out.print("The Marks cannot be more than 100");
            System.out.println("Enter the Computers marks ");
        }
        System.out.println("Enter the Hindi marks");
        sreeni.hindi = sree.nextInt();
        while(sreeni.hindi > 100){
            System.out.print("The Marks cannot be more than 100");
            System.out.println("Enter the Hindi marks ");
        }
        System.out.println("Enter the Maths marks");
        sreeni.maths = sree.nextInt();
        while(sreeni.maths > 100){
            System.out.print("The Marks cannot be more than 100");
            System.out.println("Enter the Maths marks ");
        }
        System.out.println("Enter the Science marks");
        sreeni.science = sree.nextInt();
        while(sreeni.science > 100){
            System.out.print("The Marks cannot be more than 100");
            System.out.println("Enter the Science marks ");
        }
        System.out.println("Enter the Social marks");
        sreeni.social = sree.nextInt();
        while(sreeni.social > 100){
            System.out.print("The Marks cannot be more than 100");
            System.out.println("Enter the Social marks ");
        }

        System.out.println("-------------------------------------------------");// This prints the detailed marks with the name of the subject.
        System.out.println("Detailed Marks");
        System.out.println("-------------------------------------------------");
        sreeni.printMarksDetails();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Summary Marks");
        System.out.println("-------------------------------------------------");
        sreeni.printMarksSummary();
        System.out.println("-------------------------------------------------");
    }
}

class Student
{
    String name;
    // Marks in various subjects
    int english;
    int computers;
    int hindi;
    int maths;
    int science;
    int social;
    //The data type is integer because there are math functions involved ahead which cannot be performed on other datatypes.

    int getLanguagesTotal()
    {
        return english + computers + hindi;
    }

    int getNonLanguagesTotal()
    {
        return maths + science + social;
    }

    int getAllSubjectsTotal()
    {
        return getLanguagesTotal() + getNonLanguagesTotal();
    }

    double getPCMPercentage()
    {
        return 100.0 * (maths + science) / 200.0;
    }
    double getLanguagePercentage(){
        return 100.0 * (english + hindi + computers) / 300.0;
    }

    void printMarksSummary()
    {
        System.out.println("Languages: " + getLanguagesTotal());//Gives the sum of the score achieved in Languages.
        System.out.println("Non languages: " + getNonLanguagesTotal());//Gives the sum of scores in non languages
        System.out.println("PCM Percentage: " + getPCMPercentage());//The percentage of score achieved in PCM subjects.
        System.out.println("Total: " + getAllSubjectsTotal());// The total marks achieved in all the subjects
        System.out.println("Language Percentage: " + getLanguagePercentage());//Gives the output of th e percentage of score achieved in Languages.
    }

    void printMarksDetails()
    {
        System.out.println("English : " + english);
        System.out.println("Computers : " + computers);
        System.out.println("Hindi : " + hindi);
        System.out.println("Maths : " + maths);
        System.out.println("Science : " + science);
        System.out.println("Social : " + social);
    }
}
