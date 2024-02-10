package thegadgetshopjavacoursework.Models;


/**
 *
 * @author Emilio
 */
// Model classes
//Class Gadget
public class Gadget
{

    // Instance Variables
    private static int gadgetCounter = 1;

    private int gadgetId;
    private String model;
    private double price;
    private int weight;
    private String size;


    // Constructor Gadget emty
    public Gadget()
    {
        this.gadgetId = gadgetCounter++;

    }

// Constructor to initialize Gadget attributes
    public Gadget(int gadgetId, String model, double price, int weight, String size)
    {
        this.gadgetId = gadgetCounter++;
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;

    }

    //  Accesor methods for Gadget attributes
    public int getGadgetId()
    {
        return gadgetId;
    }

    public void setGadgetId(int gadgetId)
    {
        this.gadgetId = gadgetId;
    }


    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    // Mehtod to display Gadget details
    public String display()
    {
         return "Id: " + gadgetId + "\n " +" model: " + model + "\n " + " price: " + price + "\n " + " weight: " + weight + "\n " + " size: " + size;
//        System.out.println("Id: " + getGadgetId());
//        System.out.println("Model: " + getModel());
//        System.out.println("Price: £ " + getPrice());
//        System.out.println("Weight: " + getWeight() + " Grams");
//        System.out.println("Size: " + getSize());
    }

     
    
}
