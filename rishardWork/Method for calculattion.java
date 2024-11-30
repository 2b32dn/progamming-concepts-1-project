 //Method to calculate the total of the basket (to be added into the class)

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




// Call the method on the main after sorting the basket 

    int totalCost = grocerystore.calculateTotal(grocerystore.getBasket());
        System.out.println("\nThe total cost of your basket is: $" + totalCost);