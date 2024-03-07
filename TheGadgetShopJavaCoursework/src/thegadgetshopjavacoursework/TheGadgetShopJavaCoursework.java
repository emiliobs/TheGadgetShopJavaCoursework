package thegadgetshopjavacoursework;

//import thegadgetshopjavacoursework.Views.GadgetShopViewMain;
import thegadgetshopjavacoursework.Views.GadgetShopViewMain;

/**
 * This class serves as the main entry point of the application. It creates an
 * instance of GadgetShopViewMain, sets its visibility to true, and centers it
 * on the screen.
 *
 * GadgetShopViewMain is the main view class of the application. It represents
 * the graphical user interface (GUI) of the Gadget Shop.
 *
 * @author Emilio
 */
public class TheGadgetShopJavaCoursework
{

    /**
     * The main method, which serves as the entry point of the application. It
     * creates an instance of GadgetShopViewMain, sets its visibility to true,
     * and centers it on the screen.
     *
     * @param args Command-line arguments (not used in this application)
     */
    public static void main(String[] args)
    {
        // Create an instance of GadgetShopViewMain
        GadgetShopViewMain gadgetShopViewMain = new GadgetShopViewMain();

        // Set the visibility of GadgetShopViewMain to true
        gadgetShopViewMain.setVisible(true);

        // Center the GadgetShopViewMain window on the screen
        gadgetShopViewMain.setLocationRelativeTo(null);
    }
}
