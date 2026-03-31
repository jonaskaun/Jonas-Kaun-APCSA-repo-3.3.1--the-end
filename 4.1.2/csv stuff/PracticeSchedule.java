/* 
 * Activity 4.1.2
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PracticeSchedule
{
    public static void main(String[] args) throws IOException
    {
      Scanner sc1 = new Scanner(new File("schedule1.csv"));
      
      String str;
      String[] tokens;
      
      while (sc1.hasNext()) {
        str = sc1.next();
        tokens =  str.split(",");
        System.out.println(tokens[0] + " I practice " + tokens[1]  + " hours.");  
      }
      
      sc1.close();
        
    }
}