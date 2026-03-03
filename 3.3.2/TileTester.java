/*
 * Activity 3.3.1
 */
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

  

    String[] randomValues = new String[12];


    Tile[][] gameboard = new Tile[3][4];

    for(Tile[] Row : gameboard){

      

      for(Tile Col: Row){
        System.out.print(Col+"\t");

      }
      System.out.println("");
    }

  
    
  }
}
