
/**
 * Nguru Ian Davis
 * 15059844
 */
public class EconomyPassenger extends PayingPassenger implements Economy
{
    /**
     * Constructor that instaciates the EconomyPassenger to create Economy passengers
     * 
     */
    public EconomyPassenger(int passengerNumberStart, String fName, String lName, double w, double lugg,int typecharge, int basefare, String ffc)
    {
       
        super(Economy.START_NUMBER, fName, lName, w, lugg, typecharge, basefare,ffc);       //gets properties from the PayingPassenger class but replaces the passengerNumberStart with the start number from Economy interface
    }
    
    /**
     * toString method to give passenger details
     */
    @Override
     public String toString()
     {
         String string = super.toString();
         string = string + " . This is an Economy Passenger.";      //inherits the toString from Payingpassenger and Overrides it adding what kind of paying passenger this is
         return string;
     }
      
}
