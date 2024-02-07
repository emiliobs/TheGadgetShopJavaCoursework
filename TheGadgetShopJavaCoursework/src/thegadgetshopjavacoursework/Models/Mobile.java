package thegadgetshopjavacoursework.Models;

/**
 *
 * @author Emilio
 */
public class Mobile extends Gadged
{

    private int numberOfMinutesOfCallingCreditRemaining;

    public Mobile()
    {
    }

    public Mobile(int numberOfMinutesOfCallingCreditRemaining)
    {
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
    }

    public Mobile(int numberOfMinutesOfCallingCreditRemaining, String model, double price, int weight, String size)
    {
        super(model, price, weight, size);
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
    }

    public int getNumberOfMinutesOfCallingCreditRemaining()
    {
        return numberOfMinutesOfCallingCreditRemaining;
    }

    public void setNumberOfMinutesOfCallingCreditRemaining(int numberOfMinutesOfCallingCreditRemaining)
    {
        this.numberOfMinutesOfCallingCreditRemaining = numberOfMinutesOfCallingCreditRemaining;
    }

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
    
      @Override
        public void display()
        {
            super.display();
            System.out.println("Calling Credit: " + numberOfMinutesOfCallingCreditRemaining + " minutes");
        }
    
}
