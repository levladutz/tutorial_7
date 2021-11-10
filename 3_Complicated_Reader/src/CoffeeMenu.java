import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CoffeeMenu {

    /**
     * Reads a coffee menu from the given input.
     *
     * @param input The scanner to read from
     * @return The coffee menu read from the input
     */
    public static CoffeeMenu read(Scanner input) {
        List<CoffeeItem> coffees = new ArrayList<>();
        List<Addition> additions = new ArrayList<>();

        input.nextLine(); // Skip coffees
        input.useDelimiter("ADDITIONS\n");
        Scanner coffee = new Scanner(input.next()).useDelimiter("COFFEE");

        while(coffee.hasNext())
            coffees.add(CoffeeItem.read(coffee.next()));


        Scanner addition = new Scanner(input.next()).useDelimiter("ADDITION");

        while(addition.hasNext())
            additions.add(Addition.read(addition.next()));

        return new CoffeeMenu(coffees, additions);
    }

    private List<CoffeeItem> coffees;
    private List<Addition> additions;

    /**
     * Creates a coffee menu.
     *
     * @param coffees   The list of coffees on the menu
     * @param additions The list of additions on the menu
     */
    public CoffeeMenu(List<CoffeeItem> coffees, List<Addition> additions) {
        this.coffees = coffees;
        this.additions = additions;
    }

    /**
     * Gets the coffees on the menu.
     *
     * @return The list of coffees on this menu
     */
    public List<CoffeeItem> getCoffees() {
        return coffees;
    }

    /**
     * Gets the additions on the menu.
     *
     * @return The list of coffees on this menu
     */
    public List<Addition> getAdditions() {
        return additions;
    }

    /**
     * Checks whether an object is equal to the coffee menu.
     *
     * @param other The other object
     * @return True iff the other is an identical coffee menu
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof CoffeeMenu) {
            CoffeeMenu that = (CoffeeMenu) other;
            return this.coffees.equals(that.coffees) && this.additions.equals(that.additions);
        }
        return false;
    }

}
