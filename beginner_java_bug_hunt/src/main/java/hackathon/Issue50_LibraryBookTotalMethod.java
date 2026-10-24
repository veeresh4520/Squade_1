public class Issue50_LibraryBookTotalMethod {
    public static void main(String[] args) {
        int unitFee = 40;
        int quantity = 8;
        int discountPercent = 15;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
