import java.util.Iterator;

public class ShoppingApp {
    public static void main(String[] args) {
        LinkedList<Item> shoppingList = new LinkedList<>();

        shoppingList.add(new Drink("Mineralwasser", 0.79, 0.5));
        shoppingList.add(new Food("Schokolade", 1.0, 0.125));
        shoppingList.add(new Drink("Fanta", 1.39, 1.0));
        shoppingList.add(new Drink("Cola", 1.49, 1.0));
        shoppingList.add(new Food("Brot", 2.39, 0.5));
        shoppingList.add(new Food("Schinken", 17.49, 1.0));

        System.out.println("Shopping List (Forward):");
        for (Item item : shoppingList) {
            System.out.println(item);
        }

        System.out.println("\nShopping List (Reverse):");
        Iterator<Item> reverseIterator = shoppingList.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        LinkedList<Item> below2Euro = shoppingList.below(new Food("Any", 2.0, 0));
        System.out.println("\nItems below 2.0 EUR:");
        for (Item item : below2Euro) {
            System.out.println(item);
        }

        LinkedList<Item> above1Euro = shoppingList.above(new Food("Any", 1.0, 0));
        System.out.println("\nItems above 1.0 EUR:");
        for (Item item : above1Euro) {
            System.out.println(item);
        }
    }
}
