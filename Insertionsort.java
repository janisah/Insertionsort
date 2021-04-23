
/**
 * Beschreiben Sie hier die Klasse Insertionsort.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Insertionsort
{
        private int[] zahlen = {5,6,2,4,1};
    int ende = zahlen.length;
    int tauscher;
    int beste = 0;
    int speicher = zahlen[0];
    //int anfang = 0;

    public void sotieren()
    {
        for(int anfang = 0; anfang < ende; anfang++)
        {
            for(int aktuell = 0; aktuell < ende; aktuell++)
            {      
                if(zahlen[anfang] < zahlen[aktuell])    //Es wird gespeichert wo das Beste ist
                {
                      tauschen(anfang, aktuell);
                }
            }
        }
        arrayAusgeben();
    }
    
    public void arrayAusgeben()
    {
        for(int i=0; i < ende; i++)
        {
            System.out.println(zahlen[i]);
        }
    }
    
    public void tauschen(int zahl1, int zahl2)
    {
        tauscher = zahlen[zahl2];           //die erste Zahl wird gespeichert
            zahlen[zahl2] = zahlen[zahl1];      //Beste kommt an anfang
            zahlen[zahl1] = tauscher;            //Erste Zahl kommt an die stelle wo die kleinste Zahl war
    }
}
