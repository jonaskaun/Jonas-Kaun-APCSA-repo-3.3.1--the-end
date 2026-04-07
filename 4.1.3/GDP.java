
/*

 * Activity 4.1.3
 *
 * Data attribute:
 * The World Bank:GDP (current US$): OECD National Accounts data files, CC BY 4.0
 */
import java.io.IOException;
import java.util.ArrayList;

public class GDP
{
    public static void main(String[] args) throws IOException
    {
        String fileName = "gdp.csv";
        ArrayList<GDPData> gdp = new ArrayList<>();

        gdp = GDPData.createDataSet(fileName);

        for(GDPData d:gdp){
            String s = d.toString();
            if(s.substring(0,s.indexOf(" ")).equals("Austrailia:")){
                System.out.println();

            }

        }



    }
}