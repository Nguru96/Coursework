
/**
 * Write a description of class TestPassenger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebugPassengerTest
{
    public static void main(String[] args)
    {
        System.out.println("this is aircraft a2" );
        Aircraft a2 = new Aircraft(Route.GLASGOW, Route.GLASGOW_MAX_PASSENGERS, Route.GLASGOW_MAXIMUM_WEIGHT);
        Crew cru1 = new Crew(0, "Jos", "Nguru", 90, 90, "captain");
        a2.addPassenger(cru1);
        // a2.listPassengers();
        // System.out.println("\n");
        
        Crew cru2 = new Crew(0, "Njeri", "Sherina", 80, 90, "first officer");
        a2.addPassenger(cru2);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ1 = new EconomyPassenger(0, "Bob", "Marley", 80, 20, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ1);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ2 = new EconomyPassenger(0, "Peter", "Tosh", 110, 200, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ2);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ3 = new EconomyPassenger(0, "Bunny", "Wailer", 75, 120, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ3);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ4 = new EconomyPassenger(0, "maina", "thiong'o", 80, 200, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ4);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ5 = new EconomyPassenger(0, "Juxtaposition", "otieno", 110, 200, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ5);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ6 = new EconomyPassenger(0, "Emanuel", "Mwai", 75, 120, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ6);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ7 = new EconomyPassenger(0, "Grace", "Kimani", 60, 200, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ7);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ8 = new EconomyPassenger(0, "Rosemary", "Lubembe", 70, 400, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ8);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ9 = new EconomyPassenger(0, "liza", "gatheru", 75, 120, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ9);
        // a2.listPassengers();
        // System.out.println("\n");
        
        EconomyPassenger econ10 = new EconomyPassenger(0, "angela", "kemunto", 65, 110, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ10);
        a2.listPassengers();
        System.out.println("\n");
        
        System.out.println(a2.toString());
    }
}
