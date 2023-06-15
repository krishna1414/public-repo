import java.util.Scanner;
class HurricaneRowData {

    private int Year;
    private int AceIndex;
    private int Tropical_Storms;   
    private int Hurricanes_Cat;   
    private int Major_Huricanes_Cat;
    HurricaneRowData(int Year,int AceIndex,int Tropical_Storms,int Hurricanes_Cat,int Major_Huricanes_Cat)   
    {
        this.Year=Year;
        this.AceIndex=AceIndex;
        this.Tropical_Storms=Tropical_Storms;
        this.Hurricanes_Cat=Hurricanes_Cat;
        this.Major_Huricanes_Cat=Major_Huricanes_Cat;
    }
    public int getYear()
    { return Year; }
    public int getAceIndex()
    { return AceIndex; }
    public int getTropicalStorm()
    { return Tropical_Storms; }
    public int getHurricaneCat()
    { return Hurricanes_Cat; }
    public int getMajorHurricaneCat()
    { return Major_Huricanes_Cat; }

    public void setYear(int Year)
    { this.Year=Year; }
    public void setAceIndex(int AceIndex)
    { this.AceIndex=AceIndex; }
    public void setTropicalStorm(int Tropical_Storms)
    { this.Tropical_Storms=Tropical_Storms; }
    public void setHurricaneCat(int Hurricanes_Cat)
    { this.Hurricanes_Cat=Hurricanes_Cat; }
    public void setMajorHurricaneCat(int Major_Huricanes_Cat)
    { this.Major_Huricanes_Cat=Major_Huricanes_Cat; }
     
    public String toString()
    {
        return ("Year: "+Year+"\n"+"Ace Index: "+AceIndex+"\n"+"Tropical Storms: "+Tropical_Storms+"\n"+"Hurricane Cat: "+Hurricanes_Cat+"\n"+"Majore Hurricane Cat: "+Major_Huricanes_Cat);
    }
}
