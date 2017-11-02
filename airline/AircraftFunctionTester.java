
/**
 * Nguru Ian Davis
 * 15059844
 */
public class AircraftFunctionTester
{
   public static void main(String[] args)
   {
       Aircraft a1 = new Aircraft(Route.GLASGOW, Route.GLASGOW_MAX_PASSENGERS, Route.GLASGOW_MAXIMUM_WEIGHT);
       System.out.println(a1.toString());
       
       Crew cru1 = new Crew(0, "Josphat", "Nguru", 90, 90, "captain");
        a1.addPassenger(cru1);
        //auto generated passengers
        for(int c=0;c<99;c++)       //set c < maxpassengers allowed per route(Glasgow = 100) and to test whethermax is not exceeded, make it MORE
        {
            double x = 5;
            String pfn = c+"Fname";
            String pln = c+"Lname";
            EconomyPassenger ep = new EconomyPassenger(0, pfn,pln,80.0, x,Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
            //x =32.0;
            a1.addPassenger(ep);
        }
        
        a1.findPassenger(0);
        a1.removePassenger(1010);
        System.out.println("");
        a1.listPassengers();
        
    }
}
