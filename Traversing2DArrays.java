/*
 * Activity 3.3.1
 */
public class Traversing2DArrays
{
  public static void main(String[] args)
  {
   String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"} }; 
                       
    for (String[] row : board){
      for(String col: row){
        col = "Test";
        // moding col does not affect the array itself
      }
      System.out.println("");
    }

    for (String[] row : board){
      for(String col: row){
        System.out.print(col+", ");
      }
      System.out.println("");
    }
  
  }
}
