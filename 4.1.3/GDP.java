
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

        
        int F = GDPSearch.find(gdp,0,gdp.size(),"Australia");
        System.out.println("Largest GDP in Austrailia: "+ F);
        F = GDPSearch.find(gdp,0,gdp.size(),"Brazil");
        System.out.println("Largest GDP in Brazil: "+ F);
        F = GDPSearch.find(gdp,0,gdp.size(),"China");
        System.out.println("Largest GDP in China: "+ F);
        F = GDPSearch.find(gdp,0,gdp.size(),"Germany");
        System.out.println("Largest GDP in Germany: "+ F);

        System.out.println(gdp.get(0).toString());
        for(GDPData g:gdp){

        }
        


            

        



    }
}