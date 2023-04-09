package activities;
import java.util.ArrayList;
public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Monkey");
        myList.add("Dog");
        myList.add("Cat");
        myList.add(3, "Cow");
        myList.add(1, "Goat");
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Rabbit is in list: " + myList.contains("Rabbit"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Cow");
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
