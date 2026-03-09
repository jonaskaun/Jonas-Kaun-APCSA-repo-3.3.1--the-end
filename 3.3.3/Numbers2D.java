/*
 * Activity 3.3.3
*/
public class Numbers2D
{
  public static void main(String[] args)
  {
    int[][] numbers = { {1,5,3,8,-3,0,3},
                      {4,4,8,0,3,-1,1}, 
                      {0,3,8,4,-2,7, 6} };

    int minValue =numbers[0][0];
    int maxValue = numbers [0][0];

    int sum = 0; 
    int leng = 0;  
    int numNegatives = 0;       
    for(int[] i: numbers){
      leng += i.length;
      for(int j: i){
        sum+= j;
        if (j < minValue){
          minValue = j;
        }
        if (j>maxValue){
          maxValue = j;
        }
        if (j<0){
          numNegatives++;
        }
          
      }

    }
    System.out.println("the sum is: "+ sum);


    double average = sum /(1.0*leng);

    System.out.println("the average is: "+average);

    System.out.println("the minimum value is: "+ minValue);
    System.out.println("the max value is: "+ maxValue);

    System.out.println("the number of negative values is: "+ numNegatives);
    

    

  }
}
