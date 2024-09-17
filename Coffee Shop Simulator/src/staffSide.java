public class staffSide extends Inventory {

    public static void restock(double value, int ingredientColumn) {
        
        // Store original ingredient value into temporary variable
        double tempValue = Double.parseDouble(ReadExcel("Sheet1", 2, ingredientColumn));

        // Adds new value to temporary variable and sets cell to updated variable
        WriteExcel("Sheet1", 2, ingredientColumn, tempValue+value);
    }    
    
    public static void subtractIngredients(double value, int ingredientColumn) {

        // Store original ingredient value into temporary variable
        double tempValue = Double.parseDouble(ReadExcel("Sheet1", 2, ingredientColumn));

        // Subtracts temporary variable by new value and sets cell to updated variable
        WriteExcel("Sheet1", 2, ingredientColumn, tempValue-value);
    }

}