import java.util.Scanner;

public class CoffeeVariation {


    public static CoffeeVariation read(String input)
    {
        Scanner parse = new Scanner(input);
        parse.useDelimiter(",|\n");
        String name = parse.next();
        double extraCost = parse.nextDouble();
        return new CoffeeVariation(name, extraCost);
    }
    private String name;
    private double extraCost;

    /**
     * Creates a coffee variation.
     *
     * @param name The name of the variation
     * @param extraCost The extra cost of the variation
     */
    public CoffeeVariation(String name, double extraCost) {
        this.name = name;
        this.extraCost = extraCost;
    }

    /**
     * Gets the name of the variation.
     *
     * @return This variation's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the extra cost of the varation.
     *
     * @return This variation's extra cost.
     */
    public double getExtraCost() {
        return extraCost;
    }

    /**
     * Checks whether an object is equal to the coffee variation.
     *
     * @param other The other object
     * @return True iff the other is an identical coffee variation
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof CoffeeVariation) {
            CoffeeVariation that = (CoffeeVariation) other;
            return this.name.equals(that.name) && this.extraCost == that.extraCost;
        }
        return false;
    }

}
