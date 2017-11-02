
/**
 * Nguru Ian Davis
 * 15059844
 */
public class PassengerTest
{
    public static void main(String[] args)
    {
        Aircraft a1 = new Aircraft(Route.CAPE_TOWN, Route.CAPE_TOWN_MAX_PASSENGERS, Route.CAPE_TOWN_MAXIMUM_WEIGHT);
        //System.out.println(a1.toString());
        //System.out.println(qJet());
        Crew c1 = new Crew(0, "Ian", "Davis", 80, 90, "captain");
        a1.addPassenger(c1);
        
        Crew c2 = new Crew(0, "Nguru", "Davis", 70, 60, "cabin Crew");
        a1.addPassenger(c2);
        
        EconomyPassenger e1 = new EconomyPassenger(0, "Abdul", "Jamac", 120, 60, Economy.TYPE_CHARGE, Economy.CAPETOWN_BASE_FARE);
        a1.addPassenger(e1);
        
        EconomyPassenger e2 = new EconomyPassenger(0, "Dhiran", "Rabadia", 70, 110, Economy.TYPE_CHARGE, Economy.CAPETOWN_BASE_FARE);
        a1.addPassenger(e2);
        
        EconomyPassenger e3 = new EconomyPassenger(0, "Akash", "Patel", 75, 120, Economy.TYPE_CHARGE, Economy.CAPETOWN_BASE_FARE);
        a1.addPassenger(e3);
        
        
       
        
        a1.listPassengers();
        System.out.println(a1.toString());
        System.out.println("\n");
        
        a1.removePassenger(1002);
        System.out.println("\n");
        
        for(int c=0;c<200;c++)
        {
            double x = 0;
            String pfn = c+"Fname";
            String pln = c+"Lname";
            EconomyPassenger ep = new EconomyPassenger(0, pfn,pln,80.0, x,Economy.TYPE_CHARGE, Economy.CAPETOWN_BASE_FARE);
            //x =32.0;
            a1.addPassenger(ep);
        }
        
         EconomyPassenger e4 = new EconomyPassenger(0, "Abdi", "Jamal", 120, 60, Economy.TYPE_CHARGE, Economy.CAPETOWN_BASE_FARE);
        a1.addPassenger(e4);
        
        
        //a1.listPassengers();
        System.out.println(a1.toString());
                       
        System.out.println("\n");
        c1.setCrew("idiot");
        
        System.out.println("\n");
        //a1.listPayingPassengers();
                
        System.out.println("\n");
        
        
        
        
        // System.out.println("this is aircraft a2" );
        Aircraft a2 = new Aircraft(Route.GLASGOW, Route.GLASGOW_MAX_PASSENGERS, Route.GLASGOW_MAXIMUM_WEIGHT);
        Crew cru1 = new Crew(0, "Josphat", "Nguru", 90, 90, "captain");
        a2.addPassenger(cru1);
    
        Crew cru2 = new Crew(0, "Josphine", "Njeri", 80, 90, "first officer");
        a2.addPassenger(cru2);
        
        EconomyPassenger econ1 = new EconomyPassenger(0, "Bob", "Marley", 80, 20, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ1);
        
        EconomyPassenger econ2 = new EconomyPassenger(0, "Peter", "Tosh", 110, 200, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ2);     
        
        EconomyPassenger econ3 = new EconomyPassenger(0, "Bunny", "Wailer", 75, 120, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ3);
        
        EconomyPassenger econ4 = new EconomyPassenger(0, "Janet", "Munjiru", 80, 200, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ4);
        
        EconomyPassenger econ5 = new EconomyPassenger(0, "Juxtaposition", "otieno", 110, 200, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ5);
        
        EconomyPassenger econ6 = new EconomyPassenger(0, "Emanuel", "Mwai", 75, 120, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ6);
        
        EconomyPassenger econ7 = new EconomyPassenger(0, "Grace", "Kimani", 60, 200, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ7);
        
        EconomyPassenger econ8 = new EconomyPassenger(0, "Rosemary", "Lubembe", 70, 400, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ8);
        
        EconomyPassenger econ9 = new EconomyPassenger(0, "liza", "Gatheru", 75, 120, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ9);
        
        EconomyPassenger econ10 = new EconomyPassenger(0, "Angela", "Kemunto", 65, 110, Economy.TYPE_CHARGE, Economy.GLASGOW_BASE_FARE);
        a2.addPassenger(econ10);
        
        BusinessPassenger econ11 = new BusinessPassenger(0, "Angelah", "Kemuntoh", 55, 115, BusinessClass.TYPE_CHARGE, BusinessClass.GLASGOW_BASE_FARE);
        a2.addPassenger(econ11);
        
        a2.listPassengers();
        System.out.println("\n");
        System.out.println(a2.toString());
        System.out.println("\n");
        
        a2.removePassenger(1011);
        System.out.println("\n");
        
        a2.listPassengers();
        System.out.println(a2.toString());
        
        a2.findPassenger(1210);
        
        System.out.println("\n");
        a2.listPayingPassengers();
        // Aircraft a3 = new Aircraft();
        //BookingAdmin.setupAdmin();
        //aircraft.toString();
       
    }
    
}
