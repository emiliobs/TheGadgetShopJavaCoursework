package thegadgetshopjavacoursework.Controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Pattern;
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

        for (Gadget gadget : gadgets)
        {
            System.out.println(gadget.display());
            System.out.println("");

        }
        System.out.println("================================================");
    }

   

    public String makeCallFromMobile(String mobileId, String phoneNumber, String duration)
    {
        int mobileID = Integer.parseInt(mobileId);
        int NumberPhone = Integer.parseInt(phoneNumber);
        int callDuration = Integer.parseInt(duration);

     
        try
        {
            if (mobileID >= 1 && mobileID <= gadgets.size() && gadgets.get(mobileID - 1) instanceof Mobile)
            {
                var resultMakeCall = ((Mobile) gadgets.get(mobileID - 1)).mobileMakeCall(NumberPhone, callDuration);

                if (!resultMakeCall)
                {
                    return null;
                }

                return ((Mobile) gadgets.get(mobileID - 1)).display();
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
