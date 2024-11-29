import java.util.ArrayList;

public class GroceryStore {
  ArrayList<Item> storeItems;
  ArrayList<Item> cart;

  public class Item {
    private String itemName;
    private double itemPrice;

    // Constructor to initiate item and price.
    public Item(String itemName, double itemPrice) {
      this.itemName = itemName;
      this.itemPrice = itemPrice;
    }

    // Getters and Setters
    public double getItemPrice() {
      return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
      this.itemPrice = itemPrice;
    }

    public String getItemName() {
      return itemName;
    }

    public void setItemName(String itemName) {
      this.itemName = itemName;
    }
  }

  // Constructor
  public GroceryStore() {
    this.storeItems = new ArrayList<>();
    this.cart = new ArrayList<>();
    populatedItems();

  }

  public void populatedItems() {
    storeItems.add(new Item("Apple", 2.00));
    storeItems.add(new Item("Banana", 1.00));
    storeItems.add(new Item("Milk", 3.00));
    storeItems.add(new Item("Bread", 3.50));
    storeItems.add(new Item("Cheese", 2.00));

  }

  public void addItemToCart(Item item) {
    this.cart.add(item);
  }

  // public void removeItemFromCart(Item item) {
  // this.cart.remove(item);
  // }
  // Method to Calculate total
  public double getTotalPrice() {
    double totalPrice = 0.0;
    for (Item item : this.cart) {
      totalPrice += item.getItemPrice();
    }
    return totalPrice;
  }
}
