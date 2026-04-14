
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
        String fileName = "gdp_per_capita.csv";
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
        GDPData dataTemp = gdp.get(0);
        for(GDPData d:gdp){
            if((d).getGdpLast()> dataTemp.getGdpLast()){
                dataTemp = d;
            }
        }
        System.out.println(dataTemp.getCountry());
        GDPData tempGDP = gdp.get(0);
        for(int row =0;row<gdp.size();row++){
            if (gdp.get(row).getGdpLast()>tempGDP.getGdpLast()){
                tempGDP = gdp.get(row);
            }

        }
        System.out.println("in 2022, "+ tempGDP.getCountry()+ " had the highest GDP");
        tempGDP = gdp.get(0);
        for(int row =0;row<gdp.size();row++){
            if (gdp.get(row).getGdpLast() - gdp.get(row).getGdpFirst() >(tempGDP.getGdpLast()-tempGDP.getGdpFirst())){
                tempGDP = gdp.get(row);
            }

        }

        System.out.println("the country with the largest GDP growth was "+ tempGDP.getCountry());




             

        



    }
}