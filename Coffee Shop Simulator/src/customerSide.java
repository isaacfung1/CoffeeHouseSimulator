public class customerSide extends Inventory {
    
    public static String[] menu() {
        String black = "Black";
        String latte = "Latte";
        String cappuccino = "Cappuccino";
        String americano = "Americano";
        String espresso = "Espresso";
        String doppio = "Doppio";
        String cortado = "Cortado";
        String red_eye = "RedEye";
        String galao = "Galao";
        String lungo = "Lungo";
        String macchiato = "Macchiato";
        String mocha = "Mocha";
        String ristretto = "Ristretto";
        String flat_white = "FlatWhite";
        String affogato = "Affogato";
        String cafe_au_lait = "CafeAuLait";
        String irish = "Irish";
        
        String[] items = {black, latte, cappuccino, americano, espresso, doppio, cortado, red_eye, galao, lungo, macchiato, mocha,
             ristretto, flat_white, affogato, cafe_au_lait, irish};

        return items;
        
    }

    public static void order(String orderedItem) {

        String available = "Thank you for ordering at 'The Daily Grind'. Your order for 1 "+orderedItem+", is ready!";
        
        // ITEM: Black Coffee
        if (orderedItem.equals(menu()[0])) {
            // Coffee beans
            staffSide.subtractIngredients(0.05, 1);
            // Hot water
            staffSide.subtractIngredients(0.1, 4);
            System.out.println(available);
        }

        // ITEM: Latte
        else if (orderedItem.equals(menu()[1])) {
            // Espresso
            staffSide.subtractIngredients(2, 2);
            // Milk
            staffSide.subtractIngredients(0.1, 3);
            System.out.println(available);
        }

        // ITEM: Cappuccino
        else if (orderedItem.equals(menu()[2])) {
            // Espresso
            staffSide.subtractIngredients(2, 2);
            // Milk
            staffSide.subtractIngredients(0.15, 3);
            System.out.println(available);
        }

        // ITEM: Americano
        else if (orderedItem.equals(menu()[3])) {
            // Espresso
            staffSide.subtractIngredients(2, 2);
            // Hot water
            staffSide.subtractIngredients(0.1, 4);
            System.out.println(available);
        }

        // ITEM: Espresso
        else if (orderedItem.equals(menu()[4])) {
            // Espresso
            staffSide.subtractIngredients(1, 2);
            System.out.println(available);
        }

        // ITEM: Doppio
        else if (orderedItem.equals(menu()[5])) {
            // Espresso
            staffSide.subtractIngredients(2, 2);
            System.out.println(available);
        }

        // ITEM: Cortado
        else if (orderedItem.equals(menu()[6])) {
            // Espresso
            staffSide.subtractIngredients(1, 2);
            // Milk
            staffSide.subtractIngredients(0.05, 3);
            System.out.println(available);
        }

        // ITEM: Red Eye
        else if (orderedItem.equals(menu()[7])) {
            // Coffee beans
            staffSide.subtractIngredients(0.05, 1);
            // Hot water
            staffSide.subtractIngredients(0.1, 4);
            // Espresso
            staffSide.subtractIngredients(1, 2);
            System.out.println(available);
        }

        // ITEM: Galao
        else if (orderedItem.equals(menu()[8])) {
            // Espresso
            staffSide.subtractIngredients(2, 2);
            // Milk
            staffSide.subtractIngredients(0.15, 3);
            System.out.println(available);
        }

        // ITEM: Lungo
        else if (orderedItem.equals(menu()[9])) {
            // Espresso
            staffSide.subtractIngredients(3, 2);
            System.out.println(available);
        }

        // ITEM: Macchiato
        else if (orderedItem.equals(menu()[10])) {
            // Espresso
            staffSide.subtractIngredients(1, 2);
            // Milk
            staffSide.subtractIngredients(0.05, 3);
            System.out.println(available);
        }
        
        // ITEM: Mocha
        else if (orderedItem.equals(menu()[11])) {
            // Espresso
            staffSide.subtractIngredients(1, 2);
            // Chocolate
            staffSide.subtractIngredients(0.05, 5);
            // Milk
            staffSide.subtractIngredients(0.1, 3);
            System.out.println(available);
        }

        // ITEM: Ristretto
        else if (orderedItem.equals(menu()[12])) {
            // Espresso
            staffSide.subtractIngredients(0.5, 2);
            System.out.println(available);
        }

        // ITEM: Flat White
        else if (orderedItem.equals(menu()[13])) {
            // Espresso
            staffSide.subtractIngredients(2, 2);
            // Milk
            staffSide.subtractIngredients(0.1, 3);
            System.out.println(available);
        }

        // ITEM: Affogato
        else if (orderedItem.equals(menu()[14])) {
            // Espresso
            staffSide.subtractIngredients(1, 2);
            // Ice cream
            staffSide.subtractIngredients(0.1, 6);
            System.out.println(available);
        }   

        // ITEM: Cafe Au Lait
        else if (orderedItem.equals(menu()[15])) {
            // Coffee beans
            staffSide.subtractIngredients(0.05, 1);
            // Hot water
            staffSide.subtractIngredients(0.05, 4);
            // Milk
            staffSide.subtractIngredients(0.1, 3);
            System.out.println(available);
        }

        // ITEM: Irish
        else if (orderedItem.equals(menu()[16])) {
            // Coffee beans
            staffSide.subtractIngredients(0.05, 1);
            // Hot water
            staffSide.subtractIngredients(0.05, 4);
            // Whiskey
            staffSide.subtractIngredients(0.01, 7);
            // Sugar
            staffSide.subtractIngredients(0.03, 8);
            // Cream
            staffSide.subtractIngredients(0.03, 9);
            System.out.println(available);
        }

        else {
            System.out.println("Apologies, your order is not on our menu.");
        }
    }
}
