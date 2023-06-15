import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<HurricaneRowData> data=new ArrayList<HurricaneRowData>();
        try {
 
            // Create an object of filereader
            // class with CSV file as a parameter.
            File filereader = new File("ace.csv");
            Scanner s=new Scanner(filereader);
            String temp = s.nextLine();
            while(s.hasNext()) {

                String text=s.nextLine();
                String[] nextRecord=text.split(",");
                HurricaneRowData tt=new HurricaneRowData(Integer.parseInt(nextRecord[0]),Integer.parseInt(nextRecord[1]),Integer.parseInt(nextRecord[2]),Integer.parseInt(nextRecord[3]),Integer.parseInt(nextRecord[4]));
                data.add(tt);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        int maxPosi=0;
        for(int i=0;i<data.size();i++)
        {
            if(data.get(i).getAceIndex()>data.get(maxPosi).getAceIndex()) maxPosi=i;
        }
        System.out.println("the year is "+data.get(maxPosi).getYear());
        
        
    }
}
