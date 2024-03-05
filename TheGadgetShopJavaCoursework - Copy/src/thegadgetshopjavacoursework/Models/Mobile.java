package thegadgetshopjavacoursework.Models;

/**
 * Subclass Mobile inheriting from Gadget. Represents a mobile device with
 * additional functionality such as calling credit management. Extends the
 * functionality of the Gadget class.
 *
 * Mobile objects are used to represent mobile devices within the Gadget Shop
 * application. They inherit attributes and methods from the Gadget class.
 *
 * @author Emilio
 */
public class Mobile extends Gadget
{

    private int numberOfMinutesOfCallingCreditRemaining; // Number of calling credit minutes remaining

    // Constructors
    /**
     * Default constructor for creating a Mobile object. Initializes the object
     * with default values.
     */
    public Mobile()
    {

    }

    /**
     * Constructor for initializing Mobile attributes and Gadget attributes with
     * specified values.
     *
     * @param numberOfMinutesOfCallingCreditRemaining Number of calling credit
     * minutes remaining
     * @param gadgetId Unique ID of the mobile gadget
     * @param model Model of the mobile gadget
     * @param price Price of the mobile gadget
     * @param weight Weight of the mobile gadget
     * @param size Size of the mobile gadget
     */
    public Mobile(int numberOfMinutesOfCallingCreditRemaining, int gadgetId, String model, double price, int weight, String size)
    {
        // Call the constructor of the superclass (Gadget) with specified parameters
        super(gadgetId, model, price, weight, size);
        
        // Initialize the numberOfMinutesOfCallingCreditRemaining attribute with the provided value
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
    }

    /**
     * Constructor for initializing only Mobile attributes with specified
     * values.
     *
     * @param numberOfMinutesOfCallingCreditRemaining Number of calling credit
     * minutes remaining
     */
    public Mobile(int numberOfMinutesOfCallingCreditRemaining)
    {
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
    }

    /**
     * Retrieves the remaining calling credit for the mobile device.
     *
     * @return The number of minutes of calling credit remaining.
     */
    public int getNumberOfMinutesOfCallingCreditRemaining()
    {
        // Return the current value of numberOfMinutesOfCallingCreditRemaining attribute
        return numberOfMinutesOfCallingCreditRemaining;
    }

    /**
     * Sets the remaining calling credit for the mobile device.
     *
     * @param numberOfMinutesOfCallingCreditRemaining The number of minutes of
     * calling credit remaining.
     */
    public void setNumberOfMinutesOfCallingCreditRemaining(int numberOfMinutesOfCallingCreditRemaining)
    {
        // Check if the provided number of minutes of calling credit remaining is non-negative
        if (numberOfMinutesOfCallingCreditRemaining >= 0)
        {
            // If it's non-negative, set the value of numberOfMinutesOfCallingCreditRemaining
            this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
        }
        else
        {
            // If it's negative, print an error message
            System.out.println("");
            System.out.println("***** - Sorry!. Please enter a positive amount for adding credit. - *****");
        }
    }

    /**
     * Adds calling credit to the mobile device.
     *
     * @param credit The amount of calling credit to add.
     */
    public void addCallingCredit(int credit)
    {
        // Check if the credit amount is non-negative
        if (credit >= 0)
        {
            // If the credit amount is non-negative, add it to the remaining calling credit
            numberOfMinutesOfCallingCreditRemaining += credit;
        }
        else
        {
            // If the credit amount is negative, print an error message
            System.out.println("");
            System.out.println("***** - Sorry!. Please enter a positive amount for adding credit. - *****");
        }
    }

    /**
     * Simulates making a call from a mobile device.
     *
     * @param phoneNumber The phone number being called.
     * @param duration The duration of the call in minutes.
     * @return True if the call can be made (sufficient calling credit), false
     * otherwise.
     */
    public boolean mobileMakeCall(int phoneNumber, int duration)
    {
        // Check if there is sufficient calling credit remaining and if the duration is within the available credit
        if (numberOfMinutesOfCallingCreditRemaining != 0 && numberOfMinutesOfCallingCreditRemaining >= duration)
        {
            // Output information about the call to the console
            System.out.println("CALLING NUMBER: " + phoneNumber + " FOR " + duration + " MINUTES.");
            // Deduct the call duration from the remaining calling credit
            numberOfMinutesOfCallingCreditRemaining -= duration;
            // Return true indicating the call was successful
            return true;
        }
        else
        {
            // Return false indicating the call cannot be made due to insufficient calling credit
            return false;
        }
    }

    /**
     * Overrides the display method to include information about the remaining
     * calling credit.
     *
     * @return A string representation of the mobile device's information,
     * including the calling credit.
     */
    @Override
    public String display()
    {
        // Calls the display method of the superclass (presumably to display basic gadget information)
        // Concatenates information about the remaining calling credit to the returned string
        return super.display() + "\n " + " CALLING CREDIT: " + numberOfMinutesOfCallingCreditRemaining + " MINUTES.";

    }

}
