package thegadgetshopjavacoursework.Controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JOptionPane;

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
    Gadget gadget;

    public TheGadgetShopController()
    {
        gadgets = new ArrayList<>();
        gadget = new Gadget();

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

//        for (int i = 0; i < gadgets.size(); i++)
//        {
//            System.out.println("  Id: " + (i + 1) + " \n " + gadgets.get(i).display());
//            System.out.println("");
//        }
        System.out.println("================================================");

    }

}
