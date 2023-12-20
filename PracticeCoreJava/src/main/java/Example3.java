import java.util.Collections;
import java.util.HashMap;

public class Example3 {
    public static void main(String[] args) {
        String s = "Nikita";
        System.out.println(s.charAt(0) == s.charAt(1));
        HashMap<Integer,Integer> hp = new HashMap<>();
        hp.put(12,7);
        hp.put(12,9);
        System.out.println(hp);
        System.out.println(hp.entrySet());
        HashMap<Integer, Integer> map
                = new HashMap<Integer, Integer>();

        // Inserting elements in the Map
        // using put() method

        // Custom input addition
        map.put(1, 4);
        map.put(2, 5);
        map.put(3, 7);
        map.put(4, 7);

        // Using Collections.max() method returning max
        // value in HashMap and storing in a integer
        // variable
        int maxValueInMap = (Collections.max(map.values()));
        System.out.println(maxValueInMap);

        // Iterate through HashMap

    }
}
