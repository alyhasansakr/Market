import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager {
    Order order = new Order();

    Scanner scanner = new Scanner(System.in);

    void addItemLine() {
        Main.itemManager.printItems();

        System.out.print("Enter item id to add: ");
        int index = scanner.nextInt();

        System.out.print("Enter item count: ");
        Double count = scanner.nextDouble();

        Item item = Main.itemManager.items.get(index);
        ItemLine itemLine = new ItemLine(item, count);
        //ItemLine itemLine1 = new ItemLine(item);
        //itemLine1.setCount(count);
        //order.getItemLines().add(itemLine);
        order.addItemLine(itemLine);
    }

    void printOrder() {
        System.out.println(order.toStringLong());
    }

    void removeItemLine() {
        printOrder();

        System.out.print("Enter item id to remove: ");
        int index = scanner.nextInt();

        //order.getItemLines().remove(index);
        order.removeItemLine(index);
    }

    void newOrder() {
        order = new Order();
    }
}
