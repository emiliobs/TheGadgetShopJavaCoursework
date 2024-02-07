package thegadgetshopjavacoursework.Controllers;

import java.util.AbstractList;
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
     List<Gadget> gadgets = new ArrayList<>();
     
     // Method to add a gadget to the list
     public void addGadget(Gadget gadget)
     {
         gadgets.add(gadget);
     }
     
     // Method to display all gadget in the list
     public  void displayAllGadgets()
     {
         for (Gadget gadget : gadgets)
         {
             gadget.display();
             System.out.println("");
         }
     }
     
}
