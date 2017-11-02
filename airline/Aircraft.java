import java.util.*;
/**
 * Nguru Ian Davis
 * 15059844
 */
public class Aircraft implements Route
{
    private double totalPassengerWeight;
    private double revenue;
    private int maxPassengers;
    private double maxWeight;
    private static  String route;
    private int numberOfPassengers;

    private ArrayList<Passenger> PassengersList = new  ArrayList<Passenger>();      //an ArrayList that only takes objects of type Passenger i.e. any class that inherits from Passenger class

    private ArrayList<PayingPassenger> PayingPassengersList = new ArrayList<PayingPassenger>();     //an ArrayList that only takes objects of type PayingPassenger i.e. any class that inherits from PayingPassenger class but not Passenger class

    /**
     * Constructor to create an Aircraft object
     */
    public Aircraft(String route, int maxPassengers, double maxWeight)
    {
        this.maxPassengers = maxPassengers;
        this.maxWeight = maxWeight;
        this.route = route;
        System.out.println(qJet());     //everytime an aircraft is created, this string is printed out
    }

    /**
     * Constructor to create an Aircraft object that takes no parameters
     */
    public Aircraft()
    {

        System.out.println(qJet());
    }

    /**
     * Method that prints out company slogan everytime an object is created
     */
    public String qJet()
    {
        return "\t \t \t QUEASY JET. \n \t The less you weigh, the less you pay\u00A9" + "\n";
    }

    /**
     * Method that adds a Passenger type object to an ArrayList 
     */
    public boolean addPassenger(Passenger newPassenger)
    {
        double tempWeight = (getTotalPassengerWeight() + newPassenger.getWeight());     //gets the current total passenger weight together with the passenger to be added
        int tempPassengers = getNumberOfPassengers();       //gets the number of passengers currently on the aircraft 
        tempPassengers++;       //adds the new passenger to be added to the temporary number of passengers
        if((tempWeight <= maxWeight) && (tempPassengers <= maxPassengers))  //checks if the temporary weight and number of passengers does not exceed the maximum for the aircraft
        {
            totalPassengerWeight = getTotalPassengerWeight() + newPassenger.getWeight(); //adds the new passengers weight to the old total passenger weight
            PassengersList.add(newPassenger);
            System.out.println(newPassenger.toString());
            // System.out.println(" passengers weight" + newPassenger.getWeight());
            // System.out.println("max passengers " + getMaxPassengers());
            // System.out.println("max weight " + getMaxWeight());
            // System.out.println("temp passenger weight " + getTotalPassengerWeight());         //to be used to debug

            return true;
        }        
        else
        {
            System.out.println("Sorry, the crew member: " + newPassenger.getPassNum() + " " +newPassenger.getLastName() + " can't be added to the plane =(");
            return false;
        }
    }

    /**
     * Overloaded method that adds a PayingPassenger type object to an ArrayList 
     */
    public boolean addPassenger(PayingPassenger newPassenger)
    {
        double tempWeight = (getTotalPassengerWeight() + newPassenger.getWeight());     //gets the current total passenger weight together with the passenger to be added
        int tempPassengers = getNumberOfPassengers();       //gets the number of passengers currently on the aircraft 
        tempPassengers++;       //adds the new passenger to be added to the temporary number of passengers
        if((tempWeight <= maxWeight) && (tempPassengers <= maxPassengers))  //checks if the temporary weight and number of passengers does not exceed the maximum for the aircraft
        {
            totalPassengerWeight = getTotalPassengerWeight() + newPassenger.getWeight(); //adds the new passengers weight to the old total passenger weight
            PassengersList.add(newPassenger);
            PayingPassengersList.add(newPassenger); 
            System.out.println(newPassenger.toString());
            // System.out.println(" passengers weight" + newPassenger.getWeight());
            // System.out.println("max passengers " + getMaxPassengers());
            // System.out.println("max weight " + getMaxWeight());
            // System.out.println("temp passenger weight " + getTotalPassengerWeight());         //to be used to debug

            return true;
        }        
        else
        {

            System.out.println("Sorry, the passenger: " + newPassenger.getPassNum() + " " +newPassenger.getLastName() + " can't be added to the plane =(" + "\n" +
                "It may be because the plane is overloaded or the maximum number of passengers has been reached \n ");
            return false;
        }        
    }

    /**
     * Method that removes a passenger from an aircraft when the passenger number is passed in
     */
    public Boolean removePassenger(int removePassengerNumber)
    {
        for(int i = 0; i < PassengersList.size(); i++)
        {
            Passenger temp = PassengersList.get(i);
            if(removePassengerNumber == temp.getPassNum())
            {
                PassengersList.remove(i);
                System.out.println("Passenger " + temp.getLastName() + " " + temp.getPassNum() + " successfully removed");
            }
            //removes crew if found in the ArrayList and also a paying passenger from the list
        }
        for(int i = 0; i < PayingPassengersList.size(); i++)
        {
            PayingPassenger temp = PayingPassengersList.get(i);
            if(removePassengerNumber == temp.getPassNum())
            {
                PayingPassengersList.remove(i);
            }
            //removes a paying passenger from the ArrayList so that the revenue can be calculated correctly
        }
        return false;
    }

    /**
     * Method to be used to list all passengers that are in the aircraft
     */
    public boolean listPassengers()
    {
        System.out.println("The passengers on this aircraft are: ");
        /*
         * Goes through the arraylist printing out all the elements that are found
         */
        for(Passenger i: PassengersList)
        {
            //if(i instanceof FirstClassPassenger)
            System.out.println(i.toString());

        }

        return false;
    }

     /**
     * Method to be used to list all passengers that are in the aircraft
     */
    public boolean listFirstClassPassengers()
    {
        System.out.println("The First Class passengers on this aircraft are: ");
        /*
         * Goes through the arraylist printing out all the elements that are found
         */
        for(Passenger i: PassengersList)
        {
            if(i instanceof FirstClassPassenger)
            System.out.println(i.toString());

        }

        return false;
    }
    /**
     * Method to be used to find passengers in the aircraft.
     */
    public Boolean findPassenger(int find)
    {
        for(int i = 0; i < PassengersList.size(); i++)
        {
            Passenger temp = PassengersList.get(i);
            if(find == temp.getPassNum())
            {
                System.out.println("Passenger found");        //to be used to debug
                System.out.println(temp.toString());
                return true;
            }
        }
        //doesnt need to check the paying passengers arraylist because if a pssenger is in the passengers liast then they are automatically in both
        return null;
    }

    /**
     * Method that gets the total revenue that is generated by the aircraft
     */
    public double getRevenue()
    {
        revenue = 0;        //initialise the value to 0 otherwise it will give wrong values. (adds the old revenue value to the current one)
        for(int i = 0; i< PayingPassengersList.size(); i++)
        {
            PayingPassenger temp = PayingPassengersList.get(i);
            revenue = revenue + temp.getCharge();
            //System.out.println("current revenue is " + revenue);      //to be used to debug
        }
        return revenue;
    }

    /**
     * Method to be used to set the aircrafts route
     */
    public void setRoute(String route)
    {
        this.route = route;
    }

    /**
     * Method to be used to set the aircrafts allowed maximum passengers
     */
    public void setMaxPassengers(int maxpassengers)
    {
        maxPassengers = maxpassengers;
    }

    /**
     * Method to be used to set the aircrafts allowed maximum weight
     */
    public void setMaxWeight(double maxweight)
    {
        maxWeight = maxweight;
    }

    /**
     * Method to be used to get the aircrafts current maximum passengers
     */
    public int getMaxPassengers()
    {
        return maxPassengers;
    }

    /**
     * Method to be used to get the aircrafts current maximum weight
     */
    public double getMaxWeight()
    {
        return maxWeight;
    }
    
    /**
     * Method to be used to get the aircrafts current route
     */
    public String getRoute()
    {
        return route;
    }

    /**
     * Method to get the number of passengers in the aircraft(Crew and paying passengers)
     */
    public int getNumberOfPassengers()
    {
        numberOfPassengers = PassengersList.size();
        return numberOfPassengers;
    }

    /**
     * Method to get the total passenger weight currently on the aircraft 
     */
    public double getTotalPassengerWeight()
    {
        totalPassengerWeight = 0;
        for(Passenger i: PassengersList)
        {
            totalPassengerWeight = totalPassengerWeight + i.getWeight();
        }
        return totalPassengerWeight;
    }

    /**
     * toString to return the aircraft details
     */
    @Override
    public String toString()
    {
        return "Route: " + getRoute() + ".\n" +
        "Maximum Number of Passengers: " + getMaxPassengers() + ".\n" + 
        "Mamimum Weight: " + getMaxWeight() + " Kgs.\n" + 
        "Number of Passengers On Board: " + getNumberOfPassengers() + ".\n" + 
        "Total Passenger Weight: " + getTotalPassengerWeight() + " Kgs." + "\n" +
        "Generated Revenue: £" + getRevenue();
    }   

    /*
     * This method is to be used to check if the PayingPassengers arraylist is being updated properly
     */

    public boolean listPayingPassengers()
    {
        System.out.println("The paying passengers on this aircraft are: ");
        for(Passenger i: PayingPassengersList)
        {

            System.out.println(i.toString());

        }
        return false;
    }   

}
