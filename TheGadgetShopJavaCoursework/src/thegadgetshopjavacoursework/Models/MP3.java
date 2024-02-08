package thegadgetshopjavacoursework.Models;

/**
 *
 * @author Emilio
 */
//  Subclass MP£ inheriting from Gadget
public class MP3 extends Gadget
{

    //   private int mp3Id;
    private double availableMemory;

    // Constructor empty
    public MP3()
    {

    }

    // Contructor to initialize MP3 atributte
    public MP3(double availableMemory)
    {

        this.availableMemory = availableMemory;
    }

    // Contructor to initialize MP3 atributte and Gatget attributes
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

    // Method to dowload music
    public void downloadMusic(double memoryReque)
    {
        try
        {
            if (memoryReque <= availableMemory)
            {
                availableMemory -= memoryReque;
            }
            else
            {
                throw new IllegalArgumentException("Not enough memory to download music.");
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to delete music
    public void deleteMusic(int memoryFreed)
    {
        availableMemory += memoryFreed;
    }

    // Override display method to include available memory
    @Override
    public void display()
    {
        super.display();
        System.out.println(" AVAILABLE MEMORY: " + availableMemory + " MB");
    }

}
