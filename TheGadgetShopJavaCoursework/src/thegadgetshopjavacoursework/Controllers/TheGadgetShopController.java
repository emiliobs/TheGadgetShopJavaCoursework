package thegadgetshopjavacoursework.Controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JOptionPane;

import thegadgetshopjavacoursework.Models.Gadget;

import thegadgetshopjavacoursework.Models.Mobile;

/**
 * Controller class responsible for managing gadgets within the Gadget Shop
 * application. TheGadgetShopController class provides methods to add gadgets to
 * a list, retrieve the list of gadgets, and display all gadgets in the list.
 *
 * This class serves as an intermediary between the user interface and the data
 * model, facilitating the management of gadgets.
 *
 * It contains functionality to interact with Gadget and Mobile objects,
 * including adding gadgets to a list and displaying all gadgets.
 *
 * @author Emilio
 */
public class TheGadgetShopController
{

    // Create an empty ArrayList to store Gadget objects
    private List<Gadget> gadgets;
    Gadget gadget;

    /**
     * Default constructor for creating a TheGadgetShopController object.
     * Initializes the gadgets list and a reference to a Gadget object.
     */
    public TheGadgetShopController()
    {
        gadgets = new ArrayList<>();
        gadget = new Gadget();
    }

    /**
     * Retrieves the list of gadgets.
     *
     * @return The list of gadgets.
     */
    public List<Gadget> getGadgets()
    {
        return gadgets;
    }

    /**
     * Sets the list of gadgets.
     *
     * @param gadgets The list of gadgets to set.
     */
    public void setGadgets(List<Gadget> gadgets)
    {
        this.gadgets = gadgets;
    }

    /**
     * Adds a gadget to the list of gadgets.
     *
     * @param gadget The gadget to add to the list.
     */
    public void addGadget(Gadget gadget)
    {
        gadgets.add(gadget);
    }

    /**
     * Displays all gadgets in the list. If the list is empty, it prints a
     * message indicating that no gadgets are available.
     */
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
}
