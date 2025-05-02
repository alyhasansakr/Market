import Exceptions.UnknownOperation;

import java.util.Scanner;

public class Main {

    static ItemManager itemManager = new ItemManager();
    static OrderManager orderManager = new OrderManager();

    static Scanner scanner = new Scanner(System.in);

    //handle item operations
    static void itemOperation() {
        System.out.print("Choose operation (add, remove, edit, print): ");
        String op = scanner.next();
        if (op.equals("add")) {
            itemManager.addItem();
        } else if (op.equals("remove")) {
            itemManager.removeItem();
        } else if (op.equals("edit")) {
            itemManager.editItem();
        } else if (op.equals("print")) {
            itemManager.printItems();
        } else {
            throw new UnknownOperation(op + " is not an operation!");
        }
    }

    //handle order operations
    static void orderOperation() {
        System.out.print("Choose operation (new, add, remove, print): ");
        String op = scanner.next();

        if (op.equals("new")) {
            orderManager.newOrder();
        } else if (op.equals("add")) {
            orderManager.addItemLine();
        } else if (op.equals("remove")) {
            orderManager.removeItemLine();
        } else if (op.equals("print")) {
            orderManager.printOrder();
        } else {
            throw new UnknownOperation(op + " is not an operation!");
        }
    }

    //Main entry to application
    public static void main(String[] args) {
        System.out.println("Welcome to store management system");

        String ans;

        do {
            try {
                System.out.print("Operation selection (item, order): ");
                String op = scanner.next();

                if (op.equals("item")) {
                    itemOperation();
                } else if(op.equals("order")) {
                    orderOperation();
                } else {
                    throw new UnknownOperation(op + " is not an operation!");
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }

            System.out.println("Do you wish to continue? (y/n)");
            ans = scanner.next();
        } while (ans.equals("y"));
    }
}