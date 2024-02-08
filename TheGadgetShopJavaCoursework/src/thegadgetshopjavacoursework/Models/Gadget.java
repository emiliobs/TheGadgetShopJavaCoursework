package thegadgetshopjavacoursework.Models;

import java.util.ArrayList;
import java.util.List;

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
//    private List<Mobile> mobiles;
//    private List<MP3> mp3s;

    // Constructor Gadget emty
    public Gadget()
    {
        this.gadgetId = gadgetCounter++;
//        this.mobiles = new ArrayList<>();
//        this.mp3s = new ArrayList<>();
    }

// Constructor to initialize Gadget attributes
    public Gadget(int gadgetId, String model, double price, int weight, String size)
    {
        this.gadgetId = gadgetCounter++;
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
//        this.mobiles = new ArrayList<>();
//        this.mp3s = new ArrayList<>();
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

//    public List<Mobile> getMobiles()
//    {
//        return mobiles;
//    }
//
//    public void setMobiles(List<Mobile> mobiles)
//    {
//        this.mobiles = mobiles;
//    }
//
//    public List<MP3> getMp3s()
//    {
//        return mp3s;
//    }
//
//    public void setMp3s(List<MP3> mp3s)
//    {
//        this.mp3s = mp3s;
//    }

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
        System.out.println("Id: " + gadgetId);
        System.out.println("Model: " + model);
        System.out.println("Price: £ " + price);
        System.out.println("Weight: " + weight + " Grams");
        System.out.println("Size: " + size);
    }

}
