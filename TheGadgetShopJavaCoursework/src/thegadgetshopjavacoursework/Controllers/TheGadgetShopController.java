package thegadgetshopjavacoursework.Controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import thegadgetshopjavacoursework.Models.Gadget;
import thegadgetshopjavacoursework.Models.Mobile;

/**
 *
 * @author Emilio
 */
// Controller Class
// TheGadgetShopController class
public class TheGadgetShopController
{

    // Create a empty ArrayList to store Gadget objects
    private List<Gadget> gadgets;

    public TheGadgetShopController()
    {
        gadgets = new ArrayList<>();

    }

    public List<Gadget> getGadgets()
    {
        return gadgets;
    }

    public void setGadgets(List<Gadget> gadgets)
    {
        this.gadgets = gadgets;
    }

    // Method to add a gadget to the list
    public void addGadget(Gadget gadget)
    {
        gadgets.add(gadget);
    }

    // Method to display all gadget in the list
    public void displayAllGadgets()
    {

        System.out.println("============= DISPLAY ALL GADGETS ==============");

        if (gadgets.isEmpty())
        {
            System.out.println("Sorry!. No Gadgets available to Add Calling Credit.");
        }

        for (int i = 0; i < gadgets.size(); i++)
        {
             System.out.println("  Id: " + (i+1)  + " \n " + gadgets.get(i).display());
            System.out.println(""); 
        }
        System.out.println("================================================");

    }

    public String makeCallFromMobile(int mobileId, int phoneNumber, int duration)
    {

        try
        {
            if (mobileId >= 1 && mobileId <= gadgets.size() && gadgets.get(mobileId - 1) instanceof Mobile)
            {
                var resultMakeCall = ((Mobile) gadgets.get(mobileId - 1)).mobileMakeCall(phoneNumber, duration);
                 
                if (resultMakeCall)
                {
                    return ((Mobile) gadgets.get(mobileId - 1)).display();

                }

                return null;

            }
            else
            {
                throw new IndexOutOfBoundsException();
            }
        }
        catch (IndexOutOfBoundsException | InputMismatchException e)
        {
            throw new Error("Error: Invalid Choice. Please Enter a Valid Number On The List." + e.getMessage());
        }
    }

}
