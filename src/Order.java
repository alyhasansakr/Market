import java.util.ArrayList;

public class Order {
    ArrayList<ItemLine> itemLines = new ArrayList<>();

    Double getTotal() {
        Double sum = 0.0;
        for (int i = 0; i < itemLines.size(); i++) {
            sum += itemLines.get(i).getTotal();
        }
        return sum;
    }

    @Override
    public String toString() {

        String s = "";

        s += "id: name, price, count, total";
        s += "\n";

        for (int i = 0; i < itemLines.size(); i++) {
            s += i + ": ";
            s += itemLines.get(i).toString();
            s += "\n";
        }

        s += "Total: " + getTotal();
        s += "\n";

        return s;
    }
}
