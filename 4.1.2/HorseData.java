/* 
 * Activity 4.1.2
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HorseData
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("horsedata.txt"));
        //ArrayList<String> horseData = new ArrayList<>();
        String horseName = "";
        int horseWeight= -1;
        double horseAge = -1.0;
        boolean horseStatus = false;
        int sumWeights = 0;
        double sumAge = 0.0;
        String horseStatusString = "";
        int horseNumber;
        double totalHay =0;
        for(horseNumber =1 ;sc.hasNext();horseNumber++){
            horseName = sc.next();
            horseWeight = sc. nextInt();
            horseAge = sc.nextDouble();
            horseStatus = sc.nextBoolean();

            if(horseStatus == true){
                horseStatusString = "(NEW)";
            }

            System.out.print(horseStatusString + " " + horseName+" weighs "+horseWeight+"lbs, and is "+horseAge+" years old.\n");
            


            sumWeights += horseWeight;
            sumAge += horseAge;
            horseStatusString = "";
            totalHay += (horseWeight*2.5);
        }

        double averageWeight = sumWeights/(horseNumber*1.0);
        double averageAge = sumAge/(horseNumber*1.0);
        System.out.println("\nThe average weight is: "+averageWeight+".\nThe average age is: "+averageAge+". \nYou will need "+totalHay+"lbs of hay");

        


        
    }
}