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

    private String model;
    private double price;
    private int weight;
    private String size;

    // Constructor Gadget emty
    public Gadget()
    {
    }
    
// Constructor to initialize Gadget attributes
    public Gadget(String model, double price, int weight, String size)
    {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    //  Accesor methods for Gadget attributes
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
    public void display()
    {
        System.out.println("Model: " + model);
        System.out.println("Price: £ " + price);
        System.out.println("Weight: " + weight + " Grams");
        System.out.println("Size: " + size);
    }

}
