public class Item {
    private String name;
    private Double price;

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
    public String toString() {
        String s = "";

        s += name + ", ";
        s += price + ", ";

        return s;
    }
}
