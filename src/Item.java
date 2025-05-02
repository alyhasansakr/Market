public class Item implements Printable {
    private String name;
    private Double price;

    /*public Item() {
        System.out.println("Item Created");
    }*/

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toStringShort() {return name;}

    @Override
    public String toStringLong() {
        String s = "";

        s += getName() + ", ";
        s += getPrice();

        return s;
    }
}
