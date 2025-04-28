public class Item {
    private String name;
    private Double price;
    private ItemType type;

    /*public Item() {
        System.out.println("Item Created");
    }*/

    public Item(String name, Double price, ItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    /*public void setPrice(Double newPrice) {
        price = newPrice;
    }*/

    public void setPrice(Double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String s = "";

        s += name + ", ";
        s += price + ", ";

        return s;
    }
}
