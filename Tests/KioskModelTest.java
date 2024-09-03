package Tests;

import org.junit.jupiter.api.Test;
import clients.kiosk.KioskModel;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class KioskModelTest {
    @Test
    void CreateProductMapMethodReturnsTheCorrectHashMap() {
        var map = KioskModel.createProductMap();
        assertEquals("0003", map.get("Toaster"));
        assertFalse(map.isEmpty());
        assertEquals(7, map.size());
    }
    @Test
    void NameToProductNumberMethodReturnsTheCorrectArray() {
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        ArrayList<String> array3 = new ArrayList<>();
        ArrayList<String> array4 = new ArrayList<>();
        array1.add("0001");
        array2.add("0005");
        array2.add("0006");
        array2.add("0001");
        array3.add("0002");
        array3.add("0005");
        KioskModel.method = "Check";
        assertEquals(array2, KioskModel.NameToProductNumber("l"));
        assertEquals(array3, KioskModel.NameToProductNumber("di"));
        assertEquals(array1, KioskModel.NameToProductNumber("tv"));
        KioskModel.method = "Add";
        assertEquals(array1, KioskModel.NameToProductNumber("40 inch LED HD TV"));
        assertEquals(array4, KioskModel.NameToProductNumber("l"));
    }
}