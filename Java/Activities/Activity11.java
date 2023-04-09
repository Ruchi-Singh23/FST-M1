package activities;
import java.util.HashMap;
public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> colours = new HashMap<Integer, String>();
        colours.put(1,"Red");
        colours.put(2,"Green");
        colours.put(3,"Yellow");
        colours.put(4,"Pink");
        colours.put(5,"Blue");
        System.out.println("The Map is "+ colours);
        colours.remove(4);
        System.out.println("After removing Pink: " + colours);
        if(colours.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        System.out.println("Map Size is: " + colours.size());
    }
}
