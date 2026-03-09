/*
 * Activity 3.3.3
*/
public class Names2D
{
  public static void main(String[] args)
  {
    String[][] names = {{"Ari", "Avery", "Ash", "Aman"},
                        {"Brynn", "Bodie", "Bo", "Barrie"},
                        {"Cris", "Carter", "Cali", "Ari"}};
    
    System.out.print("Determine if there are duplicate names:");
    boolean duplicates = false;
    String check = "";
    for( String[] i:names){
      for (String j: i){
        check = j;        
        for (String[] k: names){
          for (String l: k){
            if (check.equals(l))
            duplicates = true;
            
          }
          

            
        }
      }
    }
    if (duplicates == true){
      System.out.println(":         yes  duplicates");
    }
    else{
      System.out.println(":        no duplicates");
    }
   
    
    System.out.println("\nAccess consecutive pairs of elements in each row:");
    int consecPairs =0;
    for(String[] i: names){
      for(int j = 0;j<i.length-1;j++){
        if(i[j].equals (i[j+1])){
          consecPairs++;


        }

      }
    }
    System.out.println("num consec pairs = "+ consecPairs);
    
    
    System.out.println("\nReverse the order of the elements in second column:");
    String[] rowTwo = names[1];
    String temp ="";
    for(int i = 0;i<=(rowTwo.length/2);i++){
      temp = rowTwo[i];
      rowTwo[i] = rowTwo[rowTwo.length-1-i];
      rowTwo[rowTwo.length-1-i] = temp;


      
    }
    for(String[] i: names){
      for (String j: i){
        System.out.print("\t"+ j);

      }
      System.out.println("");
    }
    

    
    
    System.out.println("\nShift an element in a row: Shift the first name in the first row left to the last name in the row:");

    String[] firstRow = names[0];
    temp = firstRow[0];
    firstRow[0] = firstRow[firstRow.length-1];
    firstRow[firstRow.length-1] = temp;

    for(String[] i: names){
      for (String j: i){
        System.out.print("\t"+ j);

      }
      System.out.println("");
    }
    

    


   
   
    System.out.println("\nShift an element in a column: Shift the last name in the first row down to the last row:");



    temp = names[0][0];
    names[0][0] = names[3][0];
    names[3][0] = temp;


    
   
  }
}
