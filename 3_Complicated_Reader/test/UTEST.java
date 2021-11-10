import org.junit.Test;

import java.io.*;
import java.util.*;

public class UTEST {

    @Test
    public void test() throws FileNotFoundException {
        System.out.println(CoffeeMenu.read(new Scanner(new File("resources/coffee.txt"))));
    }

}
