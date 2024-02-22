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
        super(gadgetId, model, price, weight, size);
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

    // Accessor method for numberOfMinutesOfCallingCreditRemaining
    public int getNumberOfMinutesOfCallingCreditRemaining()
    {
        return numberOfMinutesOfCallingCreditRemaining;
    }

    public void setNumberOfMinutesOfCallingCreditRemaining(int numberOfMinutesOfCallingCreditRemaining)
    {
        if (numberOfMinutesOfCallingCreditRemaining >= 0)
        {
            this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
        }
        else
        {
            System.out.println("");
            System.out.println("***** - Sorry!. Please enter a positive amount for adding credit. - *****");
        }
    }

    // Method to add calling credit
    public void addCallingCredit(int credit)
    {
        if (credit >= 0)
        {
            numberOfMinutesOfCallingCreditRemaining += credit;
        }
        else
        {
            System.out.println("");
            System.out.println("***** - Sorry!. Please enter a positive amount for adding credit. - *****");
        }
    }

    // Method to make a call
    public boolean mobileMakeCall(int phoneNumber, int duration)
    {
        if (numberOfMinutesOfCallingCreditRemaining != 0 && numberOfMinutesOfCallingCreditRemaining >= duration)
        {
            System.out.println("CALLING NUMBER: " + phoneNumber + " FOR " + duration + " MINUTES.");
            numberOfMinutesOfCallingCreditRemaining -= duration;
            return true;
        }
        else
        {
            return false;
        }
    }

    // Override display method to include calling credit
    @Override
    public String display()
    {
        return super.display() + "\n " + " CALLING CREDIT: " + numberOfMinutesOfCallingCreditRemaining + " MINUTES.";
    }

}
