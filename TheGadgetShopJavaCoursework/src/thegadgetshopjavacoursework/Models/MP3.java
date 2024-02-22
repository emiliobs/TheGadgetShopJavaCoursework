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
        super(gadgetId, model, price, weight, size);
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
        if (memoryRequired <= availableMemory)
        {
            availableMemory -= memoryRequired;
            return true;
        }
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
        if (memoryFreed >= 0)
        {
            availableMemory += memoryFreed;
            return true;
        }
        else
        {
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
        return super.display() + "\n " + "AVAILABLE MEMORY: " + availableMemory + " MB";
    }

}
