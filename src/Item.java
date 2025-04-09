public class Item {
    String name;
    Double price;

    @Override
    public String toString() {
        String s = "";

        s += name + ", ";
        s += price + ", ";

        return s;
    }
}
