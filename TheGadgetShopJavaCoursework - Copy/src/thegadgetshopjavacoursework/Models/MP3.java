package thegadgetshopjavacoursework.Models;

/**
 * Subclass MP3 inheriting from Gadget. Represents an MP3 player gadget with
 * additional functionality such as music management. Extends the functionality
 * of the Gadget class.
 *
 * MP3 objects are used to represent MP3 players within the Gadget Shop
 * application. They inherit attributes and methods from the Gadget class.
 *
 * @author Emilio
 */
public class MP3 extends Gadget
{

    private double availableMemory; // Available memory in the MP3 player

    // Constructors
    /**
     * Default constructor for creating an MP3 object. Initializes the object
     * with default values.
     */
    public MP3()
    {
    }

    /**
     * Constructor for initializing only the available memory attribute of the
     * MP3 player.
     *
     * @param availableMemory Available memory of the MP3 player in megabytes
     * (MB)
     */
    public MP3(double availableMemory)
    {
        // Set the available memory for the MP3 player using the provided value
        this.availableMemory = availableMemory;
    }

    /**
     * Constructor for initializing both MP3 attributes and Gadget attributes
     * with specified values.
     *
     * @param availableMemory Available memory of the MP3 player in megabytes
     * (MB)
     * @param gadgetId Unique ID of the MP3 gadget
     * @param model Model of the MP3 gadget
     * @param price Price of the MP3 gadget
     * @param weight Weight of the MP3 gadget
     * @param size Size of the MP3 gadget
     */
    public MP3(double availableMemory, int gadgetId, String model, double price, int weight, String size)
    {
        // Call the constructor of the superclass (Gadget) with specified parameters
        super(gadgetId, model, price, weight, size);

        // Initialize the available memory attribute for the MP3 object with the provided value
        this.availableMemory = availableMemory;
    }

    // Accessor methods for availableMemory
    public double getAvailableMemory()
    {
        return availableMemory;
    }

    public double setAvailableMemory(double availableMemory)
    {
        return this.availableMemory = availableMemory;
    }

    // Method to download music
    /**
     * Downloads music to the MP3 player.
     *
     * @param memoryRequired Memory required for downloading the music in
     * megabytes (MB)
     * @return true if the music is successfully downloaded, false otherwise
     */
    public boolean downloadMusic(double memoryRequired)
    {
        // Check if the required memory for downloading the music is less than or equal to the available memory
        if (memoryRequired <= availableMemory)
        {
            // If there is sufficient available memory, deduct the required memory from the available memory
            availableMemory -= memoryRequired;
            // Return true indicating the music was successfully downloaded
            return true;
        }
        // Return false indicating the music cannot be downloaded due to insufficient available memory
        return false;
    }

    // Method to delete music (Free up memory in the MP3 player)
    /**
     * Deletes music from the MP3 player, freeing up memory.
     *
     * @param memoryFreed Memory freed by deleting music in megabytes (MB)
     * @return true if the music is successfully deleted, false otherwise
     */
    public boolean deleteMusic(int memoryFreed)
    {
        // Check if the memory freed after deleting the music is non-negative
        if (memoryFreed >= 0)
        {
            // If it's non-negative, add the freed memory to the available memory
            availableMemory += memoryFreed;
            // Return true indicating the music was successfully deleted
            return true;
        }
        else
        {
            // If it's negative, return false indicating deletion failure
            return false;
        }
    }

    // Override display method to include available memory
    /**
     * Generates a string representation of the MP3 player, including its
     * details and available memory.
     *
     * @return A string containing details of the MP3 player (ID, model, price,
     * weight, size) and available memory
     */
    @Override
    public String display()
    {
        // Calls the display method of the superclass (presumably Gadget) to get basic gadget information,
        // Concatenates information about the available memory to the returned string
        return super.display() + "\n " + "AVAILABLE MEMORY: " + availableMemory + " MB";
    }

}
