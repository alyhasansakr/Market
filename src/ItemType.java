import java.util.Arrays;

public enum ItemType {
    Drinks(0),
    Cans(1),
    Chips(2),
    Vegetables(3),
    FrozenFood(4),
    Other(5);

    private final int index;

    ItemType(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }

    public static ItemType getType(int index) {
        return Arrays.asList(ItemType.values()).get(index);
    }
}
