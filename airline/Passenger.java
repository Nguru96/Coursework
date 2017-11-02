
/**
 * Nguru Ian Davis
 * 15059844
 */
public abstract class Passenger implements Weighable
{
    private int passengerNumber;
    public static int ID_SEQUENCE = 0;
    private final String firstName;
    private final String lastName;
    private double weight;
    private double luggage;
    
    /**
     * Constructor for the abstract class that will be used by concrete classes that inherit from it
     */
    public Passenger(int passengerNumberStart, String fName, String lName, double w, double lugg)
    {
    	passengerNumber = passengerNumberStart + Passenger.ID_SEQUENCE; 
    	Passenger.ID_SEQUENCE++;
    	firstName = fName;    	
    	lastName = lName;
    	weight = w;
    	luggage = lugg;    	
    }
    
    
    /**
     * Sets the passenger weight
     */
    public  void setWeight(double weight)
    {
    	this.weight = weight;
    }
    
    /**
     * gets the weight of the passenger(Weight+luggage)
     */
    public double getWeight()
    {
    	return weight + luggage;
    }
    
    /**
     * sets the weight of the luggage
     */
    public void setLuggage(double luggW)
    {
    	luggage = luggW;
    }
    
    /**
     * gets the passengers first name
     */
    public String getFirstName()
    {
    	return firstName;
    }
    
    /**
     * gets the passengers last name
     */
    public String getLastName()
    {
    	return lastName;
    }
    
    /**
     * gets the passenger number
     */
    public int getPassNum()
    {
    	return passengerNumber;
    }
    
    /**
     * toString method that prints out the states that the class has
     */
    @Override
    public String toString()
    {
    	return "Passenger Number: " + getPassNum() + " Name: " + getLastName() 
    	+ " " + getFirstName() + " Weight: " + getWeight() + " Kgs";    			
    }
    
}
