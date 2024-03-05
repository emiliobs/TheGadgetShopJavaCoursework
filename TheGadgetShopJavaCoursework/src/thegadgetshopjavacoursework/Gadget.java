package thegadgetshopjavacoursework;

/**
 * Model class representing a Gadget. A Gadget object encapsulates information
 * about a particular gadget, including its ID, model, price, weight, and size.
 *
 * Gadget objects are used to represent gadgets within the Gadget Shop
 * application.
 *
 * @author Emilio
 */
public class Gadget
{

    // Instance Variables
    private static int gadgetCounter = -1; // Counter for generating unique gadget IDs

    private int gadgetId; // Unique ID of the gadget
    private String model; // Model of the gadget
    private double price; // Price of the gadget
    private int weight; // Weight of the gadget
    private String size; // Size of the gadget

    // Constructors
    /**
     * Default constructor for creating a Gadget object. Increments the gadget
     * counter to generate a unique ID for the gadget.
     */
    public Gadget()
    {
        // Set the gadgetId using gadgetCounter and increment gadgetCounter
        this.gadgetId = gadgetCounter++;
    }

    /**
     * Constructor for initializing Gadget attributes with specified values.
     * Increments the gadget counter to generate a unique ID for the gadget.
     *
     * @param gadgetId Unique ID of the gadget
     * @param model Model of the gadget
     * @param price Price of the gadget
     * @param weight Weight of the gadget
     * @param size Size of the gadget
     */
    public Gadget(int gadgetId, String model, double price, int weight, String size)
    {
        // Set the gadgetId using gadgetCounter and increment gadgetCounter
        this.gadgetId = gadgetCounter++;

        // Initialize other attributes with the provided values
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    // Accessor methods for Gadget attributes
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

    // Method to display Gadget details
    /**
     * Generates a string representation of the Gadget object, including its
     * details.
     *
     * @return A string containing details of the gadget (ID, model, price,
     * weight, size)
     */
    public String display()
    {
        // Construct and return a string containing the gadget's attributes
        return " Id: " + gadgetId + "\n " + " Model: " + model + "\n " + " Price: £" + price + "\n " + " Weight: " + weight + " Grams" + "\n " + " Size: " + size;
    }
}
