import java.util.*;

class GroceryStore {
  private ArrayList<String> basket = new ArrayList<>();

  // Setters
  public void setBasket(ArrayList<String> basket) {
    this.basket = basket;
  }

  public void setItems(String item) {
    basket.add(item);
  }

  // Getters
  public ArrayList<String> getBasket() {
    return basket;
  }

  public int getBasketCount() {
    return basket.size();
  }

  // Methods
  public void removeAnItem(ArrayList<String> arr, String item) {
    Iterator<String> iterator = arr.iterator();
    while (iterator.hasNext()) {
      String index = iterator.next();
      if (index == item) {
        iterator.remove();
        break;
      }
    }
    System.out.println("Your basket has: " + arr);
  }

  public void sortBasket(ArrayList<String> arr) {
    Iterator<String> iterator = arr.iterator();
    int appleCount = 0, orangeCount = 0, bananaCount = 0, steakCount = 0, salmonCount = 0;
    while (iterator.hasNext()) {
      String index = iterator.next();
      if (index == "apple") {
        appleCount++;
      } else if (index == "orange") {
        orangeCount++;
      } else if (index == "banana") {
        bananaCount++;
      } else if (index == "steak") {
        steakCount++;
      } else {
        salmonCount++;
      }
    }
    System.out.println("\nThese are your items inside your basket: ");
    System.out.println("------------------------------------------");
    System.out.printf("\n%dx Apple\n%dx Orange\n%dx Banana\n%dx Steak\n%dx Salmon\n", appleCount, orangeCount,
        bananaCount,
        steakCount, salmonCount);
  }
}

public class GroceryStoreClass {

  public static void main(String[] args) {

    final String APPLE = "apple";
    final String ORANGE = "orange";
    final String BANANA = "banana";
    final String STEAK = "steak";
    final String SALMON = "salmon";

    String deleteItem, deleteQuestion;
    int itemSelected, total = 0;
    boolean stopAdding = true, startDelete = false;
    GroceryStore grocerystore = new GroceryStore();

    Scanner keyboard = new Scanner(System.in);

    System.out.println("\nWelcome to our store!\n");
    System.out.println("Please select an item among the list to add into your basket: ");
    System.out.println("------------------------------------------------------------- ");
    System.out
        .printf(
            "1) Apple $1 each \n2) Orange $2 each\n3) Banana $3 each\n4) Steak $5 each\n5) Salmon $4 each\nQ) Type -1 to checkout \n");
    do {
      System.out.print("\nEnter the available digit or -1 for checkout: ");
      itemSelected = keyboard.nextInt();
      switch (itemSelected) {
        case -1:
          stopAdding = false;
          break;
        case 1:
          grocerystore.setItems(APPLE);
          System.out.println("\nOne apple has been added into your basket.");
          System.out.printf("Your basket has: %s\n", grocerystore.getBasket());
          break;
        case 2:
          grocerystore.setItems(ORANGE);
          System.out.println("\nOne orange has been added into your basket.");
          System.out.printf("Your basket has: %s\n", grocerystore.getBasket());
          break;
        case 3:
          grocerystore.setItems(BANANA);
          System.out.println("\nOne banana has been added into your basket.");
          System.out.printf("Your basket has: %s\n", grocerystore.getBasket());
          break;
        case 4:
          grocerystore.setItems(STEAK);
          System.out.println("\nOne steak has been added into your basket.");
          System.out.printf("Your basket has: %s\n", grocerystore.getBasket());
          break;
        case 5:
          grocerystore.setItems(SALMON);
          System.out.println("\nOne salmon has been added into your basket.");
          System.out.printf("Your basket has: %s\n", grocerystore.getBasket());
          break;
        default:
          System.out.printf("\nYour basket has: %s\n", grocerystore.getBasket());
          System.out.println("No items were added to the basket\n");
      }
    } while (stopAdding);

    // System.out.println("\nThese are your items inside your basket: ");
    // for (int i = 0; i < grocerystore.getBasketCount(); i++) {
    // System.out.printf("%2s. %s\n", i + 1, grocerystore.getBasket().get(i));
    // }

    grocerystore.sortBasket(grocerystore.getBasket());

    Scanner input = new Scanner(System.in);
    System.out.println("\nDo you want to remove an item? Enter Y or N: ");
    deleteQuestion = input.nextLine();

    if (deleteQuestion.toLowerCase().equals("y")) {
      startDelete = true;
      System.out.println("Type the item to be remove from the basket or \"q\" to quit: ");
      do {
        if (grocerystore.getBasketCount() <= 0) {
          startDelete = false;
          break;
        }
        deleteItem = keyboard.nextLine().toLowerCase();
        switch (deleteItem) {
          case "q":
            startDelete = false;
            break;
          case APPLE:
            grocerystore.removeAnItem(grocerystore.getBasket(), APPLE);
            break;
          case ORANGE:
            grocerystore.removeAnItem(grocerystore.getBasket(), ORANGE);
            break;
          case BANANA:
            grocerystore.removeAnItem(grocerystore.getBasket(), BANANA);
            break;
          case STEAK:
            grocerystore.removeAnItem(grocerystore.getBasket(), STEAK);
            break;
          case SALMON:
            grocerystore.removeAnItem(grocerystore.getBasket(), SALMON);
            break;
        }
      } while (startDelete);
    } else {
      startDelete = false;
    }

    grocerystore.sortBasket(grocerystore.getBasket());

    // for (int i = 0; i < basket.size(); i++) {
    // if (basket.get(i) == "apple") {
    // total += 1;
    // } else {
    // total += 2;
    // }
    // }
    // System.out.println(total);
    input.close();
    keyboard.close();
  }
}