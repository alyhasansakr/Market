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

        ItemLine itemLine = new ItemLine();
        itemLine.item = Main.itemManager.items.get(index);
        itemLine.count = count;
        order.itemLines.add(itemLine);
    }

    void printOrder() {
        System.out.println(order.toString());
    }

    void removeItemLine() {
        printOrder();

        System.out.print("Enter item id to remove: ");
        int index = scanner.nextInt();

        order.itemLines.remove(index);
    }

    void newOrder() {
        order = new Order();
    }
}
