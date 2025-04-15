public class ItemLine {
    private Item item;
    private Double count;

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    Double getTotal() {
        return item.getPrice() * count;
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
