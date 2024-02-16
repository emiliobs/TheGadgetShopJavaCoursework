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
    public GadgetShopViewPrompt(TheGadgetShopController gadgetShopController)
    {
        System.out.println("");
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

        this.gadgetShopController = gadgetShopController;
        this.scanner = new Scanner(System.in);
        System.out.println("");
    }

    // Method to display menu options
    public void displayMenu()
    {

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

    // Method to run the gadget shop Application
    public void run()
    {
        int choice = -1;

        do
        {
            displayMenu();
            System.out.print("Enter your Choice: ");
            try
            {
                choice = scanner.nextInt(); // Read user choice
                scanner.nextLine(); // Consume newline

                switch (choice)
                {
                    case 1:
                        addMobile(); // Add mobile phone
                        break;
                    case 2:
                        addMP3Player(); // Add MP3 Player
                        break;
                    case 3:
                        displayAllGadgets(); // Display all gadget
                        break;
                    case 4:
                        addCallingCredit(); // Add MP3 Player
                        break;
                    case 5:
                        makeCallFromMobile();
                        break;
                    case 6:
                        DownloadMusictoMP3Player();
                        break;
                    case 7:
                        deleteMusicFromMP3Player();
                        break;
                    case 8:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("================================================");
                        System.out.println("=                                              =");
                        System.out.println("=                                              =");
                        System.out.println("=                                              =");
                        System.out.println("=  THANKS YOU!. GOOD BYE, EXIT THE SYSTEM  ):  =");
                        System.out.println("=                                              =");
                        System.out.println("=                                              =");
                        System.out.println("=                                              =");
                        System.out.println("================================================");
                        System.out.println("");
                        System.exit(0); // Exit the Application
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        System.out.println("*****  - Sorry!: Invalid Choice. Please enter again. - *****"); // Invalid choice
                }

            }
            catch (InputMismatchException e)
            {
                System.out.println("");
                System.out.println("*****  - Sorry!. Invalid input. Please enter a number  -  *****"); // Handle non-integer input
                scanner.nextLine(); // Consume invalid input
                choice = 0; // Rest choice to trigger menu redisplay
            }
        }
        while (choice != 8); // Continue ubtil choose to exit
    }

    // Method to add a mobile phone
    private void addMobile()
    {
        System.out.println("");
        System.out.println("================ ADDING MOBILE =================");
        System.out.print("Enter Mobil Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine(); // Consume newLine
        System.out.print("Enter Size: ");
        String size = scanner.nextLine();
        System.out.print("Enter Calling Credit: ");
        int callingCredit = scanner.nextInt();
        System.out.println("================================================");

        Mobile mobile = new Mobile(); // Create new Mobile Object
        mobile.setModel(model);
        mobile.setPrice(price);
        mobile.setWeight(weight);
        mobile.setSize(size);
        if (callingCredit >= 0)
        {
            mobile.setNumberOfMinutesOfCallingCreditRemaining(callingCredit);
        }
        else
        {
            System.out.println("");
            System.out.println("***** - Sorry!. Please enter a positive amount for adding credit. - *****");
            return;
        }

        System.out.println("");
        gadgetShopController.addGadget(mobile);
        //gadgetShopController.addGadget(mobile);  // Add mobile to the list
        System.out.println("##### Mobile Added Successfully! #####");
    }

    //Method to add an MP3 player
    private void addMP3Player()
    {
        System.out.println("");
        System.out.println("============= ADDING MP3 PLAYER ================");
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
        System.out.println("===============================================");

        MP3 mp3 = new MP3();
        mp3.setModel(model);
        mp3.setPrice(price);
        mp3.setWeight(weight);
        mp3.setSize(size);

        if (availableMemory >= 0)
        {
            mp3.setAvailableMemory(availableMemory);

        }
        else
        {
            System.out.println("");
            System.out.println("");
            System.out.println("***** - Sorry!. Please enter a positive amount for Available Memory. - *****");
            return;
        }
        System.out.println("");
        gadgetShopController.addGadget(mp3);
        System.out.println("##### MP3 Player Added Successfully! #####");

    }

    private void displayAllGadgets()
    {
        System.out.println("");
        gadgetShopController.displayAllGadgets();

    }

    private void addCallingCredit()
    {
        System.out.println("");
        System.out.println("======= ADDING CALLING CREDIT TO MOBILE ========");
        if (gadgetShopController.getGadgets().isEmpty())
        {

            System.out.println("*****  - Sorry!. No Gadgets Available to Add Calling Credit. - *****");
            return;
        }

        displayMobiles(gadgetShopController.getGadgets());

        System.out.print("Choose the Mobile to Add Calling Credit (Enter its Number): ");
        int mobileId = scanner.nextInt();

        try
        {
            if (mobileId >= 1 && mobileId <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(mobileId - 1) instanceof Mobile)
            {
                System.out.print("Enter Calling Credit to Add (Minutes): ");
                int creditToAdd = scanner.nextInt();
                System.out.println("");
                ((Mobile) gadgetShopController.getGadgets().get(mobileId - 1)).addCallingCredit(creditToAdd);
                ((Mobile) gadgetShopController.getGadgets().get(mobileId - 1)).display();
                System.out.println("===============================================");
                System.out.println("");
                System.out.println("##### Calling Credit Added Successfully!  :) #####");
            }
            else
            {
                throw new IndexOutOfBoundsException();
            }
        }
        catch (InputMismatchException | IndexOutOfBoundsException e)
        {
            System.out.println("");
            System.out.println("Error: Invalid Choice, Please Enter a Valid Number  On The List. " + e.getMessage());
        }

    }

    private void makeCallFromMobile()
    {
        System.out.println("");
        System.out.println("============ MAKE A CALL FROM MOBILE ============");

        if (gadgetShopController.getGadgets().isEmpty())
        {
            System.out.println("*****  - Sorry!. No Gadgets Available to Make Call From Mobile. - *****");
            return;
        }

        displayMobiles(gadgetShopController.getGadgets());
        System.out.print("Choose the Mobile to Add Calling Credit (Enter its Number): ");
        int mobileId = scanner.nextInt();

        try
        {
            if (mobileId >= 1 && mobileId <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(mobileId - 1) instanceof Mobile)
            {
                System.out.print("Enter Phone Number: ");
                int phoneNumber = scanner.nextInt();

                System.out.print("Enter Duration Of The Call: ");
                int duration = scanner.nextInt();
                System.out.println("");
                var resultCall = ((Mobile) gadgetShopController.getGadgets().get(mobileId - 1)).mobileMakeCall(phoneNumber, duration);
                ((Mobile) gadgetShopController.getGadgets().get(mobileId - 1)).display();
                System.out.println("======================================================");
                System.out.println("");

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
                throw new IndexOutOfBoundsException();
            }
        }
        catch (InputMismatchException | IndexOutOfBoundsException e)
        {
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
            System.out.print("Choose The MP3 Player To Download Music (Enter Its Numbers): ");
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
            displayMP3(gadgetShopController.getGadgets());
            System.out.print("Choose The MP3 Player To Delete Music (Enter Its Numbers): ");
            int mp3Id = scanner.nextInt();
            if (mp3Id >= 1 && mp3Id <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(mp3Id - 1) instanceof MP3)
            {
                System.out.print("Enter Memory To Free From The Deleted  Music: ");
                int memory = scanner.nextInt();
                System.out.println("");
                boolean resultdeletMusic = ((MP3) gadgetShopController.getGadgets().get(mp3Id - 1)).deleteMusic(memory);
                ((MP3) gadgetShopController.getGadgets().get(mp3Id - 1)).display();
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

        for (int i = 0; i < gadgets.size(); i++)
        {
            System.out.println("  Id: " + (i + 1) + " \n " + gadgets.get(i).display());
            //System.out.println("CALLING CREDIT: " + ((Mobile) gadgets.get(i)).getNumberOfMinutesOfCallingCreditRemaining());
            System.out.println("");
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
                System.out.println("Gadget Id: " + gadget.getGadgetId());
                System.out.println("Model: " + gadget.getModel());
                System.out.println("Price: " + gadget.getPrice());
                System.out.println("Weight: " + gadget.getWeight());
                System.out.println("Size: " + gadget.getSize());
                System.out.println("AVAILABLE MEMORY: " + ((MP3) gadget).getAvailableMemory());
                System.out.println("");
            }
        }
        System.out.println("---------------------------------");
    }

}
