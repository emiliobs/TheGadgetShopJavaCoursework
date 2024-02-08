package thegadgetshopjavacoursework.Models;

/**
 *
 * @author Emilio
 */
//  Subclass MP£ inheriting from Gadget
public class MP3 extends Gadget
{

    private static int mp3Counter = 1;

//    private int mp3Id;
    private double availableMemory;

    // Constructor empty
    public MP3()
    {
        //this.mp3Id = mp3Counter++;
    }

    public MP3(double availableMemory)
    {
        //this.mp3Id = mp3Counter++;
        this.availableMemory = availableMemory;
    }

    public MP3(double availableMemory, int gadgetId, String model, double price, int weight, String size)
    {
        super(gadgetId, model, price, weight, size);
        //this.mp3Id = mp3Counter++;
        this.availableMemory = availableMemory;
    }

    // Contructor to initialize MP3 atributte
    // Contructor to initialize MP3 atributte and Gatget attributes
    // Accessor methods for availableMemory
//    public int getMp3Id()
//    {
//        return mp3Id;
//    }
//
//    public void setMp3Id(int mp3Id)
//    {
//        this.mp3Id = mp3Id;
//    }

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
        System.out.println("Available Mamory: " + availableMemory + " MB");
    }

}
