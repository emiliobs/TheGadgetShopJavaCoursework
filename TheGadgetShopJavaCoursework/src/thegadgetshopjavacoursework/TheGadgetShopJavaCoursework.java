package thegadgetshopjavacoursework;

import thegadgetshopjavacoursework.Controllers.TheGadgetShopController;
import thegadgetshopjavacoursework.Views.GadgetShopViewGUI;
import thegadgetshopjavacoursework.Views.GadgetShopViewPrompt;

/**
 *
 * @author Emilio
 */
public class TheGadgetShopJavaCoursework
{

    public static void main(String[] args)
    {

         //This code is to display the program in the graphical user interface
//        GadgetShopViewGUI gadgetShop = new GadgetShopViewGUI();
//        gadgetShop.setVisible(true);
//        gadgetShop.setLocationRelativeTo(null);
        
        
//        // This code is to show the program in the command prompt
        TheGadgetShopController gadgetShopController = new TheGadgetShopController();
        GadgetShopViewPrompt viewPrompt = new GadgetShopViewPrompt(gadgetShopController);
        viewPrompt.run();
    }

}
