
/**
 * Write a description of class FirstClassPassenger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstClassPassenger extends PayingPassenger implements FirstClass
{
    private static double additionalLuggage;
    public FirstClassPassenger(int passengerNumberStart, String fName, String lName, double w, double lugg, int typecharge, int basefare, String ffc, double additionalLugg)
    {

        super(FirstClass.START_NUMBER, fName, lName, w, lugg, typecharge, basefare,ffc);
       
        additionalLuggage = 0;
        additionalLuggage = additionalLugg;
        setWeight();
    }
    
    public  static void setAdditionalLuggage(double addLugg)
    {
        additionalLuggage = addLugg;
        
    }
    
    public double getAdditionalLuggage()
    {
        return additionalLuggage;
    }
    
    /**
     * Method that set setWeight() method in Passenger Class adding the additioinal luggage weight
     */
    
    
     public void setWeight()
    {
        double newWeight =  super.getWeight() + getAdditionalLuggage();
        super.setWeight(newWeight);
    }
    
    @Override
     public String toString()
     {
         String string = super.toString();
         string = string + " . This is a First Class Passenger.";
         return string;
     }
}
