import javax.swing.border.Border;
import java.util.ArrayList;

public class Order implements Printable {
    private ArrayList<ItemLine> itemLines = new ArrayList<>();
    
    /*public ArrayList<ItemLine> getItemLines() {
        return itemLines;
    }*/

    /*public void setItemLines(ArrayList<ItemLine> itemLines) {
        this.itemLines = itemLines;
    }*/

    public Order() {
        //itemLines = new ArrayList<>();
    }

    public void addItemLine(ItemLine itemLine) {
        itemLines.add(itemLine);
    }

    public void removeItemLine(int index) {
        itemLines.remove(index);
    }

    Double getTotal() {
        Double sum = 0.0;
        for (int i = 0; i < itemLines.size(); i++) {
            sum += itemLines.get(i).getTotal();
        }
        return sum;
    }

    @Override
    public String toStringShort () {return "";}

        @Override
        public String toStringLong () {

            String s = "";

            s += "id: name, price, count, total";
            s += "\n";

            for (int i = 0; i < itemLines.size(); i++) {
                s += i + ": ";
                s += itemLines.get(i).toStringLong();
                s += "\n";
            }

            s += "Total: " + getTotal();
            s += "\n";

            return s;
        }
    }
