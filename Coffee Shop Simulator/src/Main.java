import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ScannerIO = new Scanner(System.in);

        // Ingredient item corresponding to its column number
        HashMap<String, Integer> ingredientMap = new HashMap<>();

        ingredientMap.put("CoffeeBeans", 1);
        ingredientMap.put("Espresso", 2);
        ingredientMap.put("Milk", 3);
        ingredientMap.put("HotWater", 4);
        ingredientMap.put("Chocolate", 5);
        ingredientMap.put("IceCream", 6);
        ingredientMap.put("Whiskey", 7);
        ingredientMap.put("Sugar", 8);
        ingredientMap.put("Cream", 9);

        while (true) {
            System.out.println("Welcome to 'The Daily Grind', we are a 1 month pop-up coffee house. \nAre you entering as a customer of staff?");

            String side = ScannerIO.next();

            // Enter as customer
            if (side.equals("customer")) {
                System.out.println("Welcome! Please take a look at our menu.");

                // Menu Display
                for (String i : customerSide.menu()) 
                    System.out.print(i+"\n");

                System.out.println("Due to store policies, customers are only permitted one drink per person. What would you like today?");

                String orderedItem = ScannerIO.next();
                
                customerSide.order(orderedItem);
                System.out.println();

                continue;
            }

            // Enter as staff
            if (side.equals("staff")) {
                System.out.println("Hi, please manage the supply accordingly:");
                System.out.println("1) Restock");
                System.out.println("2) Display ingredients");
                System.out.println("3) Close Shop");

                int staffChoice = ScannerIO.nextInt();

                // Restock option
                if (staffChoice == 1) {
                    System.out.println("Which ingredient would you like to restock");
                    String restockIngredient = ScannerIO.next();

                    int ingredientColumn = ingredientMap.get(restockIngredient);

                    System.out.println("How much would you like restock?");
                    int value = ScannerIO.nextInt();

                    staffSide.restock(value, ingredientColumn);

                    System.out.println("Supplies have been replenished.");
                    System.out.println();

                    continue;

                }

                // Display inventory supplies option
                if (staffChoice == 2) {
                    for (int i=1; i<=9; i++) {
                        System.out.println(Inventory.ReadExcel("Sheet1", 1, i));
                        System.out.println(Inventory.ReadExcel("Sheet1", 2, i));
                        System.out.println();

                        continue;
                    }
                }

                // Close shop option
                if (staffChoice == 3) {
                    System.out.println("Closing shop for today...");
                    break;
                }
            }
        }

        ScannerIO.close();
    }
}