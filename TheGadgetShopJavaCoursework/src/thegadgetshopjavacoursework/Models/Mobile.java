package thegadgetshopjavacoursework.Models;

/**
 *
 * @author Emilio
 */

// Subclass Mobile inheriting from Gadget
public class Mobile extends Gadget
{

    private int numberOfMinutesOfCallingCreditRemaining;

    // Constructor empty
    public Mobile()
    {
    }

    // Constructor to initialize Mobile attribute
    public Mobile(int numberOfMinutesOfCallingCreditRemaining)
    {
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
    }

    // Constructor to initialize Mobile attribute and Gatged attributes
    public Mobile(int numberOfMinutesOfCallingCreditRemaining, String model, double price, int weight, String size)
    {
        super(model, price, weight, size);
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
    }

    // Accesor mehtod for numberOfMinutesOfCallingCreditRemaining
    public int getNumberOfMinutesOfCallingCreditRemaining()
    {
        return numberOfMinutesOfCallingCreditRemaining;
    }

    public void setNumberOfMinutesOfCallingCreditRemaining(int numberOfMinutesOfCallingCreditRemaining)
    {
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
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
            System.out.println("Please enter a positive amount for adding credit.");
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
            System.out.println("Calling Credit: " + numberOfMinutesOfCallingCreditRemaining + " minutes");
        }
    
}
