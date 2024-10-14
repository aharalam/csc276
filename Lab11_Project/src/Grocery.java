public class Grocery {
    private Item[] items;
    public Grocery(Item[] items) {
        this.items = items;
    }

    public double calculateTotalCost() {
        double totalCost = 0.00;

        for (Item item : items) {
            totalCost += item.getPrice();
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Item item1 = new Item("Milk", 2.89);
        Item item2 = new Item("Bread", 1.79);
        Item item3 = new Item("Eggs", 3.29);

        Item[] items = {item1, item2, item3};

        Grocery groceryList = new Grocery(items);

        System.out.printf("Price: $%.2f", groceryList.calculateTotalCost());

    }
}
