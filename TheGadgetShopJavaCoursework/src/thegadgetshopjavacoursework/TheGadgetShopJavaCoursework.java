package thegadgetshopjavacoursework;

import java.nio.channels.GatheringByteChannel;
import thegadgetshopjavacoursework.Controllers.TheGadgetShopController;
import thegadgetshopjavacoursework.Views.GadgetShopViewGUI;
import thegadgetshopjavacoursework.Views.GadgetShopViewMain;
import thegadgetshopjavacoursework.Views.GadgetShopViewPrompt;

/**
 *
 * @author Emilio
 */
public class TheGadgetShopJavaCoursework
{

    public static void main(String[] args)
    {
        
        GadgetShopViewGUI shopViewGUI = new GadgetShopViewGUI();
        shopViewGUI.setVisible(true);
        shopViewGUI.setLocationRelativeTo(null);

//        GadgetShopViewMain gadgetShopViewMain = new GadgetShopViewMain();
//        gadgetShopViewMain.setVisible(true);
//        gadgetShopViewMain.setLocationRelativeTo(null);

    }

}
