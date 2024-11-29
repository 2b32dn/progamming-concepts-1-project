public class Main {
    public static void main(String[] args) {
        // Instance of GroceryStore
        GroceryStore store = new GroceryStore();

        System.out.println("Available Store Items:");
        for (Item item : store.storeItems) {
            System.out.println(item.getItemName() + " - $" + item.getItemPrice());
        }

        System.out.println("\nAdding items to the cart...");
        store.addItemToCart(new Item("Apple", 2.00));
        store.addItemToCart(new Item("Milk", 3.00));
        store.addItemToCart(new Item("Bread", 3.50));

        System.out.println("\nItems in Cart:");
        for (Item item : store.cart) { // Accessing the cart directly for demonstration
            System.out.println(item.getItemName() + " - $" + item.getItemPrice());
        }

        double totalPrice = store.getTotalPrice();
        System.out.println("\nTotal Price: $" + totalPrice);
    }
}