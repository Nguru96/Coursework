
/**
 * Write a description of class BusinessPassenger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BusinessPassenger extends PayingPassenger implements BusinessClass
{
    public BusinessPassenger(int passengerNumberStart, String fName, String lName, double w, double lugg, int typecharge, int basefare, String ffc)
    {

        super(BusinessClass.START_NUMBER, fName, lName, w, lugg, typecharge, basefare,ffc);

    }
    
    @Override
     public String toString()
     {
         String string = super.toString();
         string = string + " . This is a Business Class Passenger.";
         return string;
     }
}
