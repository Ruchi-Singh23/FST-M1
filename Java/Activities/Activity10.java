package activities;
import java.util.HashSet;
public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Monkey");
        hs.add("Dog");
        hs.add("Cat");
        hs.add("Rabbit");
        hs.add("Cow");
        hs.add("Goat");
        System.out.println("Size of Hashset: " + hs.size());
        hs.remove("Cow");
        if(hs.remove("Pig")) {
            System.out.println("Pig removed from the Set");
        } else {
            System.out.println("Pig is not present in the Set");
        }
        System.out.println("Is Dog is in list: " + hs.contains("Dog"));
        System.out.println("Updated HashSet: " + hs);
    }
}

