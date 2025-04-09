public class ItemLine {
    Item item;
    Double count;

    Double getTotal() {
        return item.price * count;
    }

    @Override
    public String toString() {
        String s = "";

        s += item.toString();
        s += count + ", ";
        s += getTotal();

        return s;
    }
}
