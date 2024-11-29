import java.util.*;

class GroceryStore {
  private ArrayList<String> basket = new ArrayList<>();

  // Setters
  public void setItems(String item) {
    basket.add(item);

  }

  // Getters
  public ArrayList<String> getStoreItems() {
    return basket;
  }
}

public class GroceryStoreClass {

  public static void main(String[] args) {
    int itemSelected, total = 0;
    boolean stopAdding = true;
    GroceryStore grocerystore = new GroceryStore();

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to our store!");
    System.out.println("Please select of the item to add to your basket: ");
    System.out.print("1. Apple ___ 1$ each \n2. Orange ___ 2$ each\n3. Banana ___ 2$ each\n-1. Quit \n");
    do {
      itemSelected = keyboard.nextInt();
      switch (itemSelected) {
        case -1:
          stopAdding = false;
          break;
        case 1:
          grocerystore.setItems("apple");
          break;
        case 2:
          grocerystore.setItems("orange");
          break;
        case 3:
          grocerystore.setItems("banana");
          break;
        default:
          System.out.println("No items were added to the basket");
      }
    } while (stopAdding);

    // System.out.println("These are your items inside your basket: ");
    System.out.println(grocerystore.getStoreItems());
    // System.out.println("Do you want to remove an item?");

    // for (int i = 0; i < basket.size(); i++) {
    // if (basket.get(i) == "apple") {
    // total += 1;
    // } else {
    // total += 2;
    // }
    // }
    // System.out.println(total);
    keyboard.close();
  }
}