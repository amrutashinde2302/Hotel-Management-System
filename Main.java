public class Main {

    public static double calculateRoomCharges(int days, double rate) {
        return days * rate;
    }

    public static double calculateFoodCharges(double foodAmount) {
        return foodAmount;
    }

    public static double calculateGST(double amount) {
        return amount * 0.05;
    }

    public static double calculateDiscount(double amount) {
        return amount * 0.10;
    }

    public static double calculateFinalBill(int days, double rate, double foodAmount) {
        double room = calculateRoomCharges(days, rate);
        double food = calculateFoodCharges(foodAmount);

        double subtotal = room + food;
        double gst = calculateGST(subtotal);
        double discount = calculateDiscount(subtotal);

        return subtotal + gst - discount;
    }

    public static void main(String[] args) {
        int days = 2;
        double rate = 1500;
        double foodAmount = 500;

        double room = calculateRoomCharges(days, rate);
        double food = calculateFoodCharges(foodAmount);
        double subtotal = room + food;
        double gst = calculateGST(subtotal);
        double discount = calculateDiscount(subtotal);
        double finalBill = calculateFinalBill(days, rate, foodAmount);

        System.out.printf("Room Charges: %.2f%n", room);
        System.out.printf("Food Charges: %.2f%n", food);
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("GST (5%%): %.2f%n", gst);
        System.out.printf("Discount (10%%): %.2f%n", discount);
        System.out.printf("Final Payable Amount: %.2f%n", finalBill);
    }
}
