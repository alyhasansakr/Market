import Exceptions.CountNegative;

public class ItemLine implements Printable {
    private Item item;
    private Double count;

    public ItemLine(Item item, Double count) {
        this.item = item;
        setCount(count);
    }

    public ItemLine(Item item) {
        this.item = item;
        this.count = 1.0;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        if (count < 0) {
            throw new CountNegative(count + " for " + item.getName() + " is negative");
        } else {
            this.count = count;
        }
    }

    public Item getItem() {
        return item;
    }

    Double getTotal() {
        return item.getPrice() * count;
    }

    @Override
    public String toStringShort () {return item.getName();}

        @Override
        public String toStringLong () {
            String s = "";

            s += item.toStringLong() + ", ";
            s += count + ", ";
            s += getTotal() ;

            return s;
        }
    }
