import java.io.IOException;
import java.util.TreeMap;

class NumbRoma {
    public final static TreeMap<String, Integer> map = new TreeMap<String, Integer>();

    static {
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
    }

    public final static String Number(String num) throws IOException {
        String i = map.floorKey(num);
        if (i.equals(num)) {
            return String.valueOf(map.get(num));
        } else {
            throw new IOException();
        }
    }
}
