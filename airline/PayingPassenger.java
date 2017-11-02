
/**
 * Nguru Ian Davis
 * 15059844
 */
public abstract class PayingPassenger extends Passenger implements Chargeable
{
    private double baseFare;
    private double typeCharge;
    private final String  FFC;
    /**
     * Constructor for the abstract class that will be used by concrete classes that inherit from it.
     */
    public PayingPassenger(int passengerNumberStart, String fName, String lName, double w, double lugg, int typecharge, int basefare, String ffc)
    {
        super(passengerNumberStart, fName, lName, w, lugg);
        baseFare = basefare;
        typeCharge = typecharge;
        FFC = "FF" + ffc;
    }
    
    /**
     * Method to calculate the passengers fare for the flight
     */
    public  double getCharge()
    {
        double fare = baseFare + (super.getWeight() * typeCharge);
        return fare;
    }
    
//     /**
//      * Method to set the Frequent Flyer Code
//      */
//     public String setFFC(String ffc)
//     {
//         
//         FFC = "FF" + ffc;
//        
//     }
    
    public String getFFC()
    {
        return FFC;
    }
    
    /**
     * toString method that prints out the the passenger's details
     */
        @Override
    public String toString()
    {
        String string = super.toString();
        return string + " Fare: £" + getCharge()  + " Frequent Flyer Code: " +  getFFC();            
    }

}
