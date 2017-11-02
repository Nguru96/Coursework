import javax.swing.*;

/**
 * Nguru Ian Davis
 * 15059844
 */
public class BookingAdmin
{
    private static Aircraft aircraft = new Aircraft();      //crates an new Aircraft instance
    private static String comms = "C";      //sets the 

    /**
     * Method that generates the class default input JOptionPane
     */
    public static String displayMenu(String [] option, String message)
    {
        String selection = (String) JOptionPane.showInputDialog(null, message, "Select an option", JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
        return selection;
    }

    /**
     * Main method to run the program
     */
    public static void main(String[] args)
    {
        BookingAdmin admin = new BookingAdmin();
        admin.mainMenu();

    }

    /**
     * Main Menu Method
     */
    public void mainMenu()
    {
        String [] userSelect = new  String[2];
        userSelect[0] = "Setup Admin";
        userSelect[1] = "Booker";
        String y = displayMenu(userSelect, "Select type of user =) or\nPress 'Cancel' to exit");

        if(y == null)
        {
            System.out.println("Exiting...");
            System.exit(1);

        }else if(y.equals(userSelect[0]))
        {
            setupAdmin();

        }else if(y.equals(userSelect[1]))
        {
            booker();

        }else
        {
            System.out.println("\nExiting...");
            System.exit(1);

        }
    }

    /**
     * Setup Admin method
     */
    private void setupAdmin()
    {
        while(comms.equalsIgnoreCase("C"))
        {
            String [] adminOptions = new  String[9];

            adminOptions[0] = "Set flight destination";
            adminOptions[1] = "Add Passenger";
            adminOptions[2] = "Find Passenger";
            adminOptions[3] = "Remove Passenger";
            adminOptions[4] = "Show Revenue";
            adminOptions[5] = "Show Weight";
            adminOptions[6] = "Show Passengers";
            adminOptions[7] = "Show First Class Passengers";
            adminOptions[8] = "Exit";

            String y = displayMenu(adminOptions, "Select an option\n N.B Make sure to set the flight route first before proceeding");

            if(y == null)       //if the user does not enter an option the program should open the main menu 
            {

                mainMenu();

            }else if(y.equals(adminOptions[0]))
            {

                setRouteDetails();

            }else if(y.equals(adminOptions[1]))
            {

                passengerTypeSelect();

            }else if(y.equals(adminOptions[2]))
            {

                findPassenger();

            }else if(y.equals(adminOptions[3]))
            {
                removePassenger();

            }else if(y.equals(adminOptions[4]))
            {

                System.out.println("Generated Revenue: £" + aircraft.getRevenue());
            }else if(y.equals(adminOptions[5]))
            {

                System.out.println("Total passenger weight: " + aircraft.getTotalPassengerWeight() + " Kgs.");

            }else if(y.equals(adminOptions[6]))
            {
                aircraft.listPassengers();
                //System.out.println(aircraft.toString());      //to be used to see the flight details

            }else if(y.equals(adminOptions[7]))
            {
                aircraft.listFirstClassPassengers();
                //System.out.println(aircraft.toString());      //to be used to see the flight details

            }else if(y.equals(adminOptions[8]))
            {
                System.out.println("Exiting...");
                System.exit(1);

            }else
            {
                System.out.println("\nExiting...");
                System.exit(1);
            }

            comms = JOptionPane.showInputDialog("Type 'C' to continue, or anything else to exit");
            if(comms != null)
            {
                comms = comms;
            }else
            {
                System.out.println("\nExiting...");
                System.exit(1);
            }

        }
    }

    /**
     * Booker method 
     */
    private void booker()
    {        
        while(comms.equalsIgnoreCase("C"))
        {
            String [] options = new  String[4];

            options[0] = "Show Aircraft Route Details (Aircraft has to be set up by Admin first)";
            options[1] = "Add Passenger";
            options[2] = "Show Number of Passengers";
            options[3] = "Show Weight of Passengers Currently Booked";

            String y = displayMenu(options, "Select an option");

            if(y == null)
            {
                mainMenu();
            }else if(y.equals(options[0]))
            {
                System.out.println("Route: " + aircraft.getRoute()); 
                System.out.println("Maximum Passenger weight: " + aircraft.getMaxWeight() + " Kgs."); 
                System.out.println("Maximum Passenger Number: " + aircraft.getMaxPassengers()); 

            }else if(y.equals(options[1]))
            {
                selectPayingpassengerType();

            }else if(y.equals(options[2]))
            {
                aircraft.getNumberOfPassengers();      //booker should only be able to see the number of passengers but not the passenger names on the aircraft

            }else if(y.equals(options[3]))
            {
                System.out.println("Total passenger weight: " + aircraft.getTotalPassengerWeight() + " Kgs."); //booker should only be able to see the current passenger weight in order to see if they can add another passenger onto the aircraft
            }else
            {
                System.out.println("\nExiting...");
                System.exit(1);
            }

            comms = JOptionPane.showInputDialog("Type 'C' to continue, or anything else to exit");
            if(comms != null)
            {
                comms = comms;
            }else
            {
                System.out.println("\nExiting...");
                System.exit(1);
            }
        }  
    }

    /**
     * Method to set the aircraft route, max weight and max number of passengers allowed on board
     */
    public boolean setRouteDetails()
    {
        String [] route = new  String[5];
        route[0] = "Glasgow";
        route[1] =  "Cape Town";
        String y = displayMenu(route, "Enter the route this plane will be travelling to...");
        if(y == null)
        {
            // JOptionPane.showMessageDialog(null, "No Option Selected", "Selection Error", 0, null);
            // setupAdmin();
            JOptionPane.showMessageDialog(null, "Please input the right data", "No Option Selected", 0, null);
            setRouteDetails();
        }
        else if(y.equals(route[0]))
        {
            aircraft.setRoute(Route.GLASGOW);
            aircraft.setMaxPassengers(Route.GLASGOW_MAX_PASSENGERS);
            aircraft.setMaxWeight(Route.GLASGOW_MAXIMUM_WEIGHT);
        }else if(y.equals(route[1]))
        {
            aircraft.setRoute(Route.CAPE_TOWN);
            aircraft.setMaxPassengers(Route.CAPE_TOWN_MAX_PASSENGERS);
            aircraft.setMaxWeight(Route.CAPE_TOWN_MAXIMUM_WEIGHT);
        }else
        {
            JOptionPane.showMessageDialog(null,  "Please input the right data", "No Option Selected", 0, null);
            setRouteDetails();
            return false;
        }
        return true;
    }

    /**
     * Method to select the type of passenger being added to the aircraft
     */
    public void passengerTypeSelect()
    {
        String [] addingOptions = new  String[2];
        addingOptions[0] = "Add Crew";
        addingOptions[1] = "Add Paying Passengers";

        String y = displayMenu(addingOptions, "Select type of passenger to be added");

        if(y == null)
        {
            JOptionPane.showMessageDialog(null, "No Option Selected", "Selection Error", 0, null);
            setupAdmin();

        }else if(y.equals(addingOptions[0]))
        {
            addPassengers();
        }else if(y.equals(addingOptions[1]))
        {
            selectPayingpassengerType();
        }else
        {
            System.out.println("\nExiting...");
        }
    }

    /**
     * Method to add crew members to the aircraft
     */
    public boolean addPassengers()
    {
        Passenger irie = new Crew(0, setFirstName(), setLastName(), setWeight(), setLuggage(), setCrew());
        aircraft.addPassenger(irie);
        return true;
    }

    /**
     * Method to add paying passengers to the aircraft
     */
    public void selectPayingpassengerType()
    {
        String [] passengerType = new  String[3];
        passengerType[0] = "Economy";
        passengerType[1] = "Business Class";
        passengerType[2] = "First Class";

        String y = displayMenu(passengerType, "Select type of paying passenger");

        if(y == null)
        {
            JOptionPane.showMessageDialog(null, "No Option Selected", "Selection Error", 0, null);
            selectPayingpassengerType();

        }else if(y.equals(passengerType[0]))
        {
            PayingPassenger irie = new EconomyPassenger(0, setFirstName(), setLastName(), setWeight(), setLuggage(), Economy.TYPE_CHARGE, getEconomyBaseFare(),"1254");
            aircraft.addPassenger(irie);

        }else if(y.equals(passengerType[1]))
        {
            PayingPassenger irie = new BusinessPassenger(0, setFirstName(), setLastName(), setWeight(), setLuggage(), BusinessClass.TYPE_CHARGE, getBusinessBaseFare(),"1254");
            aircraft.addPassenger(irie);

        }else if(y.equals(passengerType[2]))
        {
            PayingPassenger irie = new FirstClassPassenger(0, setFirstName(), setLastName(), setWeight(), setLuggage(), FirstClass.TYPE_CHARGE, getFirstBaseFare(),"1254", setAdditionalLuggage());
            aircraft.addPassenger(irie);

        }else
        {
            System.out.println("\nExiting...");

        }
    }

    // public boolean addPassengers(int z)
    // {

    // z = 0;
    // PayingPassenger irie = new EconomyPassenger(z, setFirstName(), setLastName(), setWeight(), setLuggage(), Economy.TYPE_CHARGE, getBaseFare());
    // aircraft.addPassenger(irie);
    // return true;
    // }

    public double setAdditionalLuggage()
    {
        String input = JOptionPane.showInputDialog("Enter First Class Passenger additional luggage weight.");
        Double nextDouble = Double.parseDouble(input);
        return nextDouble;   
    }
    
    /**
     * Method to find passenger in the aircraft by passing in the passegerNumber
     */
    public void findPassenger()
    {
        String input = JOptionPane.showInputDialog("Enter passenger number you wish to find.");
        Integer nextInt = Integer.parseInt(input);
        aircraft.findPassenger(nextInt);
    }

    /**
     * Method to remove passenger from the aircraft by passing in the passegerNumber
     */
    public void removePassenger()
    {
        String input = JOptionPane.showInputDialog("Enter passenger number you wish to remove from flight.");
        Integer nextInt = Integer.parseInt(input);
        aircraft.removePassenger(nextInt);
    }

    /**
     * Method to set the first Name 
     */
    public String setFirstName()
    {
        String fname = JOptionPane.showInputDialog("Enter first name.");
        return fname;
    }

    /**
     * Method to set the last Name 
     */
    public String setLastName()
    {
        String lname = JOptionPane.showInputDialog("Enter last name.");
        return lname;
    }

    /**
     * Method to set the passenger luggage weight 
     */
    public double setLuggage()
    {
        String luggage = JOptionPane.showInputDialog("Enter luggage weight.");
        double lugg = Double.parseDouble(luggage);
        return lugg;
    }

    /**
     * Method to set the passenger weight 
     */
    public double setWeight()
    {
        String passWeight = JOptionPane.showInputDialog("Enter passenger weight.");
        double weight = Double.parseDouble(passWeight);
        return weight;
    }

    /**
     * Method to set the crew type
     */
    public String setCrew()
    {
        String [] crewType = new String[3];
        crewType[0] = "Captain";
        crewType[1] = "First Officer";
        crewType[2] = "Cabin Crew";

        String y = displayMenu(crewType, "Select Crew Position");

        if(y == null)
        {
            JOptionPane.showMessageDialog(null, "No Option Selected", "Selection Error", 0, null);
            setupAdmin();

        }else if(y.equals(crewType[0]))
        {
            return "Captain";
        }else if(y.equals(crewType[1]))
        {
            return "First Officer";
        }else if(y.equals(crewType[2]))
        {
            return "Cabin Crew";
        }else
        {
            System.out.println("\nExiting...");
        }

        String crew = y;
        return crew;
    }

    /**
     * Method to get the base fare of Economy type passenger
     */
    public int getEconomyBaseFare()
    {
        String x = aircraft.getRoute();
        if(x.equalsIgnoreCase("Glasgow"))
        {
            return Economy.GLASGOW_BASE_FARE;
        }
        return Economy.CAPETOWN_BASE_FARE;
    }

    /**
     * Method to get the base fare of Business Class type passenger
     */
    public int getBusinessBaseFare()
    {
        String x = aircraft.getRoute();
        if(x.equalsIgnoreCase("Glasgow"))
        {
            return BusinessClass.GLASGOW_BASE_FARE;
        }
        return BusinessClass.CAPETOWN_BASE_FARE;
    }

    /**
     * Method to get the base fare of First Class type passenger
     */
    public int getFirstBaseFare()
    {
        String x = aircraft.getRoute();
        if(x.equalsIgnoreCase("Glasgow"))
        {
            return FirstClass.GLASGOW_BASE_FARE;
        }
        return FirstClass.CAPETOWN_BASE_FARE;
    }

    
}
