/*
 * Activity 4.1.2
 */

 /**
  * Simple Horse class to define a horse.
  */
public class Horse
{
  private String name;
  private int weight;
  private double age;

  /*
   * The constructor for a horse.
   */
  public Horse (String n, int w, double a)
  {
    name = n;
    weight = w;
    age = a;
  }
  
  /**
   * Returns the name of the horse.
   * 
   * @return the horse's name
   */
  public String toString()
  {
    return name;
  }
}
