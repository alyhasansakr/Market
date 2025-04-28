import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {

    ArrayList<Item> items = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addItem() {
        System.out.print("Enter item name: ");
        String name = scanner.next();

        System.out.print("Enter item price: ");
        Double price = scanner.nextDouble();

        Item item = new Item(name, price);
        items.add(item);
    }

    void printItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ": " + items.get(i).getName() + ", " + items.get(i).getPrice());
        }
    }

    void removeItem() {
        printItems();

        System.out.print("Enter item id to remove: ");
        int index = scanner.nextInt();

        items.remove(index);
    }

    void editItem() {
        printItems();

        System.out.print("Enter item id to edit: ");
        int index = scanner.nextInt();

        System.out.print("Enter item name: ");
        String name = scanner.next();

        System.out.print("Enter item price: ");
        Double price = scanner.nextDouble();

        Item item = items.get(index);
        item.setName(name);
        item.setPrice(price);
    }
}
