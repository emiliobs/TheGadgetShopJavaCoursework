package thegadgetshopjavacoursework.Views;

import java.util.InputMismatchException;
import java.util.Scanner;
import thegadgetshopjavacoursework.Controllers.TheGadgetShopController;
import thegadgetshopjavacoursework.Models.MP3;
import thegadgetshopjavacoursework.Models.Mobile;

/**
 *
 * @author Emilio
 */
// View Class
// GadgetShopViewPrompt class
public class GadgetShopViewPrompt
{

    private TheGadgetShopController gadgetShopController;
    private Scanner scanner;

    public GadgetShopViewPrompt(TheGadgetShopController gadgetShopController)
    {
        System.out.println("");
        System.out.println("#####  - WELCOME TO THE GADGET SHOP! - #####");
        this.gadgetShopController = gadgetShopController;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu()
    {

        System.out.println("");
        System.out.println("=======  Menu  =======");
        System.out.println("1. Add Mobile.");
        System.out.println("2. Add MP3 Player.");
        System.out.println("3. Display All Gadgets.");
        System.out.println("4. Exit.");
        System.out.println("=======================");

    }

    public void run()
    {
        int choice = -1;

        do
        {
            displayMenu();
            System.out.print("Enter your Choice: ");
            try
            {
                choice = scanner.nextInt();
                scanner.nextLine(); //Consume newline

                switch (choice)
                {
                    case 1:
                        addMobile();
                        break;
                    case 2:
                        addMP3Player();
                        break;
                    case 3:
                        displayAllGadgets();
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("##### Good Bye!. You leave the Program... #####");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        System.out.println("*****  - Sorry!: Invalid Choice. Please enter again. - *****");
                }

            }
            catch (InputMismatchException e)
            {
                System.out.println("");
                System.out.println("*****  - Sorry!. Invalid input. Please enter a number  -  *****");
                scanner.nextLine();
                choice = 0; // Rest choice to trigger menu redisplay
            }
        }
        while (choice != 4);
    }

    private void addMobile()
    {
        System.out.println("");
        System.out.println("----- Adding Mobile -----");
        System.out.print("Enter Mobil Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Size: ");
        String size = scanner.nextLine();
        System.out.print("Enter Calling Credit: ");
        int callingCredit = scanner.nextInt();
        System.out.println("-------------------------");
        Mobile mobile = new Mobile();
        mobile.setModel(model);
        mobile.setPrice(price);
        mobile.setWeight(weight);
        mobile.setSize(size);
        mobile.setNumberOfMinutesOfCallingCreditRemaining(callingCredit);

        System.out.println("");
        gadgetShopController.addGadget(mobile);
        System.out.println("##### Mobile Added Successfully! #####");
    }

    private void addMP3Player()
    {
        System.out.println("");
        System.out.println("----- Adding MP3 Player  -----");
        System.out.print("Enter MP3 Player Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine(); //Consume newline
        System.out.print("Enter Size: ");
        String size = scanner.nextLine();
        System.out.print("Enter Available Memory (in MB): ");
        int availableMemory = scanner.nextInt();
        System.out.print("--------------------------");

        MP3 mp3 = new MP3();
        mp3.setModel(model);
        mp3.setPrice(price);
        mp3.setWeight(weight);
        mp3.setSize(size);
        mp3.setAvailableMemory(availableMemory);

        System.out.println("");
        gadgetShopController.addGadget(mp3);
        System.out.println("##### MP3 Player Added Successfully! #####");

    }

    private void displayAllGadgets()
    {
        System.out.println("");
        gadgetShopController.displayAllGadgets();

    }

}
