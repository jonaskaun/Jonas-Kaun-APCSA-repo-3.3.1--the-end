/*
 * Activity 4.2.1
 */
import java.io.IOException;
import java.util.ArrayList;

public class ChildrensLibrary
{
  public static void main(String[] args) throws IOException
  {
    //Construct a new Library called library.
    Library library = new Library();
    

    //Define an ArrayList named childrensBooks that contains 
    //the list of all the children’s books in the library. 
    ArrayList<Book> childrensBooks = library.getChildrensBooks();
    
    
   // Create a String variable called authorToFind that contains the author’s name, L. Frank Baum.
    String authorToFind = "L. Frank Baum";
    
    double skyRating =-1.0;
    for(Book b: childrensBooks){
      if(b.getAuthor().equals(authorToFind)){
        System.out.println(b.getTitle()+" was written by: "+authorToFind+"\n");

      }
      if (b.getTitle().equals("Sky Island")){
        skyRating = b.getRating();

      }
    }
    System.out.println("\n\n\nBooks with a higher or equal rating to Sky Island      \n");

    for(Book b: childrensBooks){
      if(b.getRating()>= skyRating){
        System.out.println(b.getTitle());
      }

    }
    System.out.println("\n\n\n\n");
    
    System.out.println("Books that start with 'The'\n");
    for(Book b: childrensBooks){
      if(((b.getTitle()).substring(0,3)).equals("The")){
        System.out.println(b.getTitle());

      }
    }
    System.out.println("\n\n\n\n");

    

    
   
  
    for (int i = 0; i < childrensBooks.size(); i++) {
      Book b = childrensBooks.get(i);
      String title = b.getTitle();
      if (title.trim().substring(0,3).equals("The")) {
        System.out.println(title + "\t Location: " + i);
      }
    }
  }
  
}