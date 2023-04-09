package activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;
public class Activity1 {
    static ArrayList<String> list;
    @BeforeEach
    void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }
    @Test
    public void insertTest() {
        assertEquals(String.valueOf(2), list.size(), "Wrong size");
        list.add(2, "charlie");
        assertEquals(String.valueOf(3), list.size(), "Wrong size");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");
    }
    @Test
    public void replaceTest() {
        list.set(1, "charlie");
        assertEquals(String.valueOf(2), list.size(), "Wrong size");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");
    }
}
