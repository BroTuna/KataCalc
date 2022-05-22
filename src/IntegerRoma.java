import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;


public class IntegerRoma {
    public final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "LC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public final static String toRoman(int number) throws IOException {
        if (number < 1) {
            throw new IOException();
        }
        int i = map.floorKey(number);
        if (number == i) {
            return map.get(number);
        }
        return map.get(i) + toRoman(number - i);
    }

}