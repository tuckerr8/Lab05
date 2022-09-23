public class ShipCostCalc {
    public static void main(String[] args) {
        double price = 100;
        double shippingCost;
        double totalCost;

        shippingCost = price * .02;

        if (price >= 100) {
            System.out.println("Shipping is free. Yay!");
        } else if (price < 100) {
            System.out.println("Your shipping cost is: " + shippingCost);
        }
    }
}