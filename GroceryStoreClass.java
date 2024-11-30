import java.io.*;
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

  public int getBasketCount() { // return array size
    return basket.size();
  }

  // Methods

  // Method to remove an item from the ArrayList<String> if it matches with the
  // user's input
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

  // Method to count the same item and list them accordingly.
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
    System.out.printf("\n%d Apple\n%d Orange\n%d Banana\n%d Steak\n%d Salmon\n", appleCount, orangeCount,
        bananaCount,
        steakCount, salmonCount);
  }

  // Calculate the total from the array
  public int calculateTotal(ArrayList<String> basket) {
    int total = 0;
    final int apple_price = 1;
    final int orange_price = 2;
    final int banana_price = 3;
    final int steak_price = 5;
    final int salmon_price = 4;

    for (String item : basket) {
      switch (item) {
        case "apple":
          total += apple_price;
          break;
        case "orange":
          total += orange_price;
          break;
        case "banana":
          total += banana_price;
          break;
        case "steak":
          total += steak_price;
          break;
        case "salmon":
          total += salmon_price;
          break;
      }
    }
    return total;
  }

}

public class GroceryStoreClass {

  public static void main(String[] args) throws IOException {

    final String APPLE = "apple";
    final String ORANGE = "orange";
    final String BANANA = "banana";
    final String STEAK = "steak";
    final String SALMON = "salmon";

    String deleteItem, deleteQuestion;
    int itemSelected, totalCost = 0;
    boolean stopAdding = true, startDelete = false;
    GroceryStore grocerystore = new GroceryStore();

    Scanner keyboard = new Scanner(System.in);

    System.out.println("\nWelcome to our store!\n");
    System.out.println("Please select an item among the list to add into your basket: ");
    System.out.println("------------------------------------------------------------- ");
    System.out
        .printf(
            "1) Apple $1 each \n2) Orange $2 each\n3) Banana $3 each\n4) Steak $5 each\n5) Salmon $4 each\nQ) Type -1 to checkout \n");

    // First loop. Ask user to enter the integer to add the item or stop adding
    do {
      System.out.print("\nEnter the available digit or -1 for checkout: ");
      itemSelected = keyboard.nextInt();
      switch (itemSelected) {
        case -1:
          stopAdding = false; // boolean to exit the loop
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

    // Display user's basket after adding the items
    grocerystore.sortBasket(grocerystore.getBasket());

    Scanner input = new Scanner(System.in);
    System.out.println("\nDo you want to remove an item? Enter Y or N: ");
    deleteQuestion = input.nextLine();

    // Ask user to remove an item or not. If Y, enter the loop. If not, go to
    // checkout.

    if (deleteQuestion.toLowerCase().equals("y")) {
      startDelete = true;

      // First Loop. Keep asking the user to type the item's name to delete or q to
      // checkout
      do {

        // Check basket if it is empty or not. If empty, immediately
        // checkout.
        if (grocerystore.getBasketCount() <= 0) {
          startDelete = false;
          break;
        }

        deleteItem = keyboard.nextLine().toLowerCase();
        System.out.println("Type the item to remove from your basket. Type q to checkout or stop removing");
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

    // Calculate total cost of the basket after removing an item or not.
    totalCost = grocerystore.calculateTotal(grocerystore.getBasket());

    System.out.println("\nHere is your receipt.\n");
    System.out.println("Print.\n");
    System.out.println("Print..\n");
    System.out.println("Print...\n");
    System.out.println("Print..\n");
    System.out.println("Print.\n");
    System.out.println("Done! Check your bag (root folder)!\n");

    input.close();
    keyboard.close();

    // Start printing the receipt
    PrintWriter outputFile = new PrintWriter("receipt.txt");

    outputFile.println("Thank you for shopping at our Grocery Store.\n\n");
    outputFile.println("Your basket:");
    for (int i = 0; i < grocerystore.getBasketCount(); i++) {
      outputFile.printf("%2s. %s\n", i + 1, grocerystore.getBasket().get(i));
    }
    outputFile.printf("\nThe total cost of your basket is: $%d\n\n\n", totalCost);

    // Why not.
    outputFile.println(" _");
    outputFile.println("//\\");
    outputFile.println("V  \\");
    outputFile.println(" \\  \\_");
    outputFile.println("  \\,'.`-.");
    outputFile.println("   |\\ `. `.       ");
    outputFile.println("   ( \\  `. `-.                        _,.-:\\");
    outputFile.println("    \\ \\   `.  `-._             __..--' ,-';/");
    outputFile.println("     \\ `.   `-.   `-..___..---'   _.--' ,'/");
    outputFile.println("      `. `.    `-._        __..--'    ,' /");
    outputFile.println("        `. `-_     ``--..''       _.-' ,'");
    outputFile.println("          `-_ `-.___        __,--'   ,'");
    outputFile.println("             `-.__  `----\"\"\"    __.-'");
    outputFile.println("                  `--..____..--'");

    outputFile.println("");
    outputFile.println("");
    outputFile.println("Please visit us another time!");

    outputFile.close();
  }
}