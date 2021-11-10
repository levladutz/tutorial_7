import java.util.*;

public class CoffeeItem {

    public static CoffeeItem read(String input){
        Scanner variant = new Scanner(input).useDelimiter("VARIATION");
        String coffeeBase = variant.next();

        // read the base
        Scanner parse = new Scanner(coffeeBase).useDelimiter(",|\n");
        String name = parse.next();
        double price = parse.nextDouble();
        List<String> allergies = new ArrayList<>();
        while(parse.hasNext())
            allergies.add(parse.next());

        // read the variations
        List<CoffeeVariation> variations = new ArrayList<>();

        while(variant.hasNext())
            variations.add(CoffeeVariation.read(variant.next()));

        return new CoffeeItem(name, price, allergies, variations);
    }
    private String name;
    private double price;
    private List<String> allergies;
    private List<CoffeeVariation> variations;

    /**
     * Creates a coffee item.
     *
     * @param name The name of the coffee item
     * @param price The price of the coffee item
     * @param allergies The allergies for the coffee item
     * @param variations The variations of the coffee item
     */
    public CoffeeItem(String name, double price, List<String> allergies, List<CoffeeVariation> variations) {
        this.name = name;
        this.price = price;
        this.allergies = allergies;
        this.variations = variations;
    }

    /**
     * Gets the name of the coffee item.
     *
     * @return This coffee item's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the coffee item.
     *
     * @return This coffee item's name
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the allergies for the coffee item.
     *
     * @return The list of allergies for this coffee item
     */
    public List<String> getAllergies() {
        return allergies;
    }

    /**
     * Gets the list of variations on the coffee item.
     *
     * @return The list of possible variations for this coffee item
     */
    public List<CoffeeVariation> getVariations() {
        return variations;
    }

    /**
     * Checks whether an object is equal to the coffee item.
     *
     * @param other The other object
     * @return True iff the other is an identical coffee item
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof CoffeeItem) {
            CoffeeItem that = (CoffeeItem) other;
            return this.name.equals(that.name) && this.price == that.price
                    && this.allergies.equals(that.allergies) && this.variations.equals(that.variations);
        }
        return false;
    }

}
