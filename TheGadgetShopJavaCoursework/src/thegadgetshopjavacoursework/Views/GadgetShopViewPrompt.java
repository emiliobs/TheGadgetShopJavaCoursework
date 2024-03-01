package thegadgetshopjavacoursework.Views;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import thegadgetshopjavacoursework.Controllers.TheGadgetShopController;
import thegadgetshopjavacoursework.Models.Gadget;
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

    // Constructor to initialize view with controller and scanner
    public GadgetShopViewPrompt()
    {
        // Display welcome message and information about the program
        System.out.println("");
        // Display welcome message and information about the program

        System.out.println("================================================");
        System.out.println("=                    WELCOME                   =");
        System.out.println("=                                              =");
        System.out.println("=                       TO                     =");
        System.out.println("=                                              =");
        System.out.println("=           COURSEWORK PROGRAMING JAVA         =");
        System.out.println("=                                              =");
        System.out.println("=                                              =");
        System.out.println("=                 THE GADGET SHOP!             =");
        System.out.println("=                                              =");
        System.out.println("=                       BY                     =");
        System.out.println("=                                              =");
        System.out.println("=             EMILIO BARRERA SEPULVEDA         =");
        System.out.println("=                    22047090                  =");
        System.out.println("=                                              =");
        System.out.println("=                 MET UNIVERSITY               =");
        System.out.println("=                     LONDON                   =");
        System.out.println("=                      2024                    =");
        System.out.println("================================================");

        // Initialize the gadget shop controller
        this.gadgetShopController = new TheGadgetShopController();
        // Initialize a Scanner object to read input from the command line
        this.scanner = new Scanner(System.in);
        System.out.println("");
    }

    // Method to display menu options
    public void displayMenu()
    {
        // Display the menu options
        System.out.println("");
        System.out.println("======================= MENU ===================");
        System.out.println("1. ADD MOBILE.                                 =");
        System.out.println("2. ADD MP3 PLAYER.                             =");
        System.out.println("3. DISPLAY ALL GADGETS.                        =");
        System.out.println("4. ADD CALLING CREDIT TO MOBILE.               =");
        System.out.println("5. MAKE CALL FROM MOBILE.                      =");
        System.out.println("6. DOWNLOAD MUSIC TO MP3 PLAYER.               =");
        System.out.println("7. DELETE MUSIC FROM MP3 PLAYER.               =");
        System.out.println("8. EXIT.                                       =");
        System.out.println("================================================");

    }

    /**
     * Main method to run the CLI interface of the gadget shop application. It
     * displays the menu, reads user input, and executes corresponding actions.
     */
    public void run()
    {
        int choice = -1; // Initialize choice with a non-exit value

        // Main loop to display menu and process user input
        do
        {
            displayMenu(); // Display the menu options
            System.out.print("Enter your Choice: "); // Prompt the user for input

            try
            {
                choice = scanner.nextInt(); // Read the user's choice
                scanner.nextLine(); // Consume newline character

                // Switch statement to perform actions based on user's choice
                switch (choice)
                {
                    case 1:
                        addMobile(); // Add mobile phone
                        break;
                    case 2:
                        addMP3Player(); // Add MP3 Player
                        break;
                    case 3:
                        displayAllGadgets(); // Display all gadgets
                        break;
                    case 4:
                        addCallingCredit(); // Add calling credit to mobile
                        break;
                    case 5:
                        makeCallFromMobile(); // Make a call from mobile
                        break;
                    case 6:
                        DownloadMusictoMP3Player(); // Download music to MP3 player
                        break;
                    case 7:
                        deleteMusicFromMP3Player(); // Delete music from MP3 player
                        break;
                    case 8:
                        // Display goodbye message and exit the application
                        System.out.println("================================================");
                        System.out.println("=                                              =");
                        System.out.println("=                                              =");
                        System.out.println("=                                              =");
                        System.out.println("=  THANK YOU! GOODBYE, EXITING THE SYSTEM :)  =");
                        System.out.println("=                                              =");
                        System.out.println("=                                              =");
                        System.out.println("=                                              =");
                        System.out.println("================================================");
                        System.exit(0); // Exit the application
                        break;
                    default:
                        // Display error message for invalid choice
                        System.out.println("***** - Sorry! Invalid Choice. Please enter again. - *****");
                }
            }
            catch (InputMismatchException e)
            {
                // Handle exception for non-integer input
                System.out.println("***** - Sorry! Invalid input. Please enter a number. - *****");
                scanner.nextLine(); // Consume invalid input
                choice = 0; // Reset choice to trigger menu redisplay
            }
        }
        while (choice != 8); // Continue until the user chooses to exit
    }

    /**
     * Method to add a mobile phone to the gadget shop.
     */
    private void addMobile()
    {
        // Display message to indicate adding a mobile
        System.out.println("");
        System.out.println("================ ADDING MOBILE =================");

        // Prompt user for mobile details
        System.out.print("Enter Mobile Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Size: ");
        String size = scanner.nextLine();
        System.out.print("Enter Calling Credit: ");
        int callingCredit = scanner.nextInt();

        // Create a new Mobile object
        Mobile mobile = new Mobile();
        // Set the attributes of the mobile object
        mobile.setModel(model);
        mobile.setPrice(price);
        mobile.setWeight(weight);
        mobile.setSize(size);

        // Set the calling credit for the mobile
        if (callingCredit >= 0)
        {
            mobile.setNumberOfMinutesOfCallingCreditRemaining(callingCredit);
        }
        else
        {
            // Display error message for negative calling credit
            System.out.println("");
            System.out.println("***** - Sorry!. Please enter a positive amount for adding credit. - *****");
            return; // Exit method if calling credit is negative
        }

        // Add the mobile to the list of gadgets in the controller
        gadgetShopController.addGadget(mobile);

        // Display success message
        System.out.println("");
        System.out.println("##### Mobile Added Successfully! #####");
    }

    /**
     * Method to add an MP3 player to the gadget shop.
     */
    private void addMP3Player()
    {
        // Display message to indicate adding an MP3 player
        System.out.println("");
        System.out.println("============= ADDING MP3 PLAYER ================");

        // Prompt user for MP3 player details
        System.out.print("Enter MP3 Player Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Size: ");
        String size = scanner.nextLine();
        System.out.print("Enter Available Memory (in MB): ");
        int availableMemory = scanner.nextInt();

        // Create a new MP3 object
        MP3 mp3 = new MP3();
        // Set the attributes of the MP3 object
        mp3.setModel(model);
        mp3.setPrice(price);
        mp3.setWeight(weight);
        mp3.setSize(size);

        // Set the available memory for the MP3 player
        if (availableMemory >= 0)
        {
            mp3.setAvailableMemory(availableMemory);
        }
        else
        {
            // Display error message for negative available memory
            System.out.println("");
            System.out.println("***** - Sorry!. Please enter a positive amount for Available Memory. - *****");
            return; // Exit method if available memory is negative
        }

        // Add the MP3 player to the list of gadgets in the controller
        gadgetShopController.addGadget(mp3);

        // Display success message
        System.out.println("");
        System.out.println("##### MP3 Player Added Successfully! #####");

    }

    /**
     * Method to display all gadgets.
     */
    private void displayAllGadgets()
    {
        // Print a newline for formatting
        System.out.println("");

        // Call the displayAllGadgets method of gadgetShopController
        gadgetShopController.displayAllGadgets();

    }

    /**
     * Method to add calling credit to a mobile phone.
     */
    private void addCallingCredit()
    {
        // Display message indicating adding calling credit to a mobile phone
        System.out.println("");
        System.out.println("======= ADDING CALLING CREDIT TO MOBILE ========");

        // Check if there are any gadgets available
        if (gadgetShopController.getGadgets().isEmpty())
        {
            // If no gadgets are available, display an error message and return
            System.out.println("*****  - Sorry!. No Gadgets Available to Add Calling Credit. - *****");
            return;
        }

        // Display available mobile phones for user selection
        displayMobiles(gadgetShopController.getGadgets());

        // Prompt user to choose a mobile phone by its ID
        System.out.print("Choose the Id Mobile to Add Calling Credit (Enter its Number): ");
        int mobileId = scanner.nextInt();

        try
        {
            // Check if the chosen ID is valid and if the gadget at that ID is a Mobile object
            if (mobileId >= 1 && mobileId <= gadgetShopController.getGadgets().size()
                    && gadgetShopController.getGadgets().get(mobileId - 1) instanceof Mobile)
            {
                // Prompt user to enter calling credit to add
                System.out.print("Enter Calling Credit to Add (Minutes): ");
                int creditToAdd = scanner.nextInt();
                System.out.println("");

                // Add calling credit to the chosen mobile phone
                ((Mobile) gadgetShopController.getGadgets().get(mobileId - 1)).addCallingCredit(creditToAdd);

                // Display updated information of the mobile phone
                ((Mobile) gadgetShopController.getGadgets().get(mobileId - 1)).display();

                // Display success message
                System.out.println("===============================================");
                System.out.println("");
                System.out.println("##### Calling Credit Added Successfully!  :) #####");
            }
            else
            {
                // If the chosen ID is invalid or the gadget is not a Mobile object, throw an exception
                throw new IndexOutOfBoundsException();
            }
        }
        catch (InputMismatchException | IndexOutOfBoundsException e)
        {
            // Handle input mismatch or index out of bounds exceptions
            System.out.println("");
            System.out.println("Error: Invalid Choice, Please Enter a Valid Number  On The List. " + e.getMessage());
        }

    }

    /**
     * Method to make a call from a mobile phone.
     */
    private void makeCallFromMobile()
    {
        // Display message indicating making a call from a mobile phone
        System.out.println("");
        System.out.println("============ MAKE A CALL FROM MOBILE ============");

        // Check if there are any gadgets available
        if (gadgetShopController.getGadgets().isEmpty())
        {
            // If no gadgets are available, display an error message and return
            System.out.println("*****  - Sorry!. No Gadgets Available to Make Call From Mobile. - *****");
            return;
        }

        // Display available mobile phones for user selection
        displayMobiles(gadgetShopController.getGadgets());

        // Prompt user to choose a mobile phone by its ID
        System.out.print("Choose the Id Mobile to Make Call (Enter its Number): ");
        int mobileId = scanner.nextInt();

        try
        {
            // Check if the chosen ID is valid and if the gadget at that ID is a Mobile object
            if (mobileId >= 1 && mobileId <= gadgetShopController.getGadgets().size()
                    && gadgetShopController.getGadgets().get(mobileId - 1) instanceof Mobile)
            {
                // Prompt user to enter phone number and call duration
                System.out.print("Enter Phone Number: ");
                int phoneNumber = scanner.nextInt();

                System.out.print("Enter Duration Of The Call: ");
                int duration = scanner.nextInt();
                System.out.println("");

                // Make the call from the chosen mobile phone
                var resultCall = ((Mobile) gadgetShopController.getGadgets().get(mobileId - 1)).mobileMakeCall(phoneNumber, duration);

                // Display updated information of the mobile phone
                ((Mobile) gadgetShopController.getGadgets().get(mobileId - 1)).display();
                System.out.println("======================================================");
                System.out.println("");

                // Display success or failure message based on the result of the call
                if (resultCall)
                {
                    System.out.println("##### Great!!. Call Made Successfully! :) #####");
                }
                else
                {
                    System.out.println("##### Sorry!. Insufficient Credit To Make The Call. ): #####");
                }
            }
            else
            {
                // If the chosen ID is invalid or the gadget is not a Mobile object, throw an exception
                throw new IndexOutOfBoundsException();
            }
        }
        catch (InputMismatchException | IndexOutOfBoundsException e)
        {
            // Handle input mismatch or index out of bounds exceptions
            System.out.println("");
            System.out.println("Error: Invalid Choice, Please Enter a Valid Number  On The List. " + e.getMessage());
        }

    }

    private void DownloadMusictoMP3Player()
    {
        System.out.println("");
        System.out.println("========= DOWNLOAD MUSIC TO MP3 PLAYER =========");

        if (gadgetShopController.getGadgets().isEmpty())
        {
            System.out.println("*****  - Sorry!. No Gadgets Available to Download Music To MP3 Player. - *****");
            return;
        }

        try
        {

            displayMP3(gadgetShopController.getGadgets());
            System.out.print("Choose The Id MP3 Player To Download Music (Enter Its Numbers): ");
            int mp3Id = scanner.nextInt();
            if (mp3Id >= 1 && mp3Id <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(mp3Id - 1) instanceof MP3)
            {
                System.out.print("Enter Memory Required For The Music: ");
                int memory = scanner.nextInt();
                System.out.println("");
                boolean resultDownload = ((MP3) gadgetShopController.getGadgets().get(mp3Id - 1)).downloadMusic(memory);
                ((MP3) gadgetShopController.getGadgets().get(mp3Id - 1)).display();
                System.out.println("=================================================");
                System.out.println("");

                if (resultDownload)
                {
                    System.out.println("##### Great!!. The Downlaod Successfully! :) #####");
                }
                else
                {
                    System.out.println("##### Sorry!. Not Enough Memory To Download Music! ): #####");

                }
            }
            else
            {
                throw new IndexOutOfBoundsException();
            }

        }
        catch (InputMismatchException | IndexOutOfBoundsException e)
        {
            System.out.println("*****  -   Error!. Invalid Choice, Please Enter a Valid Number.  -  *****");
            scanner.nextLine();// Clear de input buffer
        }

    }

    private void deleteMusicFromMP3Player()
    {
        System.out.println("");
        System.out.println("========= DELETE MUSIC FROM  MP3 PLAYER ========");

        if (gadgetShopController.getGadgets().isEmpty())
        {
            System.out.println("*****  - Sorry!. No Gadgets Available to Delete Music. - *****");
            return;
        }

        try
        {
            displayAllGadgets();
            //displayMP3(gadgetShopController.getGadgets());
            System.out.print("Choose The Id MP3 Player To Delete Music (Enter Its Numbers): ");
            int mp3Id = scanner.nextInt();
            if (mp3Id >= 1 && mp3Id <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(mp3Id - 1) instanceof MP3)
            {
                System.out.print("Enter Memory To Free From The Deleted  Music: ");
                int memory = scanner.nextInt();
                System.out.println("");
                boolean resultdeletMusic = ((MP3) gadgetShopController.getGadgets().get(mp3Id - 1)).deleteMusic(memory);
                //((MP3) gadgetShopController.getGadgets().get(mp3Id - 1)).display();
                System.out.println("Update The MP3sPlayer Was Delete Music.");
                displayMP3(gadgetShopController.getGadgets());
                System.out.println("==================================================");
                System.out.println("");
                if (resultdeletMusic)
                {
                    System.out.println("##### Great!!. The Deleted Music Was Successfully! :) #####");
                }
                else
                {
                    System.out.println("##### Sorry!. The Music Could Not Delete (Please Enter a Value >= 0)! ): #####");

                }

            }
            else
            {
                throw new IndexOutOfBoundsException();
            }

        }
        catch (InputMismatchException | IndexOutOfBoundsException e)
        {
            System.out.println("*****  -   Error!. Invalid Choice, Please Enter a Valid Number On The List.  -  *****");
            scanner.nextLine();// Clear de input buffer
        }

        System.out.println("");
    }

    private static void displayMobiles(List<Gadget> gadgets)
    {
        System.out.println("----------- MOBILES -----------");

        for (Gadget gadget : gadgets)
        {
            if (gadget instanceof Mobile)
            {

                System.out.println(" " + gadget.display());
                System.out.println("");

            }

        }

        System.out.println("---------------------------------");
    }

    private void displayMP3(List<Gadget> gadgets)
    {
        System.out.println("----------- MP3s -----------");

        for (Gadget gadget : gadgets)
        {
            if (gadget instanceof MP3)
            {

                System.out.println(" " + gadget.display());
                System.out.println("");

            }

        }

        System.out.println("---------------------------------");
    }

}
