import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CoffeeAPP {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(CoffeeMenu.read(new Scanner(new File("resources/coffee.txt"))));
    }
}
