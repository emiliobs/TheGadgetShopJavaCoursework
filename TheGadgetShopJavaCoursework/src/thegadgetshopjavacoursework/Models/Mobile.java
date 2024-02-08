package thegadgetshopjavacoursework.Models;

import thegadgetshopjavacoursework.Controllers.TheGadgetShopController;

/**
 *
 * @author Emilio
 */
// Subclass Mobile inheriting from Gadget
public class Mobile extends Gadget
{

    private static int mobileCounter = 1;

    //private int mobileId;
    private int numberOfMinutesOfCallingCreditRemaining;

    // Constructor empty
    public Mobile()
    {
        //this.mobileId = mobileCounter++;
    }

    // Constructor to initialize Mobile attribute
    public Mobile(int numberOfMinutesOfCallingCreditRemaining)
    {
        
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
    }

    // Constructor to initialize Mobile attribute and Gatged attributes
    public Mobile(int numberOfMinutesOfCallingCreditRemaining, int gadgetId, String model, double price, int weight, String size)
    {
        super(gadgetId, model, price, weight, size);
        
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
    }

    // Accesor mehtod for numberOfMinutesOfCallingCreditRemaining

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
            // this.numberOfMinutesOfCallingCreditRemaining = 0;

        }

    }

    // Mehtod to add calling credit
    public void addCallingCredit(int credit)
    {
        if (credit > 0)
        {
            numberOfMinutesOfCallingCreditRemaining += credit;

        }
        else
        {
            System.out.println("");
            System.out.println("***** - Sorry!. Please enter a positive amount for adding credit. - *****");
        }
    }

    // Mehtod to make a call
    public void mobileMakeCall(String phoneNumber, int duration)
    {
        if (numberOfMinutesOfCallingCreditRemaining >= duration)
        {
            System.out.println("Calling " + phoneNumber + " for " + duration + " minutes.");
            numberOfMinutesOfCallingCreditRemaining -= duration;
        }
        else
        {
            System.out.println("Insufficient credit to make the call.");
        }
    }

    // Override display mehtod to include calling credit
    @Override
    public void display()
    {
        super.display();
        System.out.println("Calling Credit: " + getNumberOfMinutesOfCallingCreditRemaining() + " Minutes");
    }

}
