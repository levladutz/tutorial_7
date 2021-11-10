import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addition {

    public static Addition read(String input)
    {
        Scanner parse = new Scanner(input).useDelimiter(",|\n");
        String name = parse.next();
        double price = parse.nextDouble();
        List<String> allergies = new ArrayList<>();

        while(parse.hasNext())
            allergies.add(parse.next());
        return new Addition(name, price, allergies);
    }

    private String name;
    private double price;
    private List<String> allergies;

    /**
     * Creates an addition.
     *
     * @param name The name of the addition
     * @param price The price of the addition
     * @param allergies The list of allergies for the addition
     */
    public Addition(String name, double price, List<String> allergies) {
        this.name = name;
        this.price = price;
        this.allergies = allergies;
    }

    /**
     * Gets the name of the addition.
     *
     * @return This addition's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the addition.
     *
     * @return This addition's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the list of allergies.
     *
     * @return The list of allergies for this addition.
     */
    public List<String> getAllergies() {
        return allergies;
    }

    /**
     * Checks whether an object is equal to the addition.
     *
     * @param other The other object
     * @return True iff the other is an identical addition
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Addition) {
            Addition that = (Addition) other;
            return this.name.equals(that.name) && this.price == that.price && this.allergies.equals(that.allergies);
        }
        return false;
    }

}
