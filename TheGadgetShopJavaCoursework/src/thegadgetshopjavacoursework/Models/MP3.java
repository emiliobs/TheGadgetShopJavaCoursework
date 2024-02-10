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
    public boolean downloadMusic(double memoryReque)
    {
        if (memoryReque <= availableMemory)
        {
            availableMemory -= memoryReque;
            return true;
        }

        return false;

    }

    // Method to delete music
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
    @Override
    public String display()
    {
        super.display();
         return "MP3{" + "availableMemory=" + availableMemory + '}';
        //System.out.println("AVAILABLE MEMORY: " + availableMemory + " MB");
    }

  
    
    
}
