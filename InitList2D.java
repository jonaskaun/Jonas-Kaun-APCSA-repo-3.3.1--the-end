/*
 * Activity 3.3.1
 */
public class InitList2D
{
  public static void main(String[] args)
  {
    String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"}  }; 
    
    for (int i=0;i<board.length;i++){
      for(int j = 0;j<board[board.length -1].length;j++){
        System.out.print(board[i][j]+", ");

      }
      System.out.println("");
    }

    System.out.println("");

    for(int l = 0;l<board[board.length -1].length;l++){
      for (int k=0;k<board.length;k++){
      
        System.out.print(board[k][l]+", ");

      }
      System.out.println("");
    }
  }
}
