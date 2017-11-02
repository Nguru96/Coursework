/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Ian
 * This represents values for the test routes that the airline would fly.  
 * In a proper system this sort of information would most probably be in 
 * database but it would add a lot of complexity and it is something
 * that has not been covered.  
 */
public interface Route {
    /**
     * The values for an aircraft on the Cape Town route (long haul).
     */
    public static final String CAPE_TOWN = "Cape Town";
    public static final int CAPE_TOWN_MAX_PASSENGERS = 200;
    public static final double CAPE_TOWN_MAXIMUM_WEIGHT = 20000;
    /**
     * The values for an aircraft on the Glasgow route (short haul).
     */
    public static final String GLASGOW = "Glasgow";
    public static final int GLASGOW_MAX_PASSENGERS = 100;
    public static final double GLASGOW_MAXIMUM_WEIGHT = 10000;
    
}
