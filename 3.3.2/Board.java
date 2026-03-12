import java.util.ArrayList;

/** 
 * Activity 3.3.2
 *
 * A game board of NxM board of tiles.
 * 
 */
public class Board
{  
  private static String[] tileValues = {"lion", "lion",
                                        "penguin", "penguin",
                                        "dolphin", "dolphin",
                                        "fox", "fox",
                                        "monkey", "monkey",
                                        "turtle", "turtle"}; 
  private Tile[][] gameboard = new Tile[3][4];

  /**  
   * Constructor for the game. Creates the 2D gameboard
   * by populating it with card values
   * 
   */
  public Board()
  {
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
    
    

  }

 /** 
   * Returns a string representation of the board, getting the state of
   * each tile. If the tile is showing, displays its value, 
   * otherwise displays it as hidden.
   * 
   * Precondition: gameboard is populated with tiles
   * 
   * @return a string represetation of the board
   */
  public String toString()
  {
    String boardString ="";
 
    for(Tile[] t:gameboard){
      for(Tile u : t){
        boardString += "\t";
        if(u.isShowingValue()== true){
          
          boardString += u;


        }
        
        
      }
      boardString += "\n";
      
    }
 
    return boardString;
  }

  /** 
   * Determines if the board is full of tiles that have all been matched,
   * indicating the game is over.
   * 
   * Precondition: gameboard is populated with tiles
   * 
   * @return true if all tiles have been matched, false otherwse
   */
  public boolean allTilesMatch()
  {
    boolean checkTilesMatch = true;
    for(Tile[] t: gameboard){
      for(Tile u: t){
        if (u.matched()== false){
          checkTilesMatch = false;
        }
      }
    }

    
    
    return checkTilesMatch;
  }

  /** 
   * Sets the tile to show its value (like a playing card face up)
   * 
   * Preconditions:
   *   gameboard is populated with tiles,
   *   row values must be in the range of 0 to gameboard.length,
   *   column values must be in the range of 0 to gameboard[0].length
   * 
   * @param row the row value of Tile
   * @param column the column value of Tile
   */
  public void showValue (int row, int column)
  {
   
    System.out.println((gameboard[row][column]).getValue());
  }  

  /** 
   * Checks if the Tiles in the two locations match.
   * 
   * If Tiles match, show Tiles in matched state and return a "matched" message
   * If Tiles do not match, re-hide Tiles (turn face down).
   * 
   * Preconditions:
   *   gameboard is populated with Tiles,
   *   row values must be in the range of 0 to gameboard.length,
   *   column values must be in the range of 0 to gameboard[0].length
   * 
   * @param row1 the row value of Tile 1
   * @param col1 the column value of Tile 1
   * @param row2 the row value of Tile 2
   * @param col2 the column vlue of Tile 2
   * @return a message indicating whether or not a match occured
   */
  public String checkForMatch(int row1, int col1, int row2, int col2)
  {
    String msg = "";
    if(gameboard[row1][col1].getValue().equals(gameboard[row2][col2].getValue())){
      gameboard[row1][col1].show();
      gameboard[row2][col2].show();
      msg = "Match!";


    }
    else{
      gameboard[row1][col1].hide();
      gameboard[row2][col2].hide();
      msg = "No Match :(";
    }

     
    
    return msg;
  }

  /** 
   * Checks the provided values fall within the range of the gameboard's dimension
   * and that the tile has not been previously matched
   * 
   * @param rpw the row value of Tile
   * @param col the column value of Tile
   * @return true if row and col fall on the board and the row,col tile is unmatched, false otherwise
   */
  public boolean validateSelection(int row, int col)
  {

    if (row<gameboard.length && col< gameboard[0].length){
      if(gameboard[row][col].matched()==false){
        return true;

      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }

}
