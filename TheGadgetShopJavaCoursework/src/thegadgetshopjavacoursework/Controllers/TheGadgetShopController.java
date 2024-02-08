package thegadgetshopjavacoursework.Controllers;

import java.util.ArrayList;
import java.util.List;
import thegadgetshopjavacoursework.Models.Gadget;

/**
 *
 * @author Emilio
 */
// Controller Class
// TheGadgetShopController class
public class TheGadgetShopController
{

    // Create a empty ArrayList to store Gadget objects
    private List<Gadget> gadgets = new ArrayList<>();

    // Method to add a gadget to the list
    public void addGadget(Gadget gadget)
    {
        gadgets.add(gadget);
    }

    // Method to display all gadget in the list
    public void displayAllGadgets()
    {
        System.out.println("========= DISPLAY ALL GADGETS =========");

        if (gadgets.isEmpty())
        {
            System.out.println("Sorry!. No Gadgets available to Add Calling Credit.");
        }

        for (Gadget gadget : gadgets)
        {
            gadget.display();
            System.out.println("");

        }
        System.out.println("=======================================");
    }

    public List<Gadget> getGadgets()
    {
        return gadgets;
    }

    public void setGadgets(List<Gadget> gadgets)
    {
        this.gadgets = gadgets;
    }

}
