/*
 * Activity 3.3.1
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    Tile[][] gameboard = new Tile[3][4];

    // randomization ( uber cursed, but functional)
    ArrayList<String> tileCopy = new ArrayList<String>();
    String[] randomizer = new String[12];
    int random;
    for(String s: tileValues){
      tileCopy.add(s);
    }
    int i = 0;
    while(i<randomizer.length){
      random = (int)((Math.random()*tileCopy.size()));
      randomizer[i] = tileCopy.get(random);
      tileCopy.remove(random);
      i++;
    }
    i=0;
    int j = 0;
    for(String s: randomizer){
      gameboard[i][j] = new Tile(s);

      if(j == 3 ){
        j =0;
        i++;
      }
      else{
        j++;
      }
    }
    
    Tile[][] gamePlay = new Tile[3][4];
    for(i=0;i<gamePlay.length;i++){
      for(j=0;j<gamePlay[0].length;j++){
        gamePlay[i][j] = new Tile("\t[?]");
      }
    }
    boolean end = false;
    while(end = false){
      for (Tile[] row: gameboard){
        for (Tile col:row){
          System.out.print("\t"+ col);      
        }
      System.out.println("");
      }

      System.out.println("\n What space would you like to uncover?\n\n enter Row");
      int Row = sc.nextInt();
      System.out.println("\n Which Column?");
      int Col = sc.nextInt();


      









      end = true;

    }
  
    
  }
}
