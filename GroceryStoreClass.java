import java.util.*;

class GroceryStore {
}

public class GroceryStoreClass {

  public static void main(String[] args) {
    ArrayList<String> basket = new ArrayList<>();
    int itemSelected, total = 0;
    boolean stopAdding = true;
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
          basket.add("apple");
          break;
        case 2:
          basket.add("orange");
          break;
        case 3:
          basket.add("banana");
          break;
        default:
          System.out.println("No items were added to the basket");
      }
    } while (stopAdding);

    for (int i = 0; i < basket.size(); i++) {
      if (basket.get(i) == "apple") {
        total += 1;
      } else {
        total += 2;
      }
    }
    System.out.println(total);
    keyboard.close();
  }
}