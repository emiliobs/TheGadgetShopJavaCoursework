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
        System.out.println("----- Showing All Gadgets ----- ");

        if (gadgets.isEmpty())
        {
            System.out.println("Sorry!. No Gadgets available to Add Calling Credit.");
        }

        for (Gadget gadget : gadgets)
        {
            gadget.display();
            System.out.println("");
        }
        System.out.println("-------------------------------");
    }
    
    
//    public void addCallingCredit( int gadgetId)
//    {
//        if (gadgets.isEmpty())
//        {
//            System.out.println("");
//            System.out.println("Sorry!. No Gadgets Available to Add Calling Credit.");
//        }
//        
//        System.out.println("");
//        System.out.println("\nAdding Calling Credit to Mobile.");
//       
//        
//        for (Gadget gadget : gadgets)
//        {
//            try
//            {
//                System.out.println("I am in......");
//            }
//            catch (Exception e)
//            {
//            }
//    
//        }
   // }

    public List<Gadget> getGadgets()
    {
        return gadgets;
    }

    public void setGadgets(List<Gadget> gadgets)
    {
        this.gadgets = gadgets;
    }

}
