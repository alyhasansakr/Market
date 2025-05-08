import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import Exceptions.NameBlank;
import Exceptions.PriceNegative;
import org.junit.jupiter.api.Test;

class ItemTests {

    @Test
    void newItem() {
        Item item = new Item("cola", 10.0);
        assertEquals("cola", item.getName());
        assertEquals(10.0, item.getPrice());
    }

    @Test
    void setItemName() {
        Item item = new Item("cola", 10.0);
        item.setName("pepsi");
        assertEquals("pepsi", item.getName());
    }

    @Test
    void setItemPrice() {
        Item item = new Item("cola", 10.0);
        item.setPrice(5.0);
        assertEquals(5.0, item.getPrice());
    }

    @Test
    void setItemNameBlank() {
        Item item = new Item("cola", 10.0);
        assertThrows(NameBlank.class, () -> item.setName(""));
    }

    @Test
    void setItemPriceNegative() {
        Item item = new Item("cola", 10.0);
        assertThrows(PriceNegative.class, () -> item.setPrice(-1.0));
    }

    @Test
    void toStringItem() {
        Item item = new Item("cola", 10.0);
        assertEquals("cola", item.toStringShort());
        assertEquals("cola, 10.0", item.toStringLong());
    }
}