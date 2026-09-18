package main.week2.assignment_problems;
public class ProductInventoryCSVParser {

    static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String product = fields[0].trim();
        String sku = fields[1].trim();
        String quantity = fields[2].trim();

        System.out.println("Product: " + product + " | SKU: " + sku + " | Qty: " + quantity);
    }

    public static void main(String[] args) {
        parseInventoryRecord("Wireless Mouse, WM-2201,150");
        parseInventoryRecord("Wireless Mouse, 150");
    }
}