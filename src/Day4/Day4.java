package Day4;

import Day2.Order;

public class Day4 {
    public static void main(String[] args) {

        Stock stock = new Stock();

        // Create checkers
        StockChecker stockChecker = new StockChecker(stock);
        FraudChecker fraudChecker = new FraudChecker();
        DiscountChecker discountChecker = new DiscountChecker();

        stockChecker.setNextChecker(fraudChecker);
        fraudChecker.setNextChecker(discountChecker);

        Order order = new Order.OrderBuilder("Laptop", "Ahmedabad")
                .withDiscountCode("DISCOUNT10")
                .withDeliveryNotes("Normal delivery")
                .build();

        stockChecker.handleCheck(order);
    }
}
