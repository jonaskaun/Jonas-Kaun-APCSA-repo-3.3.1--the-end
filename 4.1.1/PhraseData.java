/*
 * Activity 4.1.1
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PhraseData
{
  
  
 
  public static void main(String[] args) throws IOException
  { 
    File phraseFile = new File("phrases.txt");

    Scanner sc = new Scanner(phraseFile);
   
    System.out.println(sc.nextLine());
    
    sc.close();
  }

  
}
