
/**
 * Nguru Ian Davis
 * 15059844
 */
public class Crew extends Passenger 
{
    public static final String CAPTAIN = "Captain";
    public static final  String FIRST_OFFICER = "First Officer";
    public static final  String CABIN_CREW = "Cabin Crew";      //static Strings that hold the crew type
    
    private String position ;
    
    /**
     * Constructor to be used to create objects of Crew type
     */
    public Crew( int passengerNumberStart, String fName, String lName, double w, double lugg, String pos)
    {
        super(passengerNumberStart, fName, lName, w, lugg);     //gets the properties from the passenger class
        
        if(pos.equals(null))
        {
           System.out.println("Please enter position");
        }
         if (pos.equalsIgnoreCase(CAPTAIN)) 
        {
            position = Crew.CAPTAIN;
        }
        else if (pos.equalsIgnoreCase(FIRST_OFFICER))
        {
            position = Crew.FIRST_OFFICER;
        }
        else if (pos.equalsIgnoreCase(CABIN_CREW))
        {
            position = Crew.CABIN_CREW;
        }        
         else
         {
            System.out.println("Crew member's position not defined ( " + getPassNum() + " )");      //checks that only the allowed crew type are added
        }
    }
        
    /**
     * return the position of the crew member
     */
    public String getCrew()
    {
        return position;
    }
    
    /**
     * set the position of the crew member
     */
    public void setCrew(String pos)
    {
        if(pos.equals(null))
        {
           System.out.println("Please enter position");
        }
         if (pos.equalsIgnoreCase(CAPTAIN)) 
        {
            position = Crew.CAPTAIN;
        }
        else if (pos.equalsIgnoreCase(FIRST_OFFICER))
        {
            position = Crew.FIRST_OFFICER;
        }
        else if (pos.equalsIgnoreCase(CABIN_CREW))
        {
            position = Crew.CABIN_CREW;
        }
        
         else
         {
            System.out.println("Not a type of crew.");      //makes sure that the crew position that is to be passed is of the 3 that are allowed
        }
    }
    
    /**
     * overrides the toString from the Passenger class adding the position of the crew member
     */
    @Override
    public String toString()
    {
        String string = super.toString();
        return string + " Crew Type: " + getCrew();
    }
}
